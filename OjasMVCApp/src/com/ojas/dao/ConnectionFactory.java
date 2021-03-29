package com.ojas.dao;
import java.sql.*;
public class ConnectionFactory {
      static Connection getConn() {
    	  Connection con = null;
    	  try {
    		  Class.forName("com.mysql.jdbc.Driver");
    		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojasemployees","root","root");
    		  System.out.println(con + "connected successfully");
    	  }
    	  catch(Exception e) {
    		  System.out.println(e);
    	  }
    	  
    	  return con;
      }
}
