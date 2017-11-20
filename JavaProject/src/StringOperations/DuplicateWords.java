package StringOperations;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {

		String str = "Hello! How are you? How about How meeting tomorrow?";
		String[] words = str.split(" ");
		Map<String, String> wordMap = new HashMap<String, String>();

		Map<String, String> printedMap = new HashMap<String, String>();

		for (int i = 0; i < words.length; i++) {

			String word = words[i].toUpperCase(); // for case insensitive comparison

			if (wordMap.get(word) != null) {

				if (printedMap.get(word) == null) { // first check if it is printed already!

					System.out.println("Duplicated/Repeated word:" + word);

					printedMap.put(word, word);

				}

			} else {

				wordMap.put(word, word);

			}

		}

	}

}
