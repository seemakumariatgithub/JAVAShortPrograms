class Question2{
  public static void main(String[] args){
    System.out.println(null+true);
    System.out.println(true+null);
    System.out.println(null+null);
  }
}

/*===== this will throw compile tim error as 
ERROR!
/tmp/H2JhvENb9S/HelloWorld.java:3: error: bad operand types for binary operator '+'
    System.out.println(null+true);
                           ^
  first type:  <null>
  second type: boolean
ERROR!
/tmp/H2JhvENb9S/HelloWorld.java:4: error: bad operand types for binary operator '+'
    System.out.println(true+null);
                           ^
  first type:  boolean
  second type: <null>
ERROR!
/tmp/H2JhvENb9S/HelloWorld.java:5: error: bad operand types for binary operator '+'
    System.out.println(null+null);
                           ^
  first type:  <null>
  second type: <null>
3 errors
*/
