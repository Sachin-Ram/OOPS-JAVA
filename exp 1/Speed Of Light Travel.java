
package exp1;
import java.util.scanner;

public class speed {

   
   public static void main(String[] args) {
      Scanner o=new Scanner (System.in);
      int speed;
      long days, seconds, dist;
      speed = 186000;
      System.out.println("enter the number of days");
      long days=o.nextLong();
      seconds = days * 24 * 60 * 60;
      dist = speed * seconds;
      System.out.print("Light travels: "+dist + " miles");
   }
}
    

