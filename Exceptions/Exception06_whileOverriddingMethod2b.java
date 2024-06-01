import java.lang.*;

//2b.If superclass declares exception and subclass declares exception that is not subclass of exception declared in superclass

class Exception06_whileOverriddingMethod2b extends Exception06_superClass{
    void methodA() throws Exception{
        System.out.println("In Subclass methodA()");
    }
    
    public static void main(String[] args){
       Exception06_superClass superObject=new Exception06_whileOverriddingMethod1a();
       superObject.methodA();
    }
}

class Exception06_superClass{
     //In this the method exception is declared
    void methodA() throws RuntimeException{
            System.out.println("In Superclass methodA()");
    }
}
