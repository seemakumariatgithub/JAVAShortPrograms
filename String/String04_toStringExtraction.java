import static java.lang.System.out;
public class String04_toStringExtraction{
    public static void main(String[] args){
         String myString="Hello this new world.";
         //charAt() ,getChars(), getBytes(), toCharArray()
         int strlen=myString.length();
         //charAt()
         for(int i=0;i<strlen;i++){
             char c=myString.charAt(i);
             out.print(c+", ");
         }
         out.println(" ==== ");
         //getChars()
         
         char[] myTargetArray= {'1','2','3','4','5','6','7','8','9','9','8','7','6','5','4','3','2'};
         int sourceStart=4;
         int sourceEnd=12;
         myString.getChars(sourceStart,sourceEnd,myTargetArray,3);
         out.print(myTargetArray);
         
    }
}
