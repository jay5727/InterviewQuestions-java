import java.util.StringTokenizer;

public class Occurence {

  public static void main(String[] args) {
    String key=null,str ="my name noorus my name noorus";        
    int i=0,tot=0;

    StringTokenizer st=new StringTokenizer(str," ");
    while(st.hasMoreTokens())
    {   
        tot=tot+1;
        key = st.nextToken();
        while((i=(str.indexOf(key,i)+1))>0)
        {
            System.out.println("position of "+key+" "+"is "+(i-1));
        }
    }

    System.out.println("total words present in string "+tot);
  }
}

