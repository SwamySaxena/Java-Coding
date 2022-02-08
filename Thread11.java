public class Thread1 extends Thread{
    Linearsearch L;
    public Thread1(Linearsearch L){
        this.L = L;
    }

    public void run(){
        L.linearsearch();
    }
    
}
