import static java.lang.System.out;
public class String10_StringBufferMethods{
    public static void main(String[] args){
         StringBuffer mySb=new StringBuffer("Hello JAVA");
         
         out.println("Original content:"+mySb);
         out.println("reverse: "+mySb.reverse());
         out.println("replace: "+mySb.replace(4,8,"G"));
         out.println("reverese: "+mySb.charAt(0));
    }
}
