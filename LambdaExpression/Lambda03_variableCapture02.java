import static java.lang.System.out;

public class Lambda03_variableCapture02 {
  public static void main(String[] args) {
    int num=2;
    someAction<Integer> myAction=(a)->{
        //num=3;
        //This will throw error 
    //         Lambda03_variableCapture.java:7: error: local variables referenced from a lambda expression must be final or effectively final
    //         num=3;
    //         ^
    // Lambda03_variableCapture.java:8: error: local variables referenced from a lambda expression must be final or effectively final
    //     	return num+a;
    	return num+a;
    	
    };
    out.println("Calling action on Variable capture:"+myAction.performAction(5));
    
    //num=9;
    //This will throw compiletime erroras 
    // Lambda03_variableCapture.java:7: error: local variables referenced from a lambda expression must be final or effectively final
    // 	return num+a;
  }
}

interface someAction<T>{
	T performAction(T t);
}
