//2 c.If superclass declares exception and subclass declares no exception superclass

class Exception06_whileOverriddingMethod2c extends Exception06_superClass{
    void methodA(){
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
