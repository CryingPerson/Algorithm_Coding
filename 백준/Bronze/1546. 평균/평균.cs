using System;
class TestStack
{
    public static void Main(String[] args)
    {
       int N=int.Parse(Console.ReadLine());
       double[]arr=new double[N];
        String[]s=Console.ReadLine().Split(' ');
        double Max = 0.0;
        double FindNum = 0.0;
        for (int i = 0; i < N; i++)
        {
            arr[i]=double.Parse(s[i]);
            if (arr[i]>Max)
            {
                Max = arr[i];
            }
            FindNum += arr[i];
        }
        Console.WriteLine(FindNum / Max * 100 / N);
        
    }


}