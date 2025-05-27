
/*
In every semester there is a fee increment by Ksh 1500. Write a program that will prompt you 
to enter the fee payable in semester one. The application should then compute and output the 
expected payable fees for the next seven consecutive semesters:
Use
-For loop.
-While loop.
-Do While loop.
 */

import java.util.Scanner;

public class Fees {
    public static void main(String[] args){
        Scanner Student = new Scanner(System.in);
        System.out .println("Enter fee for Semester One = ");
        int Sem_One_Fee = Student.nextInt();

        System.out.println("Enter semester = ");
        int sem = Student.nextInt();
        System.out.println("Enter total semesters = ");
        int semesters = Student.nextInt();
        Student.close();
        for(sem = 1; sem <=semesters; sem++){
            double sem_fee = Sem_One_Fee + (sem - 1)*1500;
            System.out.println("Semester " + sem + " Fee = Ksh " + sem_fee);
        }
    }
}
