import java.util.*;
public class FirstCharOccurenceInString
{

   private String returnFirstRecurringCharInString (String s)
   {
	if(s==null || s=="")
	return null;
	
 	HashMap<String, String> hm= new HashMap<String, String>();
  	for(int i = 0; i <s.length(); i ++)
	{
		Character c= s.charAt(i);
		//System.out.println(c);
		Object o =hm.put(String.valueOf(c),"1");              
		if(o!=null)
		{
		return String.valueOf(c);
		} 
	}
	return "No Duplicates";	
   }
	public static void main(String args[]) 
	{
	    FirstCharOccurenceInString obj = new FirstCharOccurenceInString();
	    System.out.println(obj.returnFirstRecurringCharInString("hashmap")); 

	}
}


/*
public String returnFirstRecurringCharacter(String s)
{
hm = new HashMap<String,String>();
for(int i= 0; i <s.length() ; i++)
{
	 Character c= s.charAt(i);
	 Object o =hm.put(String.valueOf(c),"1");
	if(o!=null)
	{
		return	c.toString();
	} 
}
	return "No Duplicate";
}*/