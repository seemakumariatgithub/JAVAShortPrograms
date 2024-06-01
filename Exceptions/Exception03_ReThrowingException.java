class Exception03_ReThrowingException{
    
    public static void main(String[] args){
        try{
        anAction();
        }catch(NullPointerException e){
            System.out.println("Caught inside the main method:"+e);
        }
    }
    
    static void anAction(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("caught inside the called method:"+e);
            throw new NullPointerException("new demo"); // rethrow the new exception bject
        }
    }
}
