
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
 
namespace Hello_World
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int sum = 0;
            int currentValue = 0;
            for (int i = 0; i <= N; i++)
            {
                currentValue = i;
                sum = 0;
                sum +=  i;
                while (currentValue != 0)
                {
                    sum += currentValue % 10;
                    currentValue /= 10;
                }
                if (sum == N)
                {
                    Console.WriteLine(i);
                    break;
                }
            }
            if(sum != N)
            Console.WriteLine("0");
        }
    }
}
