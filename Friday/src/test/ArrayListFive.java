package test;

import java.util.*;
public class ArrayListFive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>firstPrimeNum= new ArrayList<>();
	      firstPrimeNum.add(2);
	      firstPrimeNum.add(3);
	      firstPrimeNum.add(4);
	      firstPrimeNum.add(5);
	      List<Integer>firstTen=new ArrayList<>(firstPrimeNum);
	     List<Integer>NextInteger= new ArrayList<>();
	     NextInteger.add(2);
	     NextInteger.add(3);
	     NextInteger.add(4);
	     NextInteger.add(5);
	     
	     firstTen.addAll(NextInteger);
	     System.out.println(firstTen);
	
	}

}
