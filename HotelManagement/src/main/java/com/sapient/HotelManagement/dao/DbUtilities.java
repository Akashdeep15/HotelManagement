package com.sapient.HotelManagement.dao;

	

	import java.io.FileReader;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Properties;

	public class DbUtilities {
	    private  static  final String driver_class="driver.class.name";
	    private static final String url="mysql.url";
	    private static final String user="mysql.user";
	    private static final String password="mysql.password";
	    private static  Connection connection = null;
	    private  static  Properties DB_PROPERTES=null;



	    static {

	        try {
	          DB_PROPERTES=new Properties();
	          DB_PROPERTES.load(new FileReader("src/main/resources/HotelDb.properties"));
	          Class.forName(DB_PROPERTES.getProperty(driver_class));
	          connection= DriverManager.getConnection(DB_PROPERTES.getProperty(url),DB_PROPERTES.getProperty(user),DB_PROPERTES.getProperty(password));


	        }
	        catch (IOException | SQLException | ClassNotFoundException e){
	            e.printStackTrace();
	        }

	    }
	    public static Connection getConnection(){
	        return connection;
	    }

	}



