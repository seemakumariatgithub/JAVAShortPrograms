import static java.lang.System.out;
public class String11_StringBuilderMethods{
    public static void main(String[] args){
         StringBuilder mySb=new StringBuilder("Hello JAVA");
         
         out.println("Original content:"+mySb);
         out.println("reverse: "+mySb.reverse());
         out.println("replace: "+mySb.replace(4,8,"G"));
         out.println("reverese: "+mySb.charAt(0));
         
         
         String myS=new String("Hello JAVA");
         
         out.println("\nOriginal content of String:"+myS);
        // out.println("reverse: "+myS.reverse());
         out.println("replace: "+myS.replace("ll","G"));
         out.println("reverese: "+myS.charAt(0));
    }
}
