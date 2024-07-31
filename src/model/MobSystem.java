package model;

import db.Database;
import gui.Home;
import gui.Login;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MobSystem {

    private static String logUser;
    private static String lockUser;
    private static String userType;
    private static String systemState;
    private static String userName;
    private static String logDate;
    private static String logTime;

    public static String getLogDate() {
        return logDate;
    }

    public static void setLogDate(String logDate) {
        MobSystem.logDate = logDate;
    }

    public static String getLogTime() {
        return logTime;
    }

    public static void setLogTime(String logTime) {
        MobSystem.logTime = logTime;
    }

    public static void openHome(String user) throws Exception {
        setUserType(user);
        setLogUser(user);
        setData();
        Home.getInstance(Login.getInstance(), 0).setVisible(true);
    }

    public static String getUserType() {
        return userType;
    }

    public static String getSystemState() {
        return MobSystem.systemState;
    }

    public static void setSystemState(String systemState) {
        MobSystem.systemState = systemState;
    }

    public static void setUserType(String user) throws Exception {
        ResultSet rs = Database.search("select * from employee_has_emp_type where emp_id='" + user + "' and status = '1'");
        if (rs.next()) {
            String u = rs.getString("type_id");
            MobSystem.userType = u;
        } else {
            MobSystem.userType = "6";
        }
    }

    public static String getLogUser() {
        //return MobSystem.logUser;
        return logUser;
    }

    public static void setLogUser(String aLogUser) {
        MobSystem.logUser = aLogUser;
    }

    public static String getLockUser() {
        return MobSystem.lockUser;
    }

    public static void setLockUser(String aLockUser) {
        MobSystem.lockUser = aLockUser;
    }

    private static void setData() {
        try {
            String sql = "select e.nic as nic, e.fname as fname, e.lname as lname, et.type_id as type_id, et.name as type_name";
            sql += " from employee e inner join employee_has_emp_type ehet on e.nic = ehet.emp_id ";
            sql += " inner join emp_type et on et.type_id = ehet.type_id where e.nic = '" + logUser + "' and e.status !='2'";
            ResultSet rs = Database.search(sql);
            if (rs.next()) {
                userName = (rs.getString("fname") + " " + rs.getString("lname")).toUpperCase();
                userType = rs.getString("type_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void logoutSystem() throws Exception {
        System.out.println(getLogUser());
        System.out.println(getLogDate());
        System.out.println(getLogTime());
        if (!getLogUser().equals("Admin")) {
            String query = "update log_data set status='" + LogData.LOGOUT_STATE + "',date2='" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "',logout_time='" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "' where emp_id='" + getLogUser() + "' and date1='" + getLogDate() + "' and log_time='" + getLogTime() + "'";
            int i = Database.iud(query);
        } else {
            System.out.println("adminLogout");
        }
    }

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println(new SimpleDateFormat("hh-mm-ss").format(new Date()));
    }
}
