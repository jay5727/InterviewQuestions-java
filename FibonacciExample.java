class FibonacciExample
{
//Assign each number of Fibonacci series to alphabets i.e. a=0;b=1;c=1;d=2;e=3;f=5;.......y=46368; z=75025. 
//Then sum the given input string accordingly as below example.
//input : man
//Output : 377
//as m=144,a=0,n=233. So 144+0+233 = 377. 
//Write a java program for the above scenario
public static void main(String[] args)
{
	   String s1="man";int sum = 0;
           int []x=new int[26];
 	   int a = -1, b = 1,c=0;
           for (int i = 0; i <=25; i++)
           {               
           	c = a + b;
                a = b;
                b = c;
                x[i] = c;  
           }
           for (int i = 0; i < s1.length(); i++)
           {
               sum += x[s1.charAt(i) - 97];
           }
           System.out.println(sum);
}
}