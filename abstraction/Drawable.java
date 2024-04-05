package abstraction;

public interface Drawable {
float PI = 3.14f; //public static final pi = 3.14
 void print ();// public abstract void print()
 static void square (int a) {
	 System.out.println("Square :"+(a*a));
 }
 default void cube (int x) {
	 System.out.println("cube :"+(x*x*x));
 }
  default void show () {
	 System.out.println("Inside show : Drawable");
 }
}
