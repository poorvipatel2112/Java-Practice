class Rthread implements Runnable{
    public void run(){
        for(int i =0 ; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+ " " +i);
        }
    }

    public static void main(String [] args){
        Runnable r = new Rthread();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
    
        t1.start();
        t2.start();
    }
}
