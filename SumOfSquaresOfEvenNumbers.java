package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquaresOfEvenNumbers {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list = list.stream().filter(i -> i % 2 == 0).map(i -> i * i).collect(Collectors.toList());
		list.forEach(i -> System.out.println(i));
		int sum = list.stream().reduce(0, (i,j) -> (i+j));
		System.out.println("Sum of squares of even numbers: "+sum);
		
	}
}
