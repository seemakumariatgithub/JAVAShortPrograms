class Exception02_TryCatchExm2{
    public static void main(String[] args){
        try{
        anAction();
        }catch(ArithmeticException e){
            System.out.println("Exception is caught :"+e);
        }
    }
    
    static void anAction(){
        int a=0;
        int b=67;
        
        int c= b/a;
    }
}
