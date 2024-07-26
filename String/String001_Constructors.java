import static java.lang.System.out;
public class String001_Constructors{
    public static void main(String[] args){
        String str1=new String("Constructor String(\"string\")");
        
        char[] ch={'C','o','n','s','t','r','u','c','t','o','r',' ','f','o','r',' ','s','u','b','s','t','r','i','n','g'};
        String str2=new String(ch);
        String str3=new String(ch,16,9);
        
        String stringObject=new String("Constructor String(String strObj)");
        
        String str4=new String(stringObject);
        out.println(str1);
        out.println(str2); 
        out.println(str3);
        out.println(str4);
        }
}
