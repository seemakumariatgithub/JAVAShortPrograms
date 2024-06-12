public class IOandApplet_03OverLoadingConstructor{
    
    public static void main(String[] args){
        new UsingThis();
        new UsingThis(3);
        new UsingThis(4,6);
    }
}
class UsingThis{
    
    int a;
    int b;
    
    UsingThis(){
        this(0);
        System.out.println("Executed in UsingThis() ");
    }
    
    UsingThis(int i){
        this(i,i);
        System.out.println("Executed in UsingThis(int i) ");
    }
    UsingThis(int i,int j){
        a=i;b=j;
        System.out.println("Value of a: "+a+"\nValue of b: "+b);
        System.out.println("Executed in UsingThis(int i,int j) ");
    }
}
