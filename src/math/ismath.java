package math;

import java.util.Scanner;

public class ismath {
    public void math_test(){
        double result1, result2, result3, result4, result5, result6;
        result1 = Math.sqrt(16); 
        result2 = Math.abs(-5);
        result3 = Math.max(10, 20);
        result4 = Math.min(10, 20);
        result5 = Math.round(3.14);
        result6 = Math.ceil(3.14);

        double result7 = Math.floor(3.14);
        double result8 = Math.random() * 100 + 1; // generates a random number between 1 and 101
        double result9 = Math.PI; // value of pi
        //hypotenuse calculator = Math.hypot(3, 4);
        double hypotenuse = Math.hypot(3, 4);
        double result10 = Math.exp(1); // value of e
        double result11 = Math.log(10); // natural logarithm of 10
        double result12 = Math.log10(100); // logarithm base 10 of 100
        double result13 = Math.signum(-5); // returns -1.0 for negative numbers, 0.0 for zero, and 1.0 for positive numbers
        double result14 = Math.toDegrees(Math.PI / 4); // converts radians to degrees
        double result15 = Math.toRadians(45); // converts degrees to radians
        double result16 = Math.sinh(1); // hyperbolic sine of 1
        double result17 = Math.cosh(1); // hyperbolic cosine of 1
        double result18 = Math.tanh(1); // hyperbolic tangent of 1
        double result19 = Math.asin(0.5); // arcsine of 0.5
        double result20 = Math.acos(0.5); // arccosine of
        // double result21 = Math.sqrt(2,4)
        // System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(hypotenuse);
        System.out.println(result10);
        System.out.println(result11);
        System.out.println(result12);
        System.out.println(result13);
        System.out.println(result14);
        System.out.println(result15);
        System.out.println(result16);
        System.out.println(result17);
        System.out.println(result18);
        System.out.println(result19);
        System.out.println(result20);



        // hypotenuse c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter The length of size A: ");
        a = scanner.nextDouble();

        System.out.println("Enter The length of size B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, b));

        System.out.println("The hypotenuse (Size C) is :" + c);

    }    
}
