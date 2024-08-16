public class TestLine{
	public static void main (String args[]){
		Point p1 = new Point(1,2);
		Point p2 = new Point(5,6);
		Line l1 = new Line(p1,p2);
		Line l2 = new Line(4,8,1,4);
		/*System.out.println(l2.toString());
		System.out.println(l2.getLength());
		System.out.println(l2.getGradient());*/
		Line l3 = new Line(8,9,2,1);
		System.out.println(l3.toString());
		System.out.println("Length is : "+l3.getLength());
		System.out.println("Gradient is : "+l3.getGradient());
	}
}
