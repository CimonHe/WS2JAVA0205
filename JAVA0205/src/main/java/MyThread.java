import java.util.Random;
public class MyThread extends Thread{
    int present;
    int n;

    public MyThread(int present, int n) {
        this.present = present;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = present; i <= present + ((int) Math.sqrt(n)) + 1&&i<=n; i++)
        {
            Random random=new Random();
            if (random.nextInt(2)==0)
                System.out.println("新年快乐，孤寡孤寡");
            else
                System.out.println("新年新对象，年年不一样");
        }

    }
}
