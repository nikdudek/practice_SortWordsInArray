package practice_sortWordsInArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInArray {

	public static void main(String[] args) {
		System.out.print("Please, enter words separated by space: ");
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String[] arrOfWords = words.split("\\s+");
		Arrays.sort(arrOfWords, (s1,s2) -> {
			int result = s2.length() - s1.length();
			if (result == 0) {
				result = s1.compareToIgnoreCase(s2);
			}
			return result;
		});
		for( String word : arrOfWords) {
			System.out.print(word + " ");
		}
		sc.close();
	}

}
