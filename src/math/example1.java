package math;

import java.util.Scanner;

public class example1{
    public void exercise(){
        /*
            circumference = 2 * Math.PI * radius
            area = Math.PI *  Math.pow(radius,2)
            volume = (4.0 / 3.0)* Math.PI * Math.pow(radius,3) 
        */

        Scanner sc = new Scanner(System.in) ;
        double radius;
        double circumference ;
        double area ;
        double volume;
        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);


        System.out.printf("The Circumference is : %.2fcm\n" , circumference );
        System.out.printf("The area is : %.2fcm²\n" , area );
        System.out.printf("The volume is : %.2fcm\u00b3" , volume );


        sc.close();
        // set as
    }
}