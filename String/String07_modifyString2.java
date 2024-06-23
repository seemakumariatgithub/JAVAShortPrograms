import static java.lang.System.out;
public class String07_modifyString2{
    public static void main(String[] args){
         String myString="Now is ";
         String myString2="the time.";
         int startIndex=myString.indexOf("is");
         out.println(startIndex);
         out.print("myString.substring(startIndex) => ");
         out.println(myString.substring(startIndex));
         
         String myConcatString=myString.concat(myString2);
         out.println("\nConcatinated String.");
         out.println("myString.concat(myString2) : "+myConcatString);
         
         out.println("\nconcat() creates new object .");
         out.print("myString.concat(myString2)==(myString+myString2) : ");
         out.println(myString.concat(myString2)==(myString+myString2));
         out.println("myConcatString.equals((myString+myString2)) : "+myConcatString.equals((myString+myString2)));
    }
}
