using System;
class TestStack
{
    public static void Main(String[] args)
    {
        String[] s = Console.ReadLine().Split(' ');
        int A = int.Parse(s[0]);
        int B = int.Parse(s[1]);

        int C=int.Parse(Console.ReadLine());

        int NewA;
        int NewB;

        if(B+C<60)
        {
            NewB = B + C;
            Console.WriteLine("{0} {1}", A, NewB);
        }
        else if(B+C>=60)
        {
            NewA = A + (B + C) / 60;
            NewB = (B + C) - 60*((B + C) / 60);
            if(NewA == 24)
            {
                NewA = 0;
            }
            if(NewA > 24)
            {
                NewA = NewA - 24;
            }
            Console.WriteLine("{0} {1}", NewA, NewB);
        }
    }


}