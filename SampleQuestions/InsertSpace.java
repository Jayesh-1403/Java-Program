package SampleQuestions;

public class InsertSpace {

	public String insertSpace(String s) {
		return s.chars()
				.mapToObj(c -> (char) c + " ")
				.reduce("",String::concat)
				.trim();
		
	}
	public static void main(String[] args) {
		InsertSpace source = new InsertSpace();
		String result = source.insertSpace("Capgemini");
		System.out.println(result);
	}

}
