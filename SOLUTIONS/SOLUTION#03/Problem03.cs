using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter your input: ");
            string input = Console.ReadLine();

            Dictionary<char, int> characters = new Dictionary<char, int>();
            int otherCharacters = 0;

            foreach (char letter in input.ToLower())
            {
                if (char.IsLetter(letter))
                {
                    if (characters.ContainsKey(letter))
                    {
                        characters[letter]++;
                    }
                    else
                    {
                        characters[letter] = 1;
                    }
                }
                else
                {
                    otherCharacters++;
                }
            }

            Console.WriteLine("Output:\n {");
            foreach (char letter in characters.Keys.OrderBy(c => c))
            {
                Console.WriteLine($"  {letter}: {characters[letter]},");
            }
            Console.WriteLine($"  etc: {otherCharacters}\n}}");

            Console.ReadLine();
        }
    }
}
