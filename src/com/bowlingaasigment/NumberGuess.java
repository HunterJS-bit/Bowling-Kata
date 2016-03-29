package com.bowlingaasigment;



public class NumberGuess
{                  
    public static void main (String[] args)
    {
       
    	int [] arr  ={ 18, 14, 82, 17, 2, 14, 6, 2, 18, 4};
    	int num = 2;
    	System.out.println(find(arr, num));
    	
 

    }
    public static int find(int[] arr, int thingToFind){


    	for(int i = 0;i<arr.length;i++){
    		if(arr[i]==thingToFind){
    			return i+1;
    		}
    	}
    	return -1;

    }


}