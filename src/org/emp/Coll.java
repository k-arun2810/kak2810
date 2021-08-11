package org.emp;

public class Coll extends Employee{
@Override
public void empInfo(char gender, int age) {
	System.out.println("Gender    Age");
	super.empInfo(gender, age);
}
@Override
	public void empInfo(String name) {
		System.out.println("Name");
		super.empInfo(name);
	}
public static void main(String[] args) {
	Coll x= new Coll();
	x.empInfo('K', 25);
	x.empInfo("Arun");
	System.out.println("123");
}

}
