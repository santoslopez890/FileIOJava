package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            int count=0;
            /* We must use a try/catch when reading
             * in a file in case the file is not found
             */
            try {
                // Create the Scanner object using the file
                // as input
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));


                /* Loop while the file still has lines.
                 * .hasNext() looks to see if a line exists
                 * but it doesn't read the line.
                 */
                while (fileIn.hasNext())
                {
                    // Reads the entire line
                    String lineIn = fileIn.nextLine();
                    // Output the line
                    count += fileIn.nextInt();
                    System.out.println("count is "+count);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}