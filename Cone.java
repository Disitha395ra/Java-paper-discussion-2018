class Cone extends Circle{
	
	//private data  fields
	private double height;  
	
	//no-arg constructor 
	Cone(){
		super();
		height=1.0;
	}
	
	//a  constructor  with specified radius value
	Cone(double radius){
		super(radius);
		this.height=1.0;
	}
	
	//a constructor with specified radius and height value 
	Cone(double  radius, double height){
		super(radius);
		this.height=height;
	}
	
	//a constructor with specified radius , height , color
	Cone(String color, double  radius, double  height){
		super(color,radius);
		this.height=height;
	}
	
	//getheight() method
	public double  getheight(){
		return this.height;
	}
	
	//setheight() method
	public void setheight(double  height){
		this.height=height;
	}
	
	//getvolume() method
	public double getvolume(){
		return getarea()*height/3;
		
	}
	
	//display() method
	public void display(){
		System.out.println("Cone radius is :"+getradius());
		System.out.println("Cone height is :"+getheight());
		System.out.println("Cone color is  :"+getcolor());
		System.out.println("Cone volume is :"+getvolume());
	}
}
