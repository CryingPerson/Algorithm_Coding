using System;
using static System.Console;

class MainApp
{
    static void Main()
    {
        int N=int.Parse(Console.ReadLine());
        int lineCount = 1;
        int sumcount = 1;
        if (N == 1)
        {
            Console.WriteLine(1 + "/" + 1);
        }
        while (N > sumcount)
        {
            lineCount++;
            sumcount += lineCount;
            if (sumcount >= N)
            {
                int a = lineCount - (sumcount - N);
                int b = lineCount + 1 - a;
                if (lineCount % 2 == 1)
                {
                    Console.WriteLine(b + "/" + a);

                }
                else
                {
                    Console.WriteLine(a + "/" + b);
                }
            }
        }
    }

}