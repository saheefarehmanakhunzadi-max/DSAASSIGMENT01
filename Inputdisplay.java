package TASK1;

import java.util.Scanner;

public class Inputdisplay {

	public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
		
		//task 1.2 display all elements of array
         int []arr= new int[10];      //Declare array
           for(int i=0;i<10; i++)       //run from 0 to 9 to takes 10 inputs
 {
	  System.out.println("enter elements:"+i);//ask for element at index i
	  arr[i]=Sc.nextInt();//store input in array
	 }
 System.out.println("display all elements"); //print heading
 for(int i=0;i<10; i++)  //run from 0 to 9 to display inputs
 {
	 System.out.println("arr"+i+"="+arr[i]);//display elements

 }
 //task 1 .3 display the elements in reserve order
 System.out.println("elements in reserve order");
 for(int i=9;i>=0; i--)  //run from 9 to 0 display inputs
 {
	 System.out.println("arr"+i+"="+arr[i]);//display elements

 }

 }


	}


