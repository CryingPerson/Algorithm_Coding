using System;
class TestStack
{
    public static void Main(String[] args)
    {
       int N=int.Parse(Console.ReadLine());
       string s=Console.ReadLine();

        String[]a=new String[N];

        int sum = 0;

        for(int i=0;i<a.Length;i++)
        {
            a[i] = Convert.ToString(s[i]);
            sum += int.Parse(a[i]);
        }
        Console.WriteLine(sum);
    }


}