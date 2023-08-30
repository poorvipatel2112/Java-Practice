public class Threading extends Thread{

    public static void main(String [] args){
    Threading th1 = new Threading();
    th1.start();
    }

    public void start(){
        System.out.println("thread is running!!!!!!");
    }
}




