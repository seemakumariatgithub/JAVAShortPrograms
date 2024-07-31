import static java.lang.System.out;

public class Generic03_boundedType{
    
    public static void main(String[] args){
        Integer[] myArray={1,2,3,4,5,6};
        Generic_class<Integer> genObject=new Generic_class<Integer>(myArray);
        out.println(genObject.average());
        
    }
}
// The trouble is that the compiler has no
// way to know that you are intending to create Generic_class objects using only numeric types. Thus,
// when you try to compile Generic_class, an error is reported that indicates that the doubleValue( )
// method is unknown. To solve this problem, you need some way to tell the compiler that you
// intend to pass only numeric types to T. Furthermore, you need some way to ensure that only
// numeric types are actually passed.
class Generic_class<T>{
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

