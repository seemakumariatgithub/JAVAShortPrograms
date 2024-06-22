import static java.lang.System.out;
public class String06_searchingString{
    public static void main(String[] args){
         String myString="Now is the time for all good men " +
 "for men to come to the aid of their country.";
         String myString2="hello";
         
         out.println(myString);
         out.println("indexOf('i') = "+myString.indexOf('i'));
         out.println("lastIndexOf('i') = "+myString.lastIndexOf('i'));
         
         out.println("\nindexOf('i',5) = "+myString.indexOf('i',5));
         out.println("lastIndexOf('i',50) = "+myString.lastIndexOf('i',50));
         out.println("lastIndexOf('i',40) = "+myString.lastIndexOf('i',40));
         
         out.println("\nindexOf(\"for\") = "+myString.indexOf("for"));
         out.println("lastIndexOf(\"for\") = "+myString.lastIndexOf("for"));
         out.println("indexOf(\"for\",17) = "+myString.indexOf("for",17));
         out.println("lastIndexOf(\"for\",17) = "+myString.lastIndexOf("for",17));
    }
}
