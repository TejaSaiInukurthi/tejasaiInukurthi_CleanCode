package interest;


public class Interest {
	public double compound_interest(double principle_amount,double rate,double time)
	{
		double total_interest;
		total_interest = principle_amount*Math.pow((1+rate/100),time);
		return total_interest;
	}
	public double simple_interest(double principle_amount,double rate,double time)
	{
		double total_interest;
		total_interest = (principle_amount*rate*time)/100;
		return total_interest;
	}
}
