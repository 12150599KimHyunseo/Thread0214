class Worker extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("작업 스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}


public class ThreadOne {
   public static void main(String[] args) {
       int alphabet = 'a';
       Worker w = new Worker();
       w.start();

       while (w.isAlive()) {
           System.out.println("메인 스레드 : " + (char) alphabet++);
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
           }
       }
   }
}
