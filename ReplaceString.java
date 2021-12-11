package AssingmentWeek3Day1;

public class ReplaceString {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		String replace = sentence.replace("8", "11");
		System.out.println(replace);
		String split = sentence.substring(5, 15);
		System.out.println(split);
	}
}