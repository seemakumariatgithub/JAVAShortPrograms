import java.lang.Thread;
//TechMahindra
class Main {
    public static void main(String[] args) {
        int number=10;
        createThread cThread=new createThread(number);
        Thread t1=new Thread(
            new Runnable(){
                public void run(){
                    cThread.printEven();
                }
            }
            );
            Thread t2=new Thread(
            new Runnable(){
                public void run(){
                    cThread.printOdd();
                }
            }
            );
            t1.setName("Even");
            t2.setName("Odd");
            t2.start();
            t1.start();
    }
}

class createThread{
    
    volatile static int counter=1;
    int limit;
    createThread(int limit){
        this.limit=limit;
    }
    
    public synchronized void printEven(){
        while(counter<=limit){
            if(counter%2==0){
                System.out.println(Thread.currentThread().getName()+":" + counter);
                counter++;
                notifyAll();
            }else{
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public synchronized void printOdd(){
        while(counter<=limit){
            if(counter%2==1){
                System.out.println(Thread.currentThread().getName()+": "+ counter);
                counter++;
                notifyAll();
            }else{
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
