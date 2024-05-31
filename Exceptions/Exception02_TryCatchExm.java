class Exception02_TryCatchExm{
    public static void main(String[] args){
        try{
        anAction();
        }catch(ArithmeticException e){
            System.out.println("Exception is caught : division by zero");
        }
    }
    
    static void anAction(){
        int a=0;
        int b=67;
        
        int c= b/a;
    }
}
