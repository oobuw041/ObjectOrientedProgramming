import java.util.Arrays;
class Main{
	public static void main(String[]args){
		Shape shape1 =  new Shape();
		Shape shape2 =  new Shape(3.5, 4.0);
		shape1.moveTo(2.0, 1.5);
		System.out.println(shape1.toString());
		System.out.println(shape1+ " and " + shape2);
		
		
		Circle circle1 =  new Circle();
		Circle circle2 =  new Circle(1.5, 2.0, 3.5, 2.5);
		circle2.moveTo(2.0, 1.5);
		circle2.setParameters(4.5, 2.6);
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		 double[] params = circle2.getParameters();
		System.out.println("Parameters: " + Arrays.toString(params));
		
		System.out.println(circle2.toString());
		System.out.println(circle1+ " and " + circle2);
	
		
	    Triangle  triangle1 =  new Triangle ();
	    Triangle triangle2 =  new Triangle (4.0, 3.7, 5.5, 4.8);
		triangle2.moveTo(2.0, 1.5);
		triangle2.setParameters(3.6, 1.6);
		System.out.println(triangle2.area());
		System.out.println(triangle2.perimeter());
		
	   double[] params1 = triangle2.getParameters();
	   System.out.println("Parameters: " + Arrays.toString(params1));

		System.out.println(triangle2.toString());
		System.out.println(triangle1+ " and " + triangle2);
		
		Square square1 =  new Square();
		Square square2 =  new Square(5.3, 2.6, 4.4, 7.8);
		square2.moveTo(2.0, 1.5);
		square2.setParameters(6.7, 2.8);
		System.out.println(square2.area());
		System.out.println(square2.perimeter());
		
  	   double[] params2 = square2.getParameters();
  	   System.out.println("Parameters: " + Arrays.toString(params2));
		
		System.out.println(square2.toString());
		System.out.println(square1+ " and " + square2);
		
		
		Pentagon pentagon1 =  new Pentagon();
		Pentagon pentagon2  =  new Pentagon(3.1, 6.7, 3.8, 7.4);
		pentagon2.moveTo(2.0, 1.5);
		pentagon2.setParameters(5.4, 7.9);
		System.out.println(pentagon2.area());
		System.out.println(pentagon2.perimeter());
		
    	double[] params3 = square2.getParameters();
    	System.out.println("Parameters: " + Arrays.toString(params3));
		
		System.out.println(pentagon2.toString());
		System.out.println(pentagon1+ " and " + pentagon2);
		
		
	}
}