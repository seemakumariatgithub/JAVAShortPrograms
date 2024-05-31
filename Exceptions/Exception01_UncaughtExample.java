class Exception01_UncaughtExample{
    public static void main(String[] args){
        int a=0;
        int b=67;
        
        int c= b/a;
    }
}

/* This will throw below mentioned exception

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception1_UncaughtExample.main(Exception1_UncaughtExample.java:6)
 
*/
