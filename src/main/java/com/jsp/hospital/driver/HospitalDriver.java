package com.jsp.hospital.driver;

import java.util.Scanner;

import com.jsp.hospital.repo.HospitalRepo;

public class HospitalDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("======================================");
        System.out.println("   HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("======================================");

        while (flag) {

            System.out.println("\nChoose an Option");
            System.out.println("1. Add New Patient");
            System.out.println("2. Update Patient Details");
            System.out.println("3. Delete Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    HospitalRepo.insertData();
                    System.out.println("\nPatient Added Successfully.");
                    break;

                case 2:
                    HospitalRepo.updateData();
                    System.out.println("\nPatient Details Updated Successfully.");
                    break;

                case 3:
                    HospitalRepo.deleteData();
                    System.out.println("\nPatient Deleted Successfully.");
                    break;

                case 4:
                    System.out.println("\n========== Patient Records ==========");
                    HospitalRepo.fetchData();
                    break;

                case 5:

                    System.out.print("Are you sure you want to exit? (Y/N): ");
                    char ch = sc.next().toUpperCase().charAt(0);

                    if (ch == 'Y') {
                        flag = false;
                        System.out.println("\nThank you for using Hospital Management System.");
                    }

                    break;

                default:
                    System.out.println("\nInvalid Choice! Please enter a number between 1 and 5.");
            }
        }

        sc.close();
    }
}
