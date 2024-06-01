import java.lang.*;

//1a.If superclass doesnot declares exception and subclass declares checked exception

class Exception06_whileOverriddingMethod1a extends Exception06_superClass{
    void methodA() throws Exception{
        System.out.println("In Subclass methodA()");
    }
    
    public static void main(String[] args){
       Exception06_superClass superObject=new Exception06_whileOverriddingMethod1a();
       superObject.methodA();
    }
}

class Exception06_superClass{
     //In this the method no exception is declared
    void methodA(){
            System.out.println("In Superclass methodA()");
    }
}
