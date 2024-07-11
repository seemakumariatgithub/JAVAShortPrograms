import static java.lang.System.out;

public class Lambda03_variableCapture {
  public static void main(String[] args) {
    int num=2;
    someAction<Integer> myAction=(a)->{       
    	return num+a;    	
    };
    out.println("Calling action on Variable capture:"+myAction.performAction(5));    
  }
}
interface someAction<T>{
	T performAction(T t);
}
