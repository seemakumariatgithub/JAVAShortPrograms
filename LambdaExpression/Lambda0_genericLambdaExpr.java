import static java.lang.System.out;

public class Lambda0_genericLambdaExpr{
    public static void main(String[] args){
        SomeAction<String> myStringAction=(str)->{
            String result="";
            int i;
            for(i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result;
        };
        
        out.println("myStringAction:"+ myStringAction.getValue("Here is two."));
        
        SomeAction<Integer> myIntegerAction=(a)->{
            int result=1;
            for(int i=a;i>0;i--){
                result=i*result;
            }
            return result;
        };
        
        out.println("myIntegerAction: " + myIntegerAction.getValue(3));
    }
}

interface SomeAction<T>{
    T getValue(T t);
}

