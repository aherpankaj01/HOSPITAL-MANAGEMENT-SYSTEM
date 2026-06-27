package com.jsp.hospital.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HospitalRepo {

    static Scanner sc = new Scanner(System.in);
    static Connection conn;

    static {

        String url = "jdbc:postgresql://localhost:5432/hospital";
        String username = "postgres";
        String password = "root";

        try {

            conn = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

  
    public static void insertData() {

        String query = "INSERT INTO hospital VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = conn.prepareStatement(query);

            System.out.println("Enter Patient ID:");
            int id = sc.nextInt();

            System.out.println("Enter First Name:");
            String firstName = sc.next();

            System.out.println("Enter Last Name:");
            String lastName = sc.next();

            System.out.println("Enter Age:");
            int age = sc.nextInt();

            System.out.println("Enter Admit Date (yyyy-mm-dd):");
            String admit = sc.next();

            System.out.println("Enter Illness:");
            String illness = sc.next();

            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setInt(4, age);
            ps.setDate(5, Date.valueOf(admit));
            ps.setString(6, illness);

            ps.executeUpdate();

            System.out.println("Patient Added Successfully.");

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

 
    public static void updateData() {

        String query = "UPDATE hospital SET first_name=?, last_name=?, age=?, admit_date=?, illness=? WHERE patient_id=?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);

            System.out.println("Enter Updated First Name:");
            String firstName = sc.next();

            System.out.println("Enter Updated Last Name:");
            String lastName = sc.next();

            System.out.println("Enter Updated Age:");
            int age = sc.nextInt();

            System.out.println("Enter Updated Admit Date (yyyy-mm-dd):");
            String admit = sc.next();

            System.out.println("Enter Updated Illness:");
            String illness = sc.next();

            System.out.println("Enter Patient ID:");
            int id = sc.nextInt();

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setInt(3, age);
            ps.setDate(4, Date.valueOf(admit));
            ps.setString(5, illness);
            ps.setInt(6, id);

            ps.executeUpdate();

            System.out.println("Patient Updated Successfully.");

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

 
    public static void deleteData() {

        String query = "DELETE FROM hospital WHERE patient_id=?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);

            System.out.println("Enter Patient ID:");
            int id = sc.nextInt();

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Patient Deleted Successfully.");

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

 
    public static void fetchData() {

        String query = "SELECT * FROM hospital";

        try {

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("--------------------------------");

                System.out.println("Patient ID : " + rs.getInt("patient_id"));
                System.out.println("First Name : " + rs.getString("first_name"));
                System.out.println("Last Name  : " + rs.getString("last_name"));
                System.out.println("Age        : " + rs.getInt("age"));
                System.out.println("Admit Date : " + rs.getDate("admit_date"));
                System.out.println("Illness    : " + rs.getString("illness"));
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

}