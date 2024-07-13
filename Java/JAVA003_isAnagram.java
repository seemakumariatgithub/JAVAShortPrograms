import static java.lang.System.out;
import java.util.Arrays;
public class JAVA003_isAnagram{
    public static void main(String[] args){
         String myString="schoolmaster";
         String myString2="theclassroom";
         char[] ch1=myString.toLowerCase().toCharArray();
         char[] ch2=myString2.toLowerCase().toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         //out.println(ch1);
         //out.println(ch2);
         
         if(Arrays.equals(ch1,ch2))
            {out.println("Is Anagram");}
         else
            {out.println("Not Anagram");}
    }
}
