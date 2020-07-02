import java.util.*;
import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   {

    System.out.println(" Java Calculator ");
    // Declairing input numbers as floats

    float num1;
    float num2;
    String operator;
    // making scanner

    Scanner in = new Scanner(System.in);

    // taking input from user

    System.out.println(" Enter First Number: ");
    num1 = in.nextFloat();
    System.out.println(" Enter Second Number: ");
    num2 = in.nextFloat();
    //T The int.nextLine(); is used as java ignores operator input
    in.nextLine();
    System.out.println(" Enter operator(+,-,×,÷): ");
    operator = in.nextLine();

    // making if statements

    if (operator.equals("+")){
      System.out.println(num1 + num2);
    }else if (operator.equals("-")){
      System.out.println(num1 - num2);
    }else if (operator.equals("×")){
      System.out.println(num1 * num2);
    }else if (operator.equals("÷")){
      System.out.println(num1 / num2);
    }else {
      System.out.println(" Invalid Operator or Input ");
    }




   }
 }