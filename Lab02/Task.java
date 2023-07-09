package Lab02;

public class Task 
{
    public static void runTogether(Runnable... tasks) 
    {
        Thread[] watki = new Thread[tasks.length];

        for (int i = 0; i < tasks.length; i++) 
        {
            watki[i] = new Thread(tasks[i]);
            watki[i].start();
        }

        for (Thread watek : watki) 
        {
            try 
            {
                watek.join();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
