
import static java.lang.System.out;
public class String05_compareTo{
    public static void main(String[] args){
         String myString="Hello";
         String myString2="Kello";
         
         out.println((int)myString.charAt(0));
         out.println((int)myString2.charAt(0));
         out.println(myString.compareTo(myString2));
         out.println(myString2.compareTo(myString));
    }
}
