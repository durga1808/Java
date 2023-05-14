package com.concepts;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        JavaMethod method = new JavaMethod();
        method.myMethod();

        Javaparameters method1 = new Javaparameters();
        method1.myMethod1("Aathi", 26, "Madurai");
        method1.myMethod1("Anu", 27, "Chennai");
        method1.myMethod1("Arun", 30, "Kovilpatti");


        Javapmeteraddress method2 = new Javapmeteraddress();
        method2.myMethod2("Aathi", "Developer");
        method2.myMethod2("Anu", "Frontend developer");
        method2.myMethod2("Arun", "Full stack developer");
 
 
        Scanner ex =new Scanner(System.in);
        System.out.println("Enter the age of employee : ");
        try{
        int age= ex.nextInt();
        System.out.println("The age is : "+age);
        Javacheckage method3 = new Javacheckage();
method3.CheckAge(age);
        }
        finally{
            ex.close();
        }

       
    }
}
