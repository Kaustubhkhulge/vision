package com.salesxl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:postgresql://localhost/";
   static final String USER = "postgres";
   static final String PASS = "Kaustubh@123";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {
         //Statement statement = connection.createStatement();

//create database if it doesn't exist
//That is, sending a create table mysql command to the database server.
         String sql = "CREATE DATABASE STUDENTS1";
         stmt.executeUpdate(sql);
         //System.out.println("Database created successfully...");
//create table if it doesn't exist. This was a example I used. You can change the table definition as you want.
//this will send the create table sql statement to be executed in the mysql server
         stmt.execute("CREATE TABLE STUDENTS1.`saveddata` (\n"
                 + "  `INDEX` int(10) NOT NULL AUTO_INCREMENT,\n"
                 + "  `FILENAME` varchar(100) DEFAULT NULL,\n"
                 + "  `TABLENAME` varchar(100) DEFAULT NULL,\n"
                 + "  `TIMESTAMP` varchar(50) DEFAULT NULL,\n"
                 + "  PRIMARY KEY (`INDEX`)\n"
                 + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;");
         conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}