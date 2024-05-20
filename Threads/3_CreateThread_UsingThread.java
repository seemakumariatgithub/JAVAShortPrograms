
class 3_CreateThread_UsingThread {
    public static void main(String[] args) {
        new CreateThread();
        try{
        for(int i=5;i>0;i--){
            System.out.println("Main thread: "+i);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println("Main method interrupted.");
        }
    }
}


class CreateThread extends Thread{
    
    CreateThread(){
        //New thread gets created here
        super("ChildThread");
        System.out.println("Child thread. "+getName());
        start();// this starts the new Thread
    }
    
    public void run(){
        try{
        for(int i=5;i>0;i--){
            System.out.println("Child thread : "+i);
            Thread.sleep(500);
        }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupted.");
        }
        System.out.println(" Exits the Child Thread.");
    }
}
