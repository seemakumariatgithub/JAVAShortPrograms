import static java.lang.System.out;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.List;
import java.util.Spliterator;

public class Stream04_Spliterator2{
    public static void main(String[] args){
        
        out.println("1. tryAdvance()");
       Spliterator<String> mySplit= Stream.of("Alpha","Beta","Gamma","Delta","Phi","Omega")
        .spliterator();
        
        while(mySplit.tryAdvance(n->out.println(n)));
        
        // forEachremaining() method
        out.println("\n2. forEachremaining()");
        Spliterator<String> mySplit1= Stream.of("Alpha","Beta","Gamma","Delta","Phi","Omega")
        .spliterator();
        mySplit1.forEachRemaining(n->out.println(n));
        
        out.println("\n3. trySplit()");
        // trySpit()
        Spliterator<String> mySplit2= Stream.of("Alpha","Beta","Gamma","Delta","Phi","Omega")
        .spliterator();
        
       Spliterator<String> part1mySplit2=mySplit2.trySplit();
       
       if(part1mySplit2!=null){
           out.println("Output from part1mySplit2: ");
           part1mySplit2.forEachRemaining(n->out.println(n));
       }
       
       out.println("Output from mySplit2: ");
        mySplit2.forEachRemaining(n->out.println(n));
        
    }
}
