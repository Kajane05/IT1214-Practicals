class Student{
	String name="Adam";
	int marks=100;
	Student(){
		name="NoName";
	}
	
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
}


class StudentDemo{
	public static void main(String[] args){
		System.out.println("From Student Demo Class");
		System.out.println("Creating an object of Student Class");
		Student s1=new Student("nice name",85); 
		System.out.println("Creating an object of Student Class");
		System.out.println("Name value of the object is "+s1.name );
		System.out.println("Marks value of the object is "+s1.marks );
		s1.name="bob";//Setting the variable value
		s1.marks=10;
		
		System.out.println("Name value of the object is "+s1.name );//getting variable value
		System.out.println("Marks value of the object is "+s1.marks );
	}
}