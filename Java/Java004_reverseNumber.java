import static java.lang.System.out;
class Java004_reverseNumber {
    public static void main(String[] args) {
      int number=12345;
      out.println("original number: "+number);
      int reverse=0;
      while(number!=0){
         reverse=reverse*10+number%10;
         number=number/10;
     }
     out.println("reverse: "+ reverse);
    }
}
