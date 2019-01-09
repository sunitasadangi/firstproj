package com.sjp.javaProgram;

public class PrimeNumber2 {

	public static void main(String[] args) {
  
		int num=29;
		int i=2;
		boolean flag=true;
		while(i<=num/2) {
			if(num%i==0)
				flag=true;
			else
				flag=false;
			break;
		}
		i++;
		if(!flag)
			System.out.println(num+" is  a prime number");
		else
			System.out.println(num+" is not  a prime number");

	}

}
