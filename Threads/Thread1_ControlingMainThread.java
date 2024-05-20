/*==================================
AUTHOR : SEEMA KUMARI
=====================================*/
class Thread1_ControlingMainThread {
    public static void main(String[] args) {
        
        Thread t= Thread.currentThread();
        
        System.out.println("Current running thread is : "+t.getName());
        System.out.println("Current running thread is : "+t);

        //Change thread name
        t.setName("Master Thread");
        System.out.println("Current running thread is : "+t.getName());
        System.out.println("Current running thread is : "+t.getPriority());
        System.out.println("Current running thread is : "+t);
        System.out.println("============\n\n\n");

       // Suspend thread using sleep method
       // sleep() method throws InterruptedException
       // it has been defined as => 
       // static void sleep(long milliseconds) hrows InterruptedException
       // static void sleep(long milliseconds, int nanoseconds) hrows InterruptedException
        try{
            for(int n=0;n<5;n++){
                System.out.println(n);
                t.sleep(1000);
            }
            
        }catch(InterruptedException e){
            System.out.println("Main thread is Interupted");
        }
        
    }
}
