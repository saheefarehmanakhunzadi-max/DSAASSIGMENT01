package TASK2;

import java.util.Scanner;

public class MINVALUE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        //input array 

int []arr= new int[10];//Declare array
for(int i=0;i<10; i++)  //run from 0 to 9 to takes 10 inputs
{
System.out.println("enter elements:"+i);//ask for element at index i
arr[i]=sc.nextInt();//store input in array
}
          //find minimum value in array
int min=arr[0];
for (int i=0; i<10; i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
}
System.out.println("minimum value is"+min);//print minimum
	}


	}


