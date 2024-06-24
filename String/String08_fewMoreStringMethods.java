import static java.lang.System.out;
public class String08_fewMoreStringMethods{
    public static void main(String[] args){
         String myString="Aa   Now is";
         String myString2="the time.";
         out.println(myString.codePointAt(1)); //return 97
         out.println(myString.codePointBefore(1));// return 65
         out.println(myString.codePointCount(0,2)); // return 2
         out.println(myString.contains("a")); // return true
         out.println(myString2.contentEquals("time.the")); //return false
    }
}
