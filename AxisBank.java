package AssingmentWeek3Day1;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit interest rate = 8% from Axis bank class");
	}
	public static void main(String[] args) {
		AxisBank as = new AxisBank();
		as.saving();
		as.fixed();
		as.deposit();
	}
}