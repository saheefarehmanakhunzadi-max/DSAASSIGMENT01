package TASK2;

import java.util.Scanner;

public class SECONDMIN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        //input array 

int []arr= new int[10];//Declare array
for(int i=0;i<10; i++)  //run from 0 to 9 to takes 10 inputs
{
System.out.println("enter elements:"+i);//ask for element at index i
arr[i]=sc.nextInt();//store input in array
}
   //find first minimum value
int min=arr[0];
int secmin=Integer.MAX_VALUE;
for (int i=0; i<arr.length; i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
	//FIND 2ND MIN VALUE
	for (int j=0; j<arr.length; j++) {
		if(arr[i]<min && arr[i]<secmin) {
			secmin=arr[i];
		}

	}

}}}
