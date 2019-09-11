package test;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListFive11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addvalue;
      ArrayListFive11<Integer> i1=new ArrayListFive11<>();
	Scanner sc=new Scanner(System.in);
	
	for(int i=0; i<5;i++)
	{
		addvalue=sc.nextInt();
	   
	}
	Iterator<Integer> itr=i1.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	}

	

}
