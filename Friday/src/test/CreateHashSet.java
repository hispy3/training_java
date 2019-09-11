package test;
import java.util.*;
public class CreateHashSet {
            
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("div by 5");
List<Integer> numDivBy5=new ArrayList<>();
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
	numDivBy5.add(sc.nextInt());
}
System.out.println("div by 3");
List<Integer> numDivBy3=new ArrayList<>();
for(int i=0;i<3;i++)
{
	numDivBy3.add(sc.nextInt());
}
	}
	Set<Integer>numdivBy5Or3=new HashSet<>(numDivBy3);

}
