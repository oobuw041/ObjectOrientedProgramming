import java.lang.Math;
class Pentagon extends Shape {
	
	private double length;
	private double center;
	
	public Pentagon(){
		super();
		this.length = 0;
		this.center = 0;
	}
	public Pentagon(double x , double y, double length, double center){
		super(x,y);
		this.length = length;
		this.center = center;
	}
	
	public double  getLength(){
		return length;
	}
	
	 @Override
	public  double [] getParameters(){ //A pentagon has a center and the length of the side (all sides of the pentagon are equal)
   	 double [] params = new double []{this.center, this.length};
          return params; 
	}
	
   @Override
   public  void setParameters(double centerNew, double lengthNew){ //A pentagon has a center and the length of the side (all sides of the pentagon are equal)
	this.center = centerNew;
	this.length = lengthNew;
       }
	   
  	 @Override
  	public  double area(){
		double constant = Math.sqrt(5 *(5+2*Math.sqrt(5)));
  		return 0.25 * constant *length *length;
  	}
	
  	 @Override
  	public  double  perimeter(){
  		return 5 * length;
  	}
	
	 @Override
	public void moveTo( double x, double y ) {
		super.moveTo(x,y);
		}
	        
	
	public String  toString(){
		return "Located at:("+ x + "," + y+"), with length " + length;
	}
	
}
	