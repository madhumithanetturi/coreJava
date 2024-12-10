package com.neoteric.JDBCConnection;

import java.sql.*;

public class DBConnection {

    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","sonar","sonar");

            System.out.println("Connected to the database successfully! ");

            Statement statement =  connection.createStatement();

            ResultSet resultSet= statement.executeQuery("select * from sonar.Project y inner join sonar.Employee m ON y.id=m.pid2");

            while (resultSet.next()){
                int id = resultSet.getInt("Empid");
                String name =resultSet.getString("Name");
                String dept = resultSet.getString("Dept");
                String salary = resultSet.getString("Salary");

                System.out.println(id);
                System.out.println(name);
                System.out.println(dept);
                System.out.println(salary);
            }

            connection.close();
        }catch (ClassNotFoundException e){

            System.err.println("MySQL Driver not found: "+e.getMessage());
        }catch (SQLException e){

            System.err.println("SQL Exception: "+ e.getMessage());
        }
    }
}
