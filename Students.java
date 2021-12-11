package AssingmentWeek3Day1;

public class Students 
{
public void getStudentInfo(int sid)
{
	System.out.println("Student ID = "+sid);
}
public void getStudentInfo(String sname)
{
	System.out.println("Student Name = "+sname);
}
public void getStudentInfo(String semail,int sphone)
{
	System.out.println("Student Email = "+semail);
	System.out.println("Student Number = "+sphone);
}
	public static void main(String[] args) 
	{
		Students st = new Students();
		st.getStudentInfo(21);
		st.getStudentInfo("Jagan");
		st.getStudentInfo("jagan@abc.com", 1987676767);
	}
}
