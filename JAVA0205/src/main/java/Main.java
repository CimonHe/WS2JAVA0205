public class Main {
    public static void main(String[] args) {
        int n=999999998;
        int present=1;
        Thread[] thread = new MyThread[1000010];
        for (int i = 1; i <= ((int) Math.sqrt(n)) + 1; i++) {
            thread[i] = new MyThread(present,n);
            thread[i].start();
            present += (int) Math.sqrt(n) + 2;
    }
    }
}
