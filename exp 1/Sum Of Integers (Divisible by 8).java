
package exp1;

public class divisibleby8 {

  
    public static void main(String[] args)  
 {

 {
 int sum = 0, count = 0;
 for (int i = 101; i < 200; i++)
 {
     if (i % 8 == 0)
     {
         sum = sum + i;
         count++;
     }
 }
 System.out.println("The Sum of the number between 100 to 200 which are divisible by 8 is: "+sum);
 System.out.println("Total numbers between 100 to 200 which are divisible by 8 is: "+count);
 }
 } 
    }

