import java.util.Scanner;

public class MaxMin {

    MaxMin() {
        int N = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input massive size:: ");
        N = in.nextInt();
        this.N = N;
        this.a = new double[N];
    }

    private int N;
    private int size = 0;
    private double a[];



    public double returnMin(){
        double min = a[0];
        for (int i = 0; i < size; i++)
        {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    public double returnMax(){
        double max = a[0];
        for (int i = 0; i < size; i++)
        {
            if (a[i] > max) max = a[i];
        }
        return max;
    }
    public double returnAverage(){
        double average = 0;
        for (int i = 0; i < size; i++)
        {
            average += a[i];
        }
        average = average / size;
        return average;
    }

    public boolean push (double val){
        if (size == N) {
            System.out.println("Out of bounds!");
            return false;
        }
        else {
            a[size] = val;
            size++;
        }
        return true;
    }

    public double show (int N)
    {
        return a[N];
    }
}