// Java program to convert a decimal
// number to binary number
import java.io.*;
 
class D2B
{
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
  
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
  
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
     static int find(int decimal_number)
    {
        if (decimal_number == 0) 
            return 0; 
             
        else
         
        return (decimal_number % 2 + 10 * 
                find(decimal_number / 2));
    }
     
    // driver program
    public static void main (String[] args) 
    {
        int n = 17;

 	int decimal_number = 10;
    	System.out.println(find(decimal_number));

        //decToBinary(n);
    }
}