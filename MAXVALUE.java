package TASK2;

import java.util.Scanner;

public class MAXVALUE {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
        //input array 

int []arr= new int[10];//Declare array
for(int i=0;i<10; i++)  //run from 0 to 9 to takes 10 inputs
{
System.out.println("enter elements:"+i);//ask for element at index i
arr[i]=Sc.nextInt();//store input in array
}
         //find maximum value in array

int max=arr[0];//Declare variable max and assign 0index value to it
for(int i=0;i<10; i++) //check array and compare with max
{	if(arr[i]>max)//this condition check that array[i] is greater than max
{
	max=arr[i];//if greater than assign its value to max
}
}
System.out.println("maximum value is"+max);//print maximum value
}


	}


