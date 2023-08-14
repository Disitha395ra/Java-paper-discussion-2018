class Circle{
	
	//private data fields
	private  String color;
	private double radius;
	
	//no-arg constructor
	Circle(){
		color="red";
		radius=1.0;
	}
	
	//a constructor with specified radius value
	Circle(double radius){
		this.color="red";
		this.radius=radius;
	}
	
	//a constructor with specified radius and coor value
	Circle(String color,double  radius){
		this.color=color;
		this.radius=radius;
	}
	
	//getradius() method
	public double  getradius(){
		return this.radius;
	}
	//setradius() method
	public  void setradius(double radius){
		this.radius=radius;
	}
	//getcolor() method
	public  String getcolor(){
		return this.color;
	}
	//setcolor() method
	public void setcolor(String color){
		this.color=color;
	}
	
	//getarea() method
	public double getarea(){
		return Math.PI*radius*radius;
	}
}

