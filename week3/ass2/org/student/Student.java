package homeassignments.week3.ass2.org.student;

import homeassignments.week3.ass2.org.department.Department;

public class Student extends Department {
	
	public static void main(String[] args) {
		Student st = new Student();
		st.studentName();
		st.studentId(5);
		st.deptName("Computer Science");
		st.studentDept();
		st.collegeName("Anna Adharsh");
		st.collegeCode(1);
		st.collegeRank(14);
			}

	
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("N.Nandhini");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
System.out.println("B.sc");
	}

	public void studentId(int i) {
		// TODO Auto-generated method stub
System.out.println(i);
	}
}
