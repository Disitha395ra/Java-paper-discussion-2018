class Cylinder extends Circle{
	
	//private data  field
	private double height;
	
	//no -arg constructor with default value
	Cylinder(){
		super();
		height=1.0;
	}
	
	//a constructor with specified radius value
	Cylinder(double radius){
		super(radius);
		this.height=1.0;
	}
	
	//a constructor  with radius  and height value
	Cylinder(double radius, double height){
		super(radius);
		this.height=height;
	}
	
	//a constructor with radius , height , color value
	Cylinder(String color, double radius, double height){
		super(color,radius);
		this.height=height;
	}
	
	//getheight() method
	public double getheight(){
		return this.height;
	}
	
	//setheight() method
	public void setheight(double height){
		this.height=height;
	}
	
	//getvolume() method
	public double getvolume(){
		return getarea()*height;
	}
	
	//display() method
	public void display(){
		System.out.println("Clinder radius is :"+getradius());
		System.out.println("Clinder height is :"+getheight());
		System.out.println("Clinder color is  :"+getcolor());
		System.out.println("Clinder volume is :"+getvolume());
	}
}
