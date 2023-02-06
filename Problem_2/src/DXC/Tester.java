package DXC;

public class Tester {

	public static void main(String[] args) {
		Point p1=new Point(2,3);
		p1.distance();
		Point p2=new Point(5,6);
		p2.distance();
		
		System.out.println("The distance of P1 from origin is : "+p1.distance());
		System.out.println("The distance of P1 from origin is : "+p2.distance());
		System.out.println("The distance of P1 from origin is : "+p1.distance(p2));
		

	}

}
