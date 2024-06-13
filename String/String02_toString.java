public class String02_toString{
    public static void main(String[] args){
        MyMsg mg=new MyMsg("Hello All");
        String str1="Concatinated msg: "+mg;
        System.out.println(mg);
        System.out.println(str1);
    }
}

class  MyMsg{
    String msg;
    
    MyMsg(String userMsg){
        this.msg=userMsg;
    }
    
    public String toString(){
        return "My message: from overridden toString(): "+msg;
    }
}
