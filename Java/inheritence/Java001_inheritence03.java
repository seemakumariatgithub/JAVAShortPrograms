import static java.lang.System.out;

class Java001_inheritence03{  
    public static void main(String[] args) {
        //Base base=new Base();
       // Derived derived=new Derived();
        Base base_derived=new Derived();
    }
}

class Base{
   Base(){
        out.println("Base");
    }
}

class Derived extends Base{
    Derived(){
        out.println("Derived");
    }
}
