package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDatabase {

    private static Connection c;

    private static String host, user, dbName, password, port;

    private static synchronized void setUpConnection() throws Exception {
        //setData();
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbName, user, password);
        //c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/phone-shop","root","123");
    }

    public static Connection getConnection() throws Exception {
        setUpConnection();
        return c;
    }

    
    public static void setData(String host1,String user1,String port1,String db,String password1)throws Exception{
        TestDatabase.user = user1;
        TestDatabase.host = host1;
        TestDatabase.password = password1;
        TestDatabase.dbName = db;
        TestDatabase.port = port1;
        setUpConnection();
    }

    public static void main(String[] args) {
        try {
            //setUpConnection();
            setData("dffv gf f", "root", "3306", "mobie_phone_shop_er", "");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
