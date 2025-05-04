class Rectangle{
	int height;
	int width;
	Rectangle(int h,int w){
		height=h;
		width=w;
		System.out.println("Just created a rectangle object with size(h*w) "+height+"*"+width);
		print(width,height);  
	}
	
	void print(int width, int height){
		for(int i=0; i<height; i++){ //for lines i.e.  height

			for(int j=0; j<width; j++){// for the *'s i.e.  width
				System.out.print("*"); // * in each line
			}
			System.out.println();  //breakline
		}
	}
}

class Main{
	public static void main(String[] args){
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle(6,13);
		Rectangle r3=r1;
		System.out.println("Height "+r1.height+" , width "+r1.width); 
		System.out.println("Height "+r2.height+" , width "+r2.width);
		System.out.println("Height "+r3.height+" , width "+r3.width);

		//r1.print(3,4);
		
		
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is "+i);
		}
		*/
	}
}
//hint you may use nested for loops and print,println
/*Expected output:

***
***
***
***

*/