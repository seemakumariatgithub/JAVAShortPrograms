import java.util.*;
import java.lang.*;
import java.io.*;

class JAVA007_minimumCostforSubscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int numFr=sc.nextInt();
    		int cost=sc.nextInt();
		    System.out.println(getMinimumCost(numFr,cost));
		}

	}
	
	static int getMinimumCost(int num_fr,int cost){
	    int number_of_group;
	    if(num_fr%6>0)
	        number_of_group=(num_fr/6)+1;
	    else
	        number_of_group=(num_fr/6);
	    int totalCost=number_of_group*cost;
	    return totalCost;
	}
}
