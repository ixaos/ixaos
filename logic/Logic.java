package logic;

import java.util.Scanner;

public class Logic { 
	int k,i;
	String s,j;
	private Scanner scn;
	
	public void Scan(){
	System.out.println("¬ведите число");
	scn= new Scanner(System.in);
	
	String s = scn.nextLine();
	k = Integer.parseInt(s);
	}
	public int Versus(){
		if(k==1221){
			System.out.println(k+" is true");
		}else if(k==1234){
			System.out.println(k+" is false");
		}
		return k;
	}}
	
	
	
