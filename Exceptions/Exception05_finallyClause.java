class Exception05_finallyClause{
    
    public static void main(String[] args){
        try{
        methodA();
        }catch(RuntimeException e){
            System.out.println("In main(): catch");
            System.out.println("In main(): "+ e.getMessage());
        }finally{
            System.out.println("In main(): finally");
        }
        methodB();
        methodC();
    }
    
    //In this them ethod will throw exception
    static void methodA(){
        try{
            System.out.println("In methodA(): try");
            throw new RuntimeException("MethodA threw this.");
        }finally{
            System.out.println("In methodA(): finally");
        }
        
    }
    
    //In this try will return
    static void methodB(){
        try{
            System.out.println("In methodB(): try");
            return;
        }finally{
            System.out.println("In methodB(): finally");
        }
    }
    
    // In this try is not returning anything, just completeng the executeion
    static void methodC(){
        try{
            System.out.println("In methodC(): try");
        }finally{
            System.out.println("In methodC(): finally");
        }
    }
}
