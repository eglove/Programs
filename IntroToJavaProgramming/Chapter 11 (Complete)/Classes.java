import java.util.*;

public class Classes {
	public static void main(String[] args) {
		m(new Person("Mike"));
		m(new Student("Joe"));
		m(new Employee("Jill"));
		m(new Faculty("Jerry"));
		m(new Staff("Deerrr"));
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class Person () {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	@Override
	public String toString() {
		return "Person " + name;
	}
}

class Student extends Person {
	public static String freshman;
	public static String sophmore;
	public static String junior;
	public static String senior;
	
	@Override
	public String toString() {
		return "Student";
	}
}

class Employee extends Person {
	protected String office;
	protected int salary;
	protected Calendar dateHired;
	
	@Override
	public String toString() {
		return "Employee";
	}
}

class Faculty extends Employee {
	protected String officeHours;
	protected int rank;
	
	@Override
	public String toString() {
		return "Faculty";
	}
}

class Staff extends Employee {
	protected String title;
	
	@Override
	public String toString() {
		return "Staff's title is " + title;
	}
}