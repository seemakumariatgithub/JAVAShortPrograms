class Exception07_customException1{
    
    public static void main(String[] args){
        try{
            throw new MyCustomException("throw custom exception");
        }catch(MyCustomException ex){
            System.out.println("In Main: caught "+ex.getMessage());
        }
    }
    
}

class MyCustomException extends Exception{
    
    // MyCustomException(){
    //     super();
    // }
    
    MyCustomException(String exMsg){
        super(exMsg);
    }
    
}

/*Out put will be "In Main: caught throw custom exception" */
