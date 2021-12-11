package AssingmentWeek3Day1;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Calling student name from Student class");
	}
	public void studentDept()
	{
		System.out.println("Calling student department from Student class");
	}
	public void studentId()
	{
		System.out.println("Calling student ID from Student class");
	}
	public static void main(String[] args) 
	{
	Student st = new Student();
	st.collegeName();
	st.collegeCode();
	st.collegeRank();
	st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
	}
}