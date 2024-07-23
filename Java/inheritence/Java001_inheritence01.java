import static java.lang.System.out;

class Java001_inheritence01 {  
    public static void main(String[] args) {
        Base obj=new Derived();
        obj.show();
    }
}

class Base{
    void show(){
        out.println("show1()");
    }
}

class Derived extends Base{
    @Override
    void show(){
        super.show();
        out.println("show2()");
    }
}
