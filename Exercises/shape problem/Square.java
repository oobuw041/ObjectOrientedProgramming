class Square extends Shape{
	private double length;
	private double center;
	
	public Square() {
	        super();
			center = 0;
	        length = 0; }
		

	public Square ( double x, double y, double length, double center){
        super(x, y);
        this.length = length;
		this.center = center;
	}
	
	
	public double getLength (){
		return length;
	}
	
 @Override
   public double [] getParameters(){ //A square has a center and the length of the side
  	 double [] params = new double []{this.center, this.length};
         return params; 
}
  @Override
   public void setParameters(double centerNew, double lengthNew){ //A triangle has a center and the length of the side
		this.center = centerNew;
		this.length = lengthNew;
	}
	
	 @Override
	public double area(){
		double area = length * length;
		return area;
	}
	 @Override
	public double perimeter(){
		double peri = 4 * length;
		return peri;
	}
	
	public void moveTo( double x, double y ) {
		super.moveTo(x,y);
		}
	
	public String toString (){
		return "Located at :("+ x + ","+ y+"), with length  "+ length;
	}
	
}
	
	