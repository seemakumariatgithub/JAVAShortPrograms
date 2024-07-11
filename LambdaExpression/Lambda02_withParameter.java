import static java.lang.System.out;

public class Lambda02_withParameter{
    public static void main(String[] args){
        NewNumber newNumber=(a,b)->a*b;
        out.println("New Number using lambda expression: "+newNumber.getValue(2,5));
        
        NewNumber newNumber1=(int a,int b)->a*b;
        out.println("New Number using lambda expression: "+newNumber1.getValue(2,5));
        
        // NewNumber newNumber2=(int a, b)->a*b;
        // out.println("New Number using lambda expression: "+newNumber2.getValue(2,5));
        //Above line will throw below compile time error
        //Lambda01_withParameter.java:11: error: invalid lambda parameter declaration
        //         NewNumber newNumber2=(int a, b)->a*b;
        //                              ^
        //   (cannot mix implicitly-typed and explicitly-typed parameters)

        NewNumber newNumber3=(var a,var b)->a*b;
        out.println("New Number using lambda expression: "+newNumber3.getValue(2,5));
        
        NewNumber newNumber4=(var a,var b)->{return a*b;};
        out.println("New Number using lambda expression: "+newNumber4.getValue(2,5));
        
        // NewNumber newNumber5=(var a,var b)->{a*b;};
        // out.println("New Number using lambda expression: "+newNumber5.getValue(2,5));
        //Lambda01_withParameter.java:24: error: not a statement
        // NewNumber newNumber5=(var a,var b)->{a*b;};
        //                                       ^
        
        // NewNumber newNumber6=(var a, b)->a*b;
        // out.println("New Number using lambda expression: "+newNumber6.getValue(2,5));
        //Lambda01_withParameter.java:30: error: invalid lambda parameter declaration
        //         NewNumber newNumber6=(var a, b)->a*b;
        //                              ^
        //   (cannot mix 'var' and implicitly-typed parameters)
        

        // NewNumber newNumber7=(var a,var b)->var a* var b;
        // out.println("New Number using lambda expression: "+newNumber7.getValue(2,5));
        //Lambda01_withParameter.java:33: error: not a statement
    
        
        // NewNumber newNumber6=(var a, int b)->a*b;
        // out.println("New Number using lambda expression: "+newNumber6.getValue(2,5));
        
        //Lambda01_withParameter.java:43: error: invalid lambda parameter declaration
        /NewNumber newNumber6=(var a, int b)->a*b;
        //                              ^
        //   (cannot mix 'var' and explicitly-typed parameters)
    }
}

interface NewNumber{
    int getValue(int a,int b);
}

