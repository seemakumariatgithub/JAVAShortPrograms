import static java.lang.System.out;

public class Generic03_boundedType2{
    
    public static void main(String[] args){
        Integer[] myArray={1,2,3,4,5,6};
        Generic_class<Integer> genObject=new Generic_class<Integer>(myArray);
        out.println(genObject.average());
        
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
        return sum;
    }
}

