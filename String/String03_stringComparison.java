public class String03_stringComparison{
    public static void main(String[] args){
        String s1="hello";
        String s2="Hello";
        String s3="hello";
        String s4=s3;
        String s5=new String("hello");
        
         System.out.println("s1=hello.equals(s2=Hello) => "+ s1.equals(s2));
        System.out.println("s1=hello.equals(s3=hello) => "+ s1.equals(s3));
        System.out.println("s1=hello.equals(s4=s3) => "+ s1.equals(s4));
          System.out.print("s1=hello.equals((s5=new String(hello))) => ");
        System.out.println(s1.equals(s5));
        System.out.print("new String(hello).equals(String(hello)) => ");
        System.out.println(new String("hello").equals(new String("hello")));
        System.out.println("==============================");
        System.out.print("s1=hello == (s2=Hello) => ");
        System.out.println(s1==s2);
        System.out.print("s1=hello == (s3=hello) => ");
        System.out.println(s1==s3);
        System.out.print("s1=hello == (s4=s3) => ");
        System.out.println(s1==s4);
        System.out.print("s1==s1 => ");
        System.out.println(s1==s1);
        System.out.print("s1=hello == (s5=new String(hello)) => ");
        System.out.println(s1==s5);
        System.out.print("new String(hello)==new String(hello) => ");
        System.out.println(new String("hello")==new String("hello"));
        }
}
