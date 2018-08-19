class MatrixProgram 
{

public static int arraySum(int[][] array){
    int total = 0;
  
    for (int i = 0; i< array.length;i++)
    {
	int val= array.length - i-1;
	System.out.println("i = "+i +" val = "+array.length+" - " + i +" - 1 = " +val);
	System.out.println(array[i][i]+","+array[i][val]);
	System.out.println("Before:" +total);
        total += array[i][i] + array[i][val];
	System.out.println("After:" +total+"\n");
    }

    return total;
}
public static int arrayDiff(int[][] array){
   
    int difference = 0 ; int primary =0;int secondary=0;
    for (int i = 0; i< array.length;i++)
    {
	int val= array.length - i-1;
	System.out.println("i = "+i +" val = "+array.length+" - " + i +" - 1 = " +val);

	primary += array[i][i];
	secondary += array[i][val];
	System.out.println("Primary Diagonal : "+ primary);
	System.out.println("Secondary Diagonal : "+ secondary);
    }

    return primary -secondary > 0 ?primary -secondary :(primary -secondary)*-1;
}

	

public static void main(String args[])
{

	int  a[][] ={	  {2,2,3}
           	  	 ,{4,5,6}
            	   	 ,{7,8,9}
            				};

	int  b[][] ={{5,6}
		    ,{9,8}};
	System.out.println(arrayDiff(a));	
}
}