import java.io.BufferedReader;
import java.io.InputStreamReader;

class IOandApplet02_ReadingCharacterStream2{
    
    public static void main(String[] args) {
        
        String myString;
        BufferedReader myStringReader=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your string\n Enter stop once you are done.");
        try{    
            do{
                myString=myStringReader.readLine();
                System.out.println(myString);
                //System.out.println(myStringReader.readLine());
            }while(!myString.equals("stop"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
