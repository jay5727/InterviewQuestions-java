class PrePostIncrement
{
	public static void main(String args[])
	{
		int a = 10,b,c;
		b= (++a) + (a++); // 11 + 11 but a is 12 for next line.
		System.out.println("a "+a);//12
		System.out.println("b "+b);//22
		c= (b--) + a +(a++); //22 + 12 + 12 = 46 //but a is 13 for next line & b is 21.
		System.out.println(a +","+ b +","+c);
		System.out.println("a "+a);//Now a is 13
		System.out.println("b "+b);//Now b is 21
		
	}

}