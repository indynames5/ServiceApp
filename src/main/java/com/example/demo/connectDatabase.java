package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class connectDatabase {
    
    List<Review> review;
    List<AppData> app;
    Connection conn=null;
    
    
    
    public List<Review> getReview() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<Review> reviews = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.data";
        try{ 
            String url = "jdbc:mysql://localhost/googleplay";
            String password = "014789";
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            reviews.add( new Review(  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return reviews;
    }
    
    public List<AppData> getApp() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<AppData> app = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.store";
        String url = "jdbc:mysql://localhost/googleplay";
        String password = "014789";
        try{
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            app.add( new AppData (  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getString(10),
                                rs.getString(11),
                                rs.getString(12),
                                rs.getString(13)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return app;
    }
    
    public List<AppData> getAppGategory(String category) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<AppData> app = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.store where category like +'%"+category+"%'";
        String url = "jdbc:mysql://localhost/googleplay";
        String password = "014789";
        try{
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            app.add( new AppData (  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getString(10),
                                rs.getString(11),
                                rs.getString(12),
                                rs.getString(13)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return app;
    }
    
    public List<AppData> getAppName(String name) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<AppData> app = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.store where app like +'%"+name+"%'";
        String url = "jdbc:mysql://localhost/googleplay";
        String password = "014789";
        try{
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            app.add( new AppData (  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getString(10),
                                rs.getString(11),
                                rs.getString(12),
                                rs.getString(13)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return app;
    }
    
    public List<AppData> getAppType(String type) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<AppData> app = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.store WHERE type = '"+type+"' ORDER BY installs desc,price desc;";
        String url = "jdbc:mysql://localhost/googleplay";
        String password = "014789";
        try{
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            app.add( new AppData (  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getString(10),
                                rs.getString(11),
                                rs.getString(12),
                                rs.getString(13)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return app;
    }
    
    public List<AppData> getAppInstall() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        List<AppData> app = new ArrayList<>();
        String sql = "SELECT * FROM googleplay.store ORDER BY installs DESC,app ASC;";
        String url = "jdbc:mysql://localhost/googleplay";
        String password = "014789";
        try{
            conn = DriverManager.getConnection(url,"new",password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            app.add( new AppData (  rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getString(10),
                                rs.getString(11),
                                rs.getString(12),
                                rs.getString(13)   ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return app;
    }
    
    
}
