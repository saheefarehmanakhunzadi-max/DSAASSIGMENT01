package TASK2;

import java.util.Scanner;

public class MAXMINBOTH {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
        //input array 

int []arr= new int[10];//Declare array
for(int i=0;i<10; i++)  //run from 0 to 9 to takes 10 inputs
{
System.out.println("enter elements:"+i);//ask for element at index i
arr[i]=Sc.nextInt();//store input in array
}
         //Declare variables
int max=arr[0];
int maxindex=0;
int min=arr[0];
int minindex=0;
int secmin=Integer.MAX_VALUE;
int secminindex=-1;

        //find largest and smallest with indices
for(int i=1;i<10; i++) {
	if (arr[i]>max) {
		max=arr[i];
		maxindex=i;
	}
	if(arr[i]<min) {
		min =arr[i];
		minindex=i;
	}
}

           //FIND 2ND MIN VALUE
for (int i=0; i<arr.length; i++) {
	if(arr[i]<min && arr[i]<secmin) {
		secmin=arr[i];
		secminindex=i;
		}
	}

           //display result with indexes
System.out.println("\n--results--");
System.out.println("maximum valu"+max+"at index"+maxindex);
System.out.println("minimum value" +min+"at index"+minindex);
System.out.println("second minimun value"+secmin+"at index"+secminindex);

	}

}
