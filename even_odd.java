/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr=new int[]{2,1,9,10,8,5};
		
		int o=0,e=0;
		while(o<6&&e<6)
		{
		    if(arr[e]%2==0){
		    e++;o++;}
		    else if(arr[o]%2==0)
		    {
		        int temp=arr[e];
		        arr[e]=arr[o];
		        arr[o]=temp;
		        e++;o++;
		    }
		    else
		    o++;
		}
		for(int i=0;i<e-1;i++)
		{
		    for(int j=0;j<e-1-i;j++)
		    {
		        if(arr[j]<arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int i=e;i<5;i++)
		{
		    for(int j=e;j<5-i+e;j++)
		    {
		        if(arr[j]<arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int i=0;i<6;i++)
		System.out.println(arr[i]);
	}
}