
package test;
import java.util.Scanner;
import java.util.*;
import java.util.Iterator;
public class Hospital {
 private String PatientName;
	private int age;
	private String Issue;
	public Hospital(String PatientName,int age,String Issue)
	{
		this.PatientName=PatientName;
		this.age=age;
		this.Issue=Issue;
	}
	public void setPatientName(String PatientName)
	{
		this.PatientName=PatientName;
	}
	public String getName()
	{
		return PatientName;
	}
	public void setAge(int Age)
	{
		this.age=age;
	}

	public int getAge()
	{
		return age;
	}
	public void setgetIssue(String Issue)
	{
		this.Issue=Issue;
	}

	public String getIssue()
	{
		return Issue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Hospital> d=new ArrayList<>();
Scanner sc=new Scanner(System.in);
int age;
String PatientName;
String Issue;
for(int i=0;i<2;i++)
{
d.add(new Hospital(sc.next(),sc.nextInt(),sc.next()));	
}

for(Hospital h:d) {
	System.out.println(h.getAge()+h.getIssue()+h.getName());
}

}
}