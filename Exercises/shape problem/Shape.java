import java.lang.UnsupportedOperationException;

class Shape implements ShapeInfo  { 
	 protected double x;
	 protected double y;
	    
		
      public Shape() {
	        x = 0;
	        y = 0;}
 
 public Shape( double x, double y ) {
        this.x = x;
        this.y = y;
	 }
	 
	public double getX() { return x; }
    public double getY() { return y; }

	

	public  double area(){
		  throw new UnsupportedOperationException("Not compatible");
		
	}
	public  double  perimeter(){
		  throw new UnsupportedOperationException("Not compatible");
	}
	public  double []  getParameters(){
		  throw new UnsupportedOperationException("Not compatible");
	}
	
	public  void  setParameters(double centerNew, double lengthNew){
	   throw new UnsupportedOperationException("Not compatible");
	}
	
    public void moveTo( double x, double y ) {
   			this.x = x;
   			this.y = y;
   		}
		

   	 public String toString () {
   	       return "Located at: (" + x + "," + y + ")";
   	}
	
}
	
	
	
	
	
	
	/*
 A circle has a center and a radius
 A triangle has a center and the length of the side
 A square has a center and the length of the side
 A pentagon has a center and the length of the side (all sides of the pentagon are equal)
	*/
		//Ability to move the shape into a new location according to an offset x and offset y

