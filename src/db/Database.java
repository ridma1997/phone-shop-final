package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Database {

    private static Connection c;

    private static String host, user, dbName, password, port;

    private static synchronized void setUpConnection() throws Exception {
        setData();
        Class.forName("com.mysql.cj.jdbc.Driver");
        //c = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbName,user,password);
        c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mobie_phone_shop_er", "root", "");
    }

    public static Connection getConnection() throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c;
    }

    public static synchronized int iud(String query) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeUpdate(query);

    }

    public static synchronized ResultSet search(String query) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(query);

    }

    private static void setData() throws Exception {

        BufferedReader hostRead = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/host.mobsys")));
        BufferedReader portRead = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/port.mobsys")));
        BufferedReader dbNameRead = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/dbName.mobsys")));
        BufferedReader passwordRead = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/pwd.mobsys")));
        BufferedReader userRead = new BufferedReader(new FileReader(new File("F:/MOBSYS/db/detail/user.mobsys")));

        String hostL;
        String portL;
        String nameL;
        String passL;
        String userL;

        while ((hostL = hostRead.readLine()) != null) {
            Database.host = hostL;
            //System.out.println(host);
        }
        while ((portL = portRead.readLine()) != null) {
            Database.port = portL;
            //System.out.println(port);
        }
        while ((nameL = dbNameRead.readLine()) != null) {
            Database.dbName = nameL;
            //System.out.println(dbName);
        }
        while ((passL = passwordRead.readLine()) != null) {
            Database.password = passL;
            //System.out.println(password);
        }
        while ((userL = userRead.readLine()) != null) {
            Database.user = userL;
            //System.out.println(user);
        }

    }

    public static String getHost() throws Exception {
        if (Database.host == null || Database.host.equals("")) {
            setData();
        }
        return Database.host;
    }

    public static String getUser() throws Exception {
        if (Database.user == null || Database.user.equals("")) {
            setData();
        }
        return Database.user;
    }

    public static String getDbName() throws Exception {
        if (Database.dbName == null || Database.dbName.equals("")) {
            setData();
        }
        return Database.dbName;
    }

    public static String getPassword() throws Exception {
        if (Database.password == null || Database.password.equals("")) {
            setData();
        }
        return Database.password;
    }

    public static String getPort() throws Exception {
        if (Database.port == null || Database.port.equals("")) {
            setData();
        }
        return Database.port;
    }

    public static void main(String[] args) {
        try {
            setUpConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
