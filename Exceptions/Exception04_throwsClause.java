class Exception04_throwsClause{
    
    public static void main(String[] args){
        try{
            System.out.println("Inside the main method.\n This is before the calling a method that throw exception.\n");
        anAction();
        System.out.println("Inside the main method.\nThis is after the called method in main");
        }catch(NullPointerException e){
            System.out.println("Caught inside the main method:"+e);
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nInside the main method, but outside the try block.\nThis is after the exception is caught");
    }
    
    static void anAction() throws NullPointerException{
        try{
             System.out.println("Inside the called method.\n This is before the called method threw exception.\n");
            throw new NullPointerException("demo");
    }
}
