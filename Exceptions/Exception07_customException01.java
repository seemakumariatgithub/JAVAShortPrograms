class Exception07_customException01{
    
    public static void main(String[] args){
        try{
            throw new MyCustomException();
        }catch(MyCustomException ex){
            System.out.println("In Main: caught "+ex.getMessage());
        }
    }
    
}

class MyCustomException extends Exception{
    }

/*OUTPUT: will be 

In Main: caught null

*/
