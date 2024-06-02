class Exception07_customException04{
    
    public static void main(String[] args){
        try{
            throw new MyCustomException();
        }catch(MyCustomException ex){
            System.out.println("In Main: caught "+ex.getMessage());
        }
    }
    
}

class MyCustomException extends Exception{
    
    MyCustomException(String exMsg){
        super(exMsg);
    }
    
}

/*OUTPUT: will be 
ERROR!
/tmp/xXPecNDt6X/Exception07_customException.java:5: error: constructor MyCustomException in class MyCustomException cannot be applied to given types;
            throw new MyCustomException();
                  ^
  required: String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
