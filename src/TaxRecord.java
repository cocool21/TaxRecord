import java.util.Scanner;
public class TaxRecord {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int num;
		double sales,total,tax;
		String name,code;
		
		System.out.println("Enter customer number:");
		num=keyboard.nextInt();
		
		System.out.println("Enter customer name:");
		name=keyboard.next();
		
		System.out.printf("Enter sales amount:");
		sales=keyboard.nextDouble();
		
		System.out.printf("Enter tax code:");
		code=keyboard.next();
		
		code=code.toUpperCase();
		
		if(code.equals("NRM"))
		{
			tax=0.06;
		}else if(code.equals("NRF"))
		{
			tax=0;
		}else if(code.equals("BIZ"))
		{
			tax=0.045;
		}else
		{
			System.out.println("code error");
			tax=-1;
		}
		total=tax*sales+sales;
		System.out.println("Your sales total is:"+total);
		
		keyboard.close();

	}

}
