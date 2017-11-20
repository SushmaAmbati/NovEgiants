package StringOperations;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hello! How are you?";
		if (str == null || str.isEmpty()) {
			System.err.println("Please Enter a valid string");
			return;
		}
		String[] words = str.split("\\s+"); // /s is character class to detect spaces including tabs. Extra \ is added
											// to escape the behavior of \ in regex. + is added to deal with the
											// multiple spaces.
		int count = words.length;
		System.out.println("Number of words in the string " + str + " are " + count + "");

	}
}
