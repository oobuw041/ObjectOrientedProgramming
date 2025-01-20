import java.lang.Math;

public class Circle extends Shape {
    private double radius;
	private double center;
	public static final double PI = 3.141592653589793;


    public Circle() {
        super();
       radius = 0;
       center = 0; } 
	   
	   
    public Circle( double x, double y, double radius, double center ) {
	           super( x, y );
	           this.radius = radius;
			   this.center = center; }
		   
 @Override 
 public double[] getParameters(){ //A circle has a center and a radius 
	 double [] params = new double []{this.center, this.radius};
       return params; }
						 
  public double getRadius() {
	   return radius; }
	
  public double getCenter(){
	  return center; }
		   

		 
@Override 		
public void setParameters(double centerNew, double radiusNew){ //A circle has a center and a radius
	 		this.center = centerNew;
	 		this.radius = radiusNew;
	 	}
			
  @Override
 public double area(){
		return Math.PI * radius * radius;
		   }
		   
		   
	@Override
  public double  perimeter(){
		   return 2 * Math.PI * radius;
		 }
		 
			
	public void moveTo( double x, double y ) {
		super.moveTo(x,y);
		}
	      		   
     public String toString() {
	   return "Located at: (" + x + "," + y + "), with radius  "+ radius;
		 }		
				   
	
	
}