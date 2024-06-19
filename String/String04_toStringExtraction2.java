import static java.lang.System.out;
public class String04_toStringExtraction2{
    public static void main(String[] args){
         String myString="Hello this new world.";
         //charAt() ,getChars(), getBytes(), toCharArray()
         int strlen=myString.length();
         //charAt()
         out.println("charAt()");
         for(int i=0;i<strlen;i++){
             char c=myString.charAt(i);
             out.print(c+", ");
         }
         out.println("\n\n getChars()");
         //getChars()
         char[] myTargetArray= {'1','2','3','4','5','6','7','8','9','9','8','7','6','5','4','3','2'};
         int sourceStart=4;
         int sourceEnd=12;
         myString.getChars(sourceStart,sourceEnd,myTargetArray,3);
         
         out.print(myTargetArray);
         out.println("\n\n getBytes()");
         //getBytes()
         byte[] myTargetByteArray= new byte[strlen];
         myString.getBytes(sourceStart,sourceEnd,myTargetByteArray,0);
         for(int i=0;i<strlen;i++){
             out.print(myTargetByteArray[i]+", ");
         }
         out.println("\n\n toCharArray()");
         //toCharArray()
         out.print("myString.toCharArray() :");
         out.println(myString.toCharArray());
         char[] newCharArray=myString.toCharArray();
         out.print("newCharArray : ");out.println(newCharArray);
         out.println("newCharArray[i]");
         for(int i=0;i<strlen;i++){
             out.print(newCharArray[i]+"', '");
         } 
    }
}
