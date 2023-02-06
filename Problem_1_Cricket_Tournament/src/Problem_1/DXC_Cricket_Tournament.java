package Problem_1;

import java.util.Scanner;

public class DXC_Cricket_Tournament {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int prices[]= {200,250,300};
		int[] cart=new int[3];
		
		int totalcost=0,discount=0;
		int finalamount;
		
		System.out.println("Enter No of Round-neck t-shirt in cart");
		cart[0]=sc.nextInt();
		System.out.println("Enter No of Collared t-shirt in cart");
		cart[1]=sc.nextInt();
		System.out.println("Enter No of Hooded t-shirt in cart");
		cart[2]=sc.nextInt();
		
		for(int i=0;i<3;i++)
		{
			totalcost=totalcost+(cart[i]*prices[i]);
		   
		}
		int totalshirts=cart[0]+cart[1]+cart[2];
		if(totalshirts<5)
		{
			discount=0;
		}
		else if(totalshirts>=5 && totalshirts<=10)
		{
			discount=10;
		}
		else if(totalshirts>10) {
			discount=20;
		}
		finalamount=totalcost-(totalcost*(discount/100));
		System.out.println("Final price is Rs."+finalamount);
	}

}
