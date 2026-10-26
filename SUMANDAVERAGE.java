package TASK3;

import java.util.Scanner;

public class SUMANDAVERAGE {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		//Declare an array of 10 integer
		  int []arr= new int[10];   
          for(int i=0;i<10; i++){
	  System.out.println("enter elements:"+i);//ask for element at index i
	  arr[i]=Sc.nextInt();//store input in array
	}
        //calculate sum of all elements
          int sum=0;
          for(int i=0;i<10; i++) {
        	  sum=sum+arr[i];  //adding each element to sum
          }
          
          //calculate average of element
          double average=(double)sum/arr.length;
          //count how many elements are greater than average
          int countgreater=0;
          for(int i=0;i<10; i++) {
        	  if(arr[i]>average) {
        		  countgreater++;
        	  }
          }
          //display results
          System.out.println("\n--results--");
          System.out.println("sum of all elements"+sum);
          System.out.println("average of elements" +average);
          System.out.println("no of elements greater than average"+countgreater);

}}
