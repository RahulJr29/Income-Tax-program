/*Name- Rahul Dey
  Sec-B
  Roll-63*/
class IncomeTax
{
	public static void main(String rahul[])
	{
		int i=Integer.parseInt(rahul[0]);
		double j=0.0;
		if(i<=50000)
		{
			System.out.println("Income tax is Rs."+j+"/-");
		}
		else if(i>50000 && i<=60000)
		{
			j=0.1*(i-50000);
			System.out.println("Income tax is Rs."+j+"/-");
		}
		else if(i>60000 && i<=150000)
		{
			j=0.2*(i-50000);
			System.out.println("Income tax is Rs."+j+"/-");
		}
		else if(i>150000)
		{
			j=0.3*(i-50000);
			System.out.println("Income tax is Rs."+j+"/-");
		}
	}
}