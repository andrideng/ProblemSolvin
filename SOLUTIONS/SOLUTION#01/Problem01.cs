using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] locations = new string[] { "Bhin Bhin", "Atung", "Kaka", "Hodori", "Pan Pan", "Appu", "Lulu", "Orry", "Mei Mei" };

            Console.Write("Enter your number: ");
            string input = Console.ReadLine();
            int num;
            while (!int.TryParse(input, out num) || num <= 0)
            {
                Console.Write($"Enter an integer between 1 and {locations.Length - 1}: ");
                input = Console.ReadLine();
            }

            if (num >= locations.Length)
            {
                num = num % locations.Length;
            }
            num--;

            Console.WriteLine(locations[num]);

            Console.ReadLine();
        }
    }
}
