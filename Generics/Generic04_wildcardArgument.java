import static java.lang.System.out;
public class Generic04_wildcardArgument{    
    public static void main(String[] args){
        Integer[] myIntegerArray={1,2,3,4,5,6};
        Double[] myDoubleArray={1.0,2.0,3.0,4.0,5.0,6.0};
        Generic_class<Integer> genOb_Integer=new Generic_class<Integer>(myIntegerArray);
        Generic_class<Double> genOb_Double=new Generic_class<Double>(myDoubleArray);        
        out.println("Are Average same: "+genOb_Integer.isSame(genOb_Double));        
    }
}
class Generic_class<T extends Number>{
    T[] obj;    
    Generic_class(T[] obt){
        obj=obt;
    }
    double average(){        
        double sum=0.0;        
        for(int i=0;i<obj.length;i++){
            sum+=obj[i].doubleValue();
        }
        return sum/obj.length;
    }    
    boolean isSame(Generic_class<?> genOb){
        if(average()==genOb.average())
            return true;
        return false;
    }
}

