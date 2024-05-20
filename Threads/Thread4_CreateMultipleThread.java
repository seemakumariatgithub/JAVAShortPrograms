/*==================================
AUTHOR : SEEMA KUMARI
=====================================*/
class Thread4_CreateMultipleThread {
    public static void main(String[] args) {
        new CreateThread("one");
        new CreateThread("two");
        new CreateThread("three");        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
    }
}
class CreateThread  implements Runnable{
    Thread newThread;
    String name;
    
    CreateThread(String threadName){
        // New Thread is created here
        name=threadName;
        newThread=new Thread(this,name);
        System.out.println("Child Thread: "+newThread.getName());
        newThread.start();// Starts the new thread
    }
    
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child: "+name+" => "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread "+name+" Interrupted.");
        }
        System.out.println(" Exits the Child "+name+" Thread.");
    }
}
