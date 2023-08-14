class MyShape{
	public static void  main(String args[]){
	
	Cylinder c1 = new Cylinder();
	Cylinder c2 = new Cylinder("Blue",2.0,10.5);
	
	Cone n1 = new Cone();
	Cone n2 = new Cone("Red",7.0,15.0);
	
	System.out.println("---------------");
	System.out.println("Cylinder 1");
	c1.display();
	
	System.out.println("\n");
	
	System.out.println("---------------");
	System.out.println("Cylinder 2");
	c2.display();
	
	System.out.println("\n");
	
	System.out.println("---------------");
	System.out.println("Cone 1");
	n1.display();
	
	System.out.println("\n");
	
	System.out.println("---------------");
	System.out.println("Cone 2");
	n2.display();
	
	System.out.println("updatin cone 2");
	c2.setcolor("Green");
	c2.setradius(7.0);
	
	System.out.println("---------------");
	n2.display();
	
	}
}
