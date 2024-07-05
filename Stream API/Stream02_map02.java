import static java.lang.System.out;
import java.util.stream.*;

public class Stream02_map02 {  
   public static void main(String[] args) {
 
    Stream.of(new NamePhoneEmail("Name1","1234","emal1@gmail.com"),new NamePhoneEmail("Name2","56789","emal2@gmail.com"))
    .forEach(a-> out.println(a.name+", "+a.phone+", "+a.email));
    
    Stream.of(new NamePhoneEmail("Name1","1234","emal1@gmail.com"),new NamePhoneEmail("Name2","56789","emal2@gmail.com"))
    .map(a -> new NameEmail(a.name,a.email))
    .forEach(a-> out.println(a.name+", "+a.email));
   } 
} 

class NamePhoneEmail{
    String name;
    String phone;
    String email;
    
    NamePhoneEmail(String n, String ph, String em){
        name=n;
        phone=ph;
        email=em;
    }
}

class NameEmail{
    String name;
    String email;
    
    NameEmail(String n,String em){
        name=n;
        email=em;
    }
    
}






