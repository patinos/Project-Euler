/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

import java.io.*;
import java.util.*;

public class evenFibNum{
	public static void main(String args[]){
		int x,y,z;
		int sum=0;
		z=1;
		y=0;
		x=0;
		while(x<=4000000){
			y=x;
			x=z;
			z=x+y;
			if(z%2==0)
				sum=sum+z;
		}
		System.out.println("The sum of the even-valued Fibonacci terms that are less than 4 million is: "+ sum);
	}
}