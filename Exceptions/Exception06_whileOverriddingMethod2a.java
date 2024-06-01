//2a.If superclass declares exception and subclass declares child exception of exception declared in superclass
//   OR same exception type
//    OR any new RuntimeException type(unchecked exception)

class Exception06_whileOverriddingMethod2a extends Exception06_superClass{
    void methodA() throws ArithmeticException{
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
