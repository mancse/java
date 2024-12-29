package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindDistinctElements {
	public static void main(String args[]) {
		String [] words = {"one","two","three","four","five","three","four","five"};
		List<String> list = Arrays.asList(words);
		list = list.stream().distinct().collect(Collectors.toList());
		list.forEach(i -> System.out.println(i));
	}
}
