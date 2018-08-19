//import java.util.*;
class FrequencyOfIntegerArray
{
    public static void main(String args[]){
        java.util.HashMap<Integer,Integer> h = new  java.util.HashMap<Integer,Integer>();
        int arr[] = new int[]{1,5,2,1,5,9,5,5,8,3};
        for(int i=0; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 1);
            }
        }
	for (Object obj : h.entrySet()) {
   	 java.util.Map.Entry<Integer,Integer> entry = (java.util.Map.Entry) obj;
   	 System.out.print("Number: " + entry.getKey());
   	 System.out.println(", Count: " + entry.getValue());
	}

        //System.out.println(h);
    }
}