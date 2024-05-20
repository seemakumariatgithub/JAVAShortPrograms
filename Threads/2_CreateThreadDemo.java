
class CreateThreadDemo {
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


class CreateThread implements Runnable{
    
    Thread thisThread;
    
    CreateThread(){
        thisThread=new Thread(this,"ChildThread");
        System.out.println("Child thread. "+thisThread.getName());
        thisThread.start();
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
