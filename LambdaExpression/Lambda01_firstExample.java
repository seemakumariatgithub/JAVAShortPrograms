import static java.lang.System.out;
public class Lambda01_firstExample{
    public static void main(String[] args){
        NewNumber newNumber=()->12.34;        
        out.println("New Number using lambda expression: "+newNumber.getValue());
        
        // NewNumber newNumber1=()->"12.34";
        // out.println("New Number using lambda expression: "+newNumber1.getValue());
        //Above line will throw below error.
        //Lambda01_firstExample.java:9: error: incompatible types: bad return type in lambda expression
        //         NewNumber newNumber1=()->"12.34";
        //                                  ^
        //     String cannot be converted to double
        // 1 error
    }
}

interface NewNumber{
    double getValue();
}
