import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

class Collections_ArrayList01 {
    public static void main(String[] args) {
        
        ArrayList<String> arrL=new ArrayList<String>();
        out.println("Initil size: "+ arrL.size());
        
        arrL.addAll(List.of("one","two","three","four","five","six"));
        
        out.println("after adding element array size: "+ arrL.size());
        
        out.println("Array: "+arrL);
        
        out.println("remove(2) :"+arrL.remove(2));
        out.println("Array after removing: "+arrL);
        
        out.println("remove(\"two\") :"+arrL.remove("two"));
        out.println("Array after removing two: "+arrL);
        
        out.println("set :"+arrL.set(1,"eight"));
        out.println("Array after set: "+arrL);
    }
}
