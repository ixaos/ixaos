package test;

import java.util.Scanner;

public class Lessons2 {
	int j,k,k1;
	Scanner scn;
	String s,sum,sum1;
	
	public void Scan(){
		System.out.println("Please enter no more than 4 x numbers");
		scn = new Scanner(System.in);
		s = scn.nextLine();
		scn.close();
	}
	public void Split(){
		String parts[] = s.split("");
		sum = parts[0]+parts[1];
		sum1= parts[2]+parts[3];
		k=Integer.parseInt(sum);
		k1=Integer.parseInt(sum1);
	}
	public void Versus(){
		if(k>k1){
			System.out.println("Summ 1st combine WIN!");
		}else if(k==k1){
			System.out.println("The sum of the two combinations are equals");
		}else{
			System.out.println("Summ Second combine WIN!");
		}
	}
		}
