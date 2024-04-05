package abstraction;

public class DrawableImpl implements Drawable, Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DrawableImpl drawable = new DrawableImpl();
drawable.print();
drawable.cube(7);
Drawable.square(13);
drawable.display();
drawable.show();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		float r = 10;
	System.out.println("Area of Circle : "+(PI*r*r));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("method from another interface");
	}
	default void show() {
		 System.out.println("Inside show : Drawable");

}
}