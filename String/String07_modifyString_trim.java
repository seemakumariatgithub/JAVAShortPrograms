import static java.lang.System.out;
public class String07_modifyString_trim{
    public static void main(String[] args){
         String myString="   Now is   ";
         String myString2=" the time.";
         out.println("\nTriming the String.");
         out.println("Before: ....."+myString+"......");
         out.println("myString.trim():"+myString.trim());
         
         String trimedString=myString.trim();
         out.println("After: ....."+trimedString+"......");
    }
}
