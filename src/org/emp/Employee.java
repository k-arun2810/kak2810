package org.emp;

public class Employee {
	public void empInfo(String name) {
		System.out.println("Employee Name -"+ name);
	}
	public void empInfo(String email, int empId) {
		System.out.println("Employee Email ID -"+ email+"Employee ID - "+ empId);
	}
	public void empInfo(long mobile) {
		System.out.println("Employee mobile No-"+ mobile);
	}public void empInfo(char gender, int age) {
		System.out.println("Employee Gender is -"+ gender+"Employee age is"+ age);
	}
	public void empInfo(float salary) {
		System.out.println("Employee salary is"+ salary);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empInfo("Nivi");
		e.empInfo("nivi@gmail.com", 101);
		e.empInfo(8220771042f);
		e.empInfo('F', 24);
		e.empInfo(31000.250f);
	}
}