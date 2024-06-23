
import static java.lang.System.out;
public class String07_modifyString_replace{
    public static void main(String[] args){
         String myString="Now is ";
         String myString2="the time.";
         String myString3="Once upon a time, the animals of a jungle lived happily together. But one fine day, a ferocious and strong lion came to stay with them. Since the lion was big and strong, he started causing trouble and bullying the other animals. Fed up with this, the animals assembled together to discuss a way out of this.";
    
         out.println("\nReplacing the String.");
         out.println("myString.replace(\"Now\",\"Today\") : "+myString.replace("Now","Today"));
         
         out.println("myString2.replace('t','d') : "+myString2.replace('t','d'));
         out.println("\n");
         out.println(myString3.replace("lion","tiger"));
    }
}
