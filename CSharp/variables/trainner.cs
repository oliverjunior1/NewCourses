using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Variables
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
             * Syntax
             * ___________________________________
            int myInt = 1;
            double myDouble = 2.2;
            string myString = "Jesus is the light of the World!";
            char myChar = 'o';
            bool myBool = false;

            Console.WriteLine("Integer=" + myInt);
            Console.WriteLine("Double= "+ myDouble);
            Console.WriteLine("String= "+ myString);
            Console.WriteLine("Char= "+ myChar);
            Console.WriteLine("Boolean= "+ myBool);
            Console.ReadLine();
            //______________________________________
            //Variables

            int myNum = 15;
            myNum = 20;
            Console.WriteLine(myNum);
            Console.ReadLine();

            //______________________________________
            Type Casting
            

            double myDouble = 9.78;
            int myInt = (int)myDouble;

            Console.WriteLine(myDouble);
            Console.WriteLine(myInt);
            Console.Read();
            //--------------------------------------
            Console.WriteLine("Enter Username:");
            String userName = Console.ReadLine();
            Console.WriteLine("Username is:" + userName);

            //---------------------------------------
           
            double x = Math.Max(5,10);
            
            Console.WriteLine(x);
            Console.ReadLine();
            //--------------------------------------
            
            //Math
            double x = Math.Sqrt(9);

            Console.WriteLine(x);
            Console.ReadLine();
            //-------------------------------------
            // String Interpolation
            
            string firstName = "John";
            string lastName = "Doe";
            string name = $"My full name is: {firstName} {lastName}";

            Console.WriteLine(name);
            Console.ReadLine();
            
            //---------------------if_else-----------------------
            int time = 20;
            if (time < 10)
            {
                Console.WriteLine("Good day.");
            }
            else
            {
                Console.WriteLine("Good evening.");
            }
            Console.ReadLine();
            
            //------------------else_ifelse_else----------------
            int time = 22;
            if (time < 10)
            {
                Console.WriteLine("Good day.");
            }
            else if (time < 20)
            {
                Console.WriteLine("Good day");
            }
            else
            {
                Console.WriteLine("Good evening");
            }
            Console.ReadLine();
            */
            //------------------short_if_else---------------------------
            int time = 20;
            string result = (time < 18) ? "Good day" : "Good evening.";
            Console.WriteLine(result);
            Console.ReadLine();
        }
    }
}
