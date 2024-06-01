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
            throw new NullPointerException("demo"); // Here the argument specified in string, describs the exception
        }catch(NullPointerException e){
            System.out.println("caught inside the called method:"+e);
            System.out.println(e.getMessage()); // This is another way to display the exception description
            throw new NullPointerException("new demo"); // rethrow the new exception bject
        }
    }
}
