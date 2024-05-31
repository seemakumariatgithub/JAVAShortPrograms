class Exception01_UncaughtStackTraceExample{
    public static void main(String[] args){
        anAction();
    }
    
    static void anAction(){
        int a=0;
        int b=67;
        
        int c= b/a;
    }
}

/*This will throw the exception in below mentioned format

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception1_UncaughtExample.anAction(Exception1_UncaughtExample.java:10)
	at Exception1_UncaughtExample.main(Exception1_UncaughtExample.java:3)

*/
