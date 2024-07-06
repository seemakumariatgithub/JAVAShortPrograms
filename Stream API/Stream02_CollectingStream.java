import static java.lang.System.out;
import java.util.stream.*;
import java.util.List;
import java.util.Set;

public class Stream02_CollectingStream {  
   public static void main(String[] args) {
 
    out.println("List of name, phone and emails: ");
    Stream.of(new NamePhoneEmail("Name1","123438","emal1@gmail.com"),new NamePhoneEmail("Name2","56789","emal2@gmail.com"),new NamePhoneEmail("Name1","123467","emal3@gmail.com"),new NamePhoneEmail("Name3","234156","emal4@gmail.com"))
    .forEach(a-> out.println(a.name+", "+a.phone+", "+a.email));
    
    out.println("\nList of name and emails:");
   List<NameEmail> myNewList= Stream.of(new NamePhoneEmail("Name1","1234","emal1@gmail.com"),new NamePhoneEmail("Name2","56789","emal2@gmail.com"),new NamePhoneEmail("Name1","123467","emal3@gmail.com"),new NamePhoneEmail("Name3","234156","emal4@gmail.com"))
    .filter(a -> a.name.equals("Name1"))
    .map(a -> new NameEmail(a.name,a.email))
    .collect(Collectors.toList());
    
    Set<NameEmail> myNewSet= Stream.of(new NamePhoneEmail("Name1","1234","emal1@gmail.com"),new NamePhoneEmail("Name2","56789","emal2@gmail.com"),new NamePhoneEmail("Name1","123467","emal3@gmail.com"),new NamePhoneEmail("Name3","234156","emal4@gmail.com"),new NamePhoneEmail("Name1","123467","emal3@gmail.com"))
    .filter(a -> a.name.equals("Name1"))
    .map(a -> new NameEmail(a.name,a.email))
    .collect(Collectors.toSet());
    
    
    for(NameEmail ne: myNewList)
        out.println(ne.name+", "+ne.email);
        
    for(NameEmail ne: myNewSet)
        out.println(ne.name+", "+ne.email);
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
