class Thread6_NotWithSynchMethod{
    public static void main(String args[]){
        CallMe target=new CallMe();
        Caller caller1=new Caller(target,"Hello");
        Caller caller2=new Caller(target,"Synchronized");
        Caller caller3=new Caller(target,"World");
        
        // Now we wait for above threads to end
        try{
            caller1.th.join();
            caller2.th.join();
            caller3.th.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}

class CallMe{
    void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread th;
    
    Caller(CallMe myTarget,String myMsg){
        target=myTarget;
        msg=myMsg;
        th=new Thread(this);
        th.start();
    }
    
    public void run(){
        target.call(msg);
    }
}

