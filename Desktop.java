package AssingmentWeek3Day1;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Calling desktop call from Desktop Class");
	}

	public static void main(String[] args) {
		Desktop ds = new Desktop();
		ds.conputerModel();
		ds.desktopSize();
	}

}
