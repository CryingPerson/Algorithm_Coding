using System;
using static System.Console;

class MainApp
{
    static void Main()
    {
        int N = int.Parse(ReadLine());
        string[] words = new string[N];
        int count = 0;
        for(int i=0; i < N; i++)
        {
            words[i] = Console.ReadLine();
        }
        for (int i = 0; i < N; ++i)
        {
            if (check(words[i]))
            {
                count++;
            }
        }
        Console.WriteLine(count);
    }
    static bool check(String words)
    {
        for(int i=0; i<words.Length; i++)
        {
            for(int j=0; j<words.Length; j++)
            {
                if(j-i>1)
                {
                    if(words[j] == words[i])
                    {
                        return false;
                    }
                    
                }
                if (words[j] == words[i])
                {
                    i +=j - i;
                }
            }
        }
        return true;
    }

}