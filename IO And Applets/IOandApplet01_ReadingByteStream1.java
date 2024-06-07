import java.io.BufferedReader;
import java.io.InputStreamReader;

class IOandApplet01_ReadingByteStream1{
    
    public static void main(String[] args) {
        BufferedReader myreader=new BufferedReader(new InputStreamReader(System.in));
        try{
                System.out.println(myreader.read());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
