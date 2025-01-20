class Triangle extends Shape{
	private double length;
	private double center;
	
	public Triangle(){
		super();
		center = 0;
		length = 0;}
	
	public Triangle( double x, double y,double length, double center){
		super(x,y);
		this.center = center;
		this.length = length;
	}
	
	public double getLength(){
		return length;
	}
	
	
	 @Override
	public  double area(){
		return 0.5 * length * length;
	}
	
	 @Override
	public double  perimeter(){
		return 3 * length;
	}
	
	 @Override
	public double[] getParameters(){ //A triangle has a center and the length of the side
   	 double [] params = new double []{this.center, this.length};
          return params; 
	}
	
	 @Override
	public void setParameters(double centerNew, double lengthNew){ //A triangle has a center and the length of the side
		this.center = centerNew;
		this.length = lengthNew;
	}
	
	 @Override
	public void moveTo( double x, double y ) {
		super.moveTo(x,y);
		}
	        
	
	
	public String toString(){
		return "Located at: ("+ x + ", " + y + "), with length  "+ length;
	}
	

	
	
}
