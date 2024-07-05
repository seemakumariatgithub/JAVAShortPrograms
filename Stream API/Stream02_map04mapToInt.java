import static java.lang.System.out;
import java.util.stream.*;

public class Stream02_map04mapToInt{  
   public static void main(String[] args) {
 
    out.println("List of doubles: ");
    Stream.of(1.0,2.3,4.56,3.96)
    .mapToInt((a) -> (int) Math.ceil(a))
    .forEach(System.out::println);
   } 
} 






