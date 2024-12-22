using System;
class TestStack
{
    public static void Main(String[] args)
    {
        char[] alpa = new char[26];
        int[]arr=new int[26];
        for (int i = 0; i < 26; i++)
        {
            alpa[i] = (char)((int)'A' + i);
        }
        String s=Console.ReadLine().ToUpper();



        for(int i=0; i<s.Length; i++)
        {
            for(int j=0; j<alpa.Length; j++)
            {
                if(s[i]==alpa[j])
                {
                    arr[j]++;
                }
            }
        }
        int num = 0;
        int hight = 0;
        bool same = false;
        for (int i=0; i<arr.Length; i++)
        {
            if(arr[i]==hight && arr[i] !=0)
            {
                same = true;
            }
            if(arr[i]>hight)
            {
                hight = arr[i];
                num = i;
                same = false;
            }
        }
        if(same)
        {
           Console.WriteLine('?');
        }
        else
        {
            Console.WriteLine(alpa[num]);
        }
        

    }


}