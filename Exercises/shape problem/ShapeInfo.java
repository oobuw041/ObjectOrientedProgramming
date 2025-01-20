public interface ShapeInfo {
	public abstract double area();
	public abstract double  perimeter();
	public abstract void setParameters(double centerNew, double lengthNew);
	public abstract double [] getParameters();
	public  abstract void moveTo(double x, double y);
}