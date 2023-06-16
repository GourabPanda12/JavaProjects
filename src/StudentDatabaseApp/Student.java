package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
     private  String firstName;
     private String lastName;
     private int gradeYear;
     private String studentID;
     private String courses ="";
     private int tuitionBalance=0;
     private static int costOfCourse=600;
     private  static int id=1000;

     //Constructor: prompt user to enter student's name
    public  Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - fresher\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level ");
        this.gradeYear =in.nextInt();
        setStudentID();

    }
    //Generate an id
    public void setStudentID() {
        id++;
        this.studentID = gradeYear + ""+ id;
    }
    //Enroll in courses
    public void enroll() {
        //Get inside a loop , user hits 0
        do {
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if ( !course.equals("Q") ) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0) ;
    }
    // View balance.
    public  void  viewBalance() {
        System.out.println("Your balance is " + tuitionBalance + " rupees");
    }
    //pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in .nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks you for your payment " + payment +" rupees");
        viewBalance();
    }
    //Show status
    public  String  toString(){
        return  "name: " + firstName + " "+ lastName +" \nGrade Level: " + gradeYear + "\nStudent ID: " + studentID + "\nCourses Enrolled:  "  + courses + "\nBalance : rupees " + tuitionBalance;
    }
}
