import static java.lang.System.out;
public class String07_modifyString{
    public static void main(String[] args){
         String myString="Now is the time for all good men " +
 "for men to come to the aid of their country.";
         int startIndex=myString.indexOf("the");
         out.println(startIndex);
         out.println("myString.substring(startIndex) =>");
         out.println(myString.substring(startIndex));
         out.println("\n\nmyString.substring(startIndex,22) =>");
         out.println(myString.substring(startIndex,22));
    }
}
