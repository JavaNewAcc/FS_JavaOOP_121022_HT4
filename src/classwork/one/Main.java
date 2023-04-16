package classwork.one;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Vaska", 6);
		Cat cat2 = new Cat("Luska", 2);
		Cat cat3 = new Cat("Umka", 4);
		Cat cat4 = new Cat("Barsic", 8);
		Cat cat5 = new Cat("Murzik", 7);

		Cat[] cats = new Cat[] { cat1, cat2, null, cat3, cat4, cat5 };

		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();

		Arrays.sort(cats,
				Comparator.nullsLast(new CatNameComparatorLex().thenComparing(new CatNameLengthComparator())));

		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();
	}
}