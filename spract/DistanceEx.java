package spract;
import java.util.Scanner;

public class DistanceEx {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input initial velocity (u) in meters per second
	        System.out.print("Enter the initial velocity (u) in m/s: ");
	        double u = sc.nextDouble();

	        // Input acceleration (a) in meters per second squared
	        System.out.print("Enter the acceleration (a) in m/s^2: ");
	        double a = sc.nextDouble();

	        // Input time duration (t) in seconds
	        System.out.print("Enter the time duration (t) in seconds: ");
	        double t = sc.nextDouble();

	        // Calculate the distance using the formula
	        double distance = u * t + (0.5 * a * t * t);

	        System.out.println("Distance traveled: " + distance + " meters");

	        sc.close();
	    }
	}


