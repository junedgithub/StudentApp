package StudentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
   static Scanner sc = new Scanner(System.in);
    static BussinessLogic bl = new BussinessLogic();
    public static void main(String[] args) {
        boolean status = true;
        bl = new BussinessLogic();
        do {
            System.out.println("Select Mode Of Operation!!");
            System.out.println("1. Add Student!!");
            System.out.println("2. Display Student!!");
            System.out.println("3. Remove Student!!");
            System.out.println("4. Update Student!!");
            System.out.println("5. Search Student by Id!!");
            System.out.println("6. Display Student By Subject!!");
            System.out.println("7. Exit!!");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    displayStudentBySubject();
                    break;
                case 7:
                    status = false;
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }while(status);
    }

    private static void displayStudentBySubject() {
        System.out.println("Enter Subject!!");
        String sub = sc.next();
        bl.displayStudentBySubject(sub);
    }

    private static void searchStudent() {
        System.out.println("Enter Student Id to be Searched!!");
        int rollNo = sc.nextInt();
        bl.searchStudent(rollNo);
    }

    private static void updateStudent() {
        System.out.println("Enter Id Whose Subject is to be Updated");
        int rollNo = sc.nextInt();
        System.out.println("Enter Subject Name ");
        String sName = sc.next();
        bl.updateStudentSubject(rollNo,sName);
        System.out.println("Updated Successfully!!");
    }

    private static void removeStudent() {
        System.out.println("Enter RollNo of student whose data is to be removed!!");
        int rollNo = sc.nextInt();
        bl.removeStudent(rollNo);
        System.out.println("Removed Successfully!!");
    }

    private static void displayStudent() {

        bl.displayStudent();

    }

    private static void addStudent() {
        System.out.println("Enter Student Id");
        int sRollNo = sc.nextInt();
        System.out.println("Enter Student Name");
        String sName = sc.next();
        System.out.println("Enter Student Age");
        int sAge = sc.nextInt();
        Subject s = addSubject();
        bl = new BussinessLogic();
        bl.addStudent(sRollNo,sName,sAge,s);
        System.out.println("Added Successfully!!");
    }

    private static Subject addSubject() {
        System.out.println("Enter Subject Id");
        int sId = sc.nextInt();
        System.out.println("Enter Subject Name");
        String sName = sc.next();
        System.out.println("Enter Subject Fees");
        double sFees = sc.nextDouble();
        bl = new BussinessLogic();
        Subject sub = new Subject(sId,sName,sFees);
        return sub;
    }


}
