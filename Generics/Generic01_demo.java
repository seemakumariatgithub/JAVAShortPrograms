import static java.lang.System.out;

public class Generic01_demo{
    
    public static void main(String[] args){
        Generic_class<Integer> genClass= new Generic_class<Integer>(8);
        genClass.showObjType();  

        Generic_class<String> genStringObj=new Generic_class<String>("Hello String");        
        genStringObj.showObjType();
    }
}
class Generic_class<T>{
    T obj;
    Generic_class(T ob){
        obj=ob;
    }
    public void showObjType(){
        out.println("Type of T bject is : "+ obj.getClass().getName());
    }
}

