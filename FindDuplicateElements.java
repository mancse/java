package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	public static void main(String args[]) {
		String [] words = {"one","two","three","four","five","three","four","five"};
		List<String> list = Arrays.asList(words);
		Set<String> set = new HashSet<>();
		list = list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		list.forEach(i -> System.out.println(i));
	}
}
