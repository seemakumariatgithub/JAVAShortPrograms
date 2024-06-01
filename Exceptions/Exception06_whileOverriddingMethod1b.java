// 1 b. If superclass doesnot declares exception and subclass declares unchecked exception
class Exception06_whileOverriddingMethod1b extends Exception06_superClass{
    void methodA() throws RuntimeException{
        System.out.println("In Subclass methodA()");
    }
    
    public static void main(String[] args){
       Exception06_superClass superObject=new Exception06_whileOverriddingMethod();
       superObject.methodA();
    }
}
