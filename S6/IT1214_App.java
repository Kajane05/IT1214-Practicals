class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default Name";
	}
	
}



class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo Class App");
		
		Student s1=new Student(); //Student is constructor
		s1.marks=100;
		s1.name="Alice";
		System.out.println("The name of the student is "+s1.name+" and marks is "+s1.marks);
		
		Student s2=new Student();
		s2.marks=80;
		//s2.name="Bob";
		System.out.println("The name of the student is "+s2.name+" and marks is "+s2.marks);
		
	}
}
