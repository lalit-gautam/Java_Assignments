////Java Program to Find the Sum of the Series 1/1+1/4+1/9+...1/N^2
package com.ps.assignemt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignement02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try{
            System.out.println("Enter the number of terms in the series");
            n = Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        double sum = 0;
        double i;
        for(i=1; i<=n;i++){
            sum +=(1/(Math.pow(i,2)));
        }
        System.out.println("The sum is " + sum);
	}

}
