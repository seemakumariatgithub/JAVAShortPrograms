import java.io.BufferedReader;
import java.io.InputStreamReader;

class IOandApplet01_ReadingByteStream2{
    
    public static void main(String[] args) {
        
        char myCharacter;
        int myByteInt;
        BufferedReader myreader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, enter q to exit");
        try{
            do{
                myByteInt=myreader.read();// read() method returns the integer value i.e ASCII value
                myCharacter=(char)myByteInt;
                System.out.println(myCharacter+" => "+myByteInt);
               }while(myCharacter !='q');
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
