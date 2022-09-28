package abstractlab;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		student s1 = new student();
		employee e1 = new employee();
		s1.fname = "Nandon";
		s1.lname = "Nowens";
		e1.fname = "Prandon";
		e1.lname = "Powens";
		
		
		System.out.println("*********************************");
		System.out.println(s1.fname + " " + s1.lname);
		System.out.println(e1.fname + " " + e1.lname);
		System.out.println("*********************************");
		Person p1 = new student();
		Person p2 = new employee();
		p1.fname = "Grandon";
		p1.lname = "Gowens";
		p2.fname = "Landon";
		p2.lname = "Lowens";
		
		System.out.println(p1.fname + " " + p1.lname);
		System.out.println(p2.fname + " " + p2.lname);
		System.out.println("*********************************");
		
		p1.taxes(120);
		
		List<student> studentArray = new ArrayList<student>();
		List<employee> employeeArray = new ArrayList<employee>();
		studentArray.add(s1);
		employeeArray.add(e1);
		
		school sch1 = new school();
		sch1.students.add(s1);
		sch1.employees.add(e1);
		
		for(student temp: studentArray) {
			System.out.println(temp);
		}
		
	}

}
