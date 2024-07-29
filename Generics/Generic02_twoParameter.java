import static java.lang.System.out;

public class Generic02_twoParameter{
    
    public static void main(String[] args){
        
        Generic_class<Integer,String> genClass= new Generic_class<Integer,String>(8,"Hello two parameter generic class");
        genClass.showObjType();
        
       
        Generic_class<String,String> genStringObj=new Generic_class<String,String>("Hello String","Hello parmater");
        genStringObj.showObjType();
        
    }
}

class Generic_class<T,V>{
    T obj_t;
    V obj_v;
    Generic_class(T obt,V obv){
        obj_t=obt;
        obj_v=obv;
    }   
    public void showObjType(){
        out.println("Type of T object is : "+ obj_t.getClass().getName());
        out.println("Type of V object is : "+ obj_v.getClass().getName());
    }
}

