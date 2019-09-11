package test;

import java.util.*;

public class SearchElementsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<5;i++)
		{
			names.add(sc.next());
		}
System.out.println("Does the name"+names.contains("maria") );
System.out.println("index of steve"+names.indexOf("steve"));
Iterator<String> itr=names.iterator();
while(itr.hasNext())
{
	 System.out.println(itr.next());
}
	}

}
