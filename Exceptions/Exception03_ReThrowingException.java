class Exception03_ReThrowingException{
    
    public static void main(String[] args){
        try{
            System.out.println("Inside the main method.\n This is before the calling a method that throw exception.\n");
            anAction();
            System.out.println("Inside the main method.\nThis is after the called method in main");
            // The above line will not throw compile time error as  error: unreachable statement
            // Also above line will not get executed at all;
        }catch(NullPointerException e){
            System.out.println("Caught inside the main method:"+e);
            System.out.println(e.getMessage());
        }
    }
    
    static void anAction(){
        try{
             System.out.println("Inside the called method.\n This is before the called method threw exception.\n");            
             throw new NullPointerException("demo"); // Here the argument specified in string, that describes the exception            
            //System.out.println("Inside the called method.\n This is after the called method threw exception.\n");
            // The above line will throw compile time error as  error: unreachable statement
        }catch(NullPointerException e){
            System.out.println("Caught inside the called method:"+e);
            System.out.println("Display exception discipriotn: "+e.getMessage()); // This is another way to display the exception description
            throw new NullPointerException("new demo"); // rethrow the new exception bject
        }
    }
