
package exno2;

import java.util.Scanner;


public class Exno2 {
public static void main(String args[])
    {
    	
        int marks[] = new int[5];
        int i;
        float total=0, avg;
        try(Scanner scanner = new Scanner(System.in))
        {
        for(i=0; i<5; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
    }
        avg = total/5;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
    

