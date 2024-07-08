import static java.lang.System.out;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.List;
import java.util.Spliterator;

public class Stream04_Spliterator{
    public static void main(String[] args){
        
       Spliterator<String> mySplit= Stream.of("Alpha","Beta","Gamma","Delta","Phi","Omega")
        .spliterator();
        
        while(mySplit.tryAdvance(n->out.println)));
    }
}
