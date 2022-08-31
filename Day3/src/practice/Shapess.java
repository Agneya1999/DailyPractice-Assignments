package practice;

import java.util.ArrayList;
import java.util.List;

class GraphicsContext{

	public void drawRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		System.out.println("Shape is Rectangle");
	}

	public void drawCircle(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println("Shape is Circle");
	}

	public void drawRhombus(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		System.out.println("Shape is Rhombus");
	}
	
}
 interface Shape {
	int k=0;
	void draw(GraphicsContext gc);
	default int area(int a, int b, int c, int d) {
		return 0;
	}

}
class Rectangle implements Shape{
	int a;
	int b;
	int c;
	int d;
	
	public Rectangle(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void draw(GraphicsContext gc) {
		gc.drawRect(20,20,50,70);
	}
	public int area(int a, int b, int c, int d) {
		return a*b*c*d;
	}
}
class Circle implements Shape{
	public void draw(GraphicsContext gc) {
		gc.drawCircle(50,50,100);
	}
}
class Rhombus implements Shape{
	public void draw(GraphicsContext gc) {
		gc.drawRhombus(20,30,20,30);
	}
}


public class Shapess {

	public static void main(String[] args) {
		List<Shape> shapes=new ArrayList();
		shapes.add(new Rectangle(520,20,50,70));
		shapes.add(new Circle());
		shapes.add(new Rhombus());
		
		GraphicsContext gc =new GraphicsContext();
		shapes.forEach(x -> x.draw(gc));

}
}
