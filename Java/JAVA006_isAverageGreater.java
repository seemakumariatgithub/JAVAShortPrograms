import java.util.*;
import java.lang.*;
import java.io.*;

class JAVA006_isAverageGreater
{
	public static void main (String[] args) throws java.lang.Exception
	{
    		Scanner sc=new Scanner(System.in);
    		int count=sc.nextInt();
    		for(int i=0;i<count;i++){
    		    List<Integer> input=new ArrayList<Integer>();
    		    for(int j=0;j<3;j++){
        		    input.add(sc.nextInt());
    		    }
    		    System.out.println(isGreaterAvg(input));
    		}
	}
	
	public static String isGreaterAvg(List<Integer> testCaseList){
	    String result="no";
	    Integer sum=testCaseList.get(0) + testCaseList.get(1);
	    if(sum>2*testCaseList.get(2))
	        result="yes";
	   return result;
	}
}
