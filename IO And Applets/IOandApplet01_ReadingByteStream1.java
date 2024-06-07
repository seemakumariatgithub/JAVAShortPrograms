import java.io.BufferedReader;
import java.io.InputStreamReader;

class IOandApplet01_ReadingByteStream1{
    
    public static void main(String[] args) {
        BufferedReader myreader=new BufferedReader(new InputStreamReader(System.in));
        try{
                System.out.println(myreader.read());// read() method returns the integer value i.e ASCII value
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
