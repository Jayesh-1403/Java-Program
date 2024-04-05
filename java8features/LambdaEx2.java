package java8features;

@FunctionalInterface
interface Sayable{
	String say(String str);
	
}
public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1 = (name) -> "Hello "+name;
		System.out.println(s1.say("Priyanka!"));
		
		Sayable s2 = (mgs)-> {
			return "Message : "+mgs;
			
		};
		System.out.println(s2.say("Learing Java 8 features! "));
	}

}
