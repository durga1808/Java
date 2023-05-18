/*package com.concepts;

import java.util.Scanner;

class Studentdetails{
    int id;
}
class Sname extends Studentdetails{
    String name;
}
class CSection extends Studentdetails{
    String classection;
}
class Marks extends Studentdetails
{
    int tamil,eng,mat,tot,avg;
    
}
public class hierarhicalinherit{
    private static String tamil;
    private static String eng;
    private static String mat;
    private static int tot;
    private static int avg;

    public static void main(String[] args)
    {
           
        Studentdetails ob1 = new Studentdetails();
        Sname ob2 = new Sname();
        CSection ob3 = new CSection();
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Student ID is :");
        int id = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter student Name :");
        String  name = s2.next();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter student class section : ");
        String classection = s3.next();

        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the mark details : ");
int tamil = s4.nextInt();
int eng = s4.nextInt();
int mat = s4.nextInt();

tot = tamil + eng + mat ;
avg =tot/3;

System.out.println("Total mark is :" + tot);
System.out.println("The average of the mark is : " +  avg);



        System.out.println("Student details : " + " " + id + " " + name + " " + classection + " " + "Total = " + tot + " " + "Average = " + avg);
    }
}
*/
