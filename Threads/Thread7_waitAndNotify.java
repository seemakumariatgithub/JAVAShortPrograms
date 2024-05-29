/*==================================
AUTHOR : SEEMA KUMARI
=====================================*/
/*
//wait(), notify(), notifyAll(), All three methods can be called only from within a synchronized context
//general form of these method is :
//final void wait()
//final void wait(long millisec)
//final void wait(long millisec,int nanosec)

//final void notify()
//final void notifyAll()

//These methods are defined in object class
*/

class Thread7_waitAndNotify {
    public static void main(String[] args) {
        Q testQ = new Q();
        new Producer(testQ);
        new Consumer(testQ);
        System.out.println("Press ctrl+C to stop.");
    }
}
class Q{
    int n;
    boolean valueSet=false;
        synchronized void put(int n){
        while(valueSet){
            try{
            wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        this.n=n;
        valueSet=true;
        System.out.println("put: "+n);
        notify();
    }
    
    synchronized int get(){
        while(!valueSet){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        valueSet=false;
        System.out.println("Got: "+n);
        notify();
        return n;
    }
}

class Producer implements Runnable{
    Thread prTh;
    Q myQueue;
    
    Producer(Q queue){
        this.myQueue=queue;
        prTh=new Thread(this,"Producer");
        prTh.start();
    }
    
    public void run(){
        int i=0;
        
        while(true){
            myQueue.put(i++);
        }
    }
    
    
}

class Consumer implements Runnable{
    Thread cnTh;
    Q myQueue;
    
    Consumer(Q queue){
        this.myQueue=queue;
        cnTh=new Thread(this,"Consmer");
        cnTh.start();
    }
    
    public void run(){
        while(true){
            myQueue.get();
        }
    }
}
