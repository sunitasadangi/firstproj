package com.sjp.javaProgram;



public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int num=41;
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
 
			if(num%i==0)
				 flag=true;
			else
				flag=false;
		}
		if(!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		

}
}
