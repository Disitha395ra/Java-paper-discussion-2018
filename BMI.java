import java.util.*;
class BMI{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter height in inches :");
		double height=input.nextDouble();
		System.out.print("Enter weight in pounds :");
		double weight=input.nextDouble();
		
		height=height*0.0264;
		weight=weight*0.48359237;
		
		double bmi=(weight)/height*height;
		System.out.print("your BMI is :"+bmi);
		System.out.print('\n');
		System.out.println("underweight BMI <18.5");
		System.out.println("normal 8.5<= BMI <25 ");
		System.out.println("overweight 25<= BMI <30 ");
		System.out.println("obesity BMI >=30");
		System.out.print('\n');
		System.out.print('\n');
		
		if(bmi<18.5){
			System.out.println("According to above chart you are underweight");
		}else if(8.5<=bmi && bmi<25){
			System.out.println("According to above chart you are normal");
		}else if(25<=bmi && bmi<30){
			System.out.println("According to above chart you are overweight");
		}else if(bmi>=30){
			System.out.println("According to above chart you are obesity");
		}
	}
}
