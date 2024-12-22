using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication14
{
 
    class Program
    {
       static void Main(string[] args)
        {
            string[]s  = Console.ReadLine().Split();
           
           int x,y;
            x = int.Parse(s[0]);
            y = int.Parse(s[1]);

            if (x>y)
            {
               Console.WriteLine(">");
            }
            else if (x < y)
            {
                Console.WriteLine("<");
            }
            else
            {
                Console.WriteLine("==");
            }
        }
    }
}
/* 
 */