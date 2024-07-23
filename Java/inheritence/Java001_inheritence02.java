import static java.lang.System.out;

class Java001_inheritence02 {  
    public static void main(String[] args) {
        Base base_derived=new Derived();
        Base base=new Base();
        Derived derived=new Derived();
        // base.show1();
        // base.show2();
        // base.show1();
        
        // base_derived.show1();
        // base_derived.show2();
        // base_derived.show1();
        
        derived.show1();
        derived.show2();
        derived.show1();
    }
}

class Base{
   void show1(){
        out.println("show Base");
    }
}

class Derived extends Base{
    
    void show2(){
        out.println("show Derived");
    }
}
