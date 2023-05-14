package com.concepts;


public class Javacheckage {
    public void CheckAge(int age)
    {
        if (age<18)
        {
        System.out.println("Access denied - you are not old enough!");
    }
    else
    {
System.out.println("Access granted - you are old enough!");
    }
}

}



/* Method Overloading
         multiple methods can have the same name with different parameters:

         ex:
         int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

ex1:

static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}

ex2:

static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
*/
