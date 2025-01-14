package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FindElementAndFrequency {
	public static void main(String args[]) {
		String [] words = {"one","two","three","four","five","three","four","four","five","five","five"};
		List<String> list = Arrays.asList(words);
		Map<String, Long> elementFreqMap = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println("Un Sorted Map: ");
		elementFreqMap.entrySet().stream().forEach(i -> System.out.println(" " + i.getKey() + " "+i.getValue()));
		List<Map.Entry<String, Long>> sortedWords = elementFreqMap.entrySet().stream().sorted((e1,e2)->{
			long diff = Long.compare(e2.getValue() , e1.getValue());
			if (diff == 0) {
				return e1.getKey().compareTo(e2.getKey());
			}
			return (int)diff;
		}).collect(Collectors.toList());
		
		sortedWords.forEach((e)-> System.out.println("key: "+e.getKey()+" val: "+e.getValue()));
		
		
		//Now Sort the frequency map based on frequencies in descending order and if frequencies are same then order by name. 
		
		/*
		Map<String,Long> sortedMap = new LinkedHashMap<>();
		
		elementFreqMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(
				i -> sortedMap.put(i.getKey(), i.getValue()));
		System.out.println("Sorted Map based on frequency in descending order: ");
		sortedMap.entrySet().stream().forEach(i -> System.out.println(" "+i.getKey()+" "+i.getValue()));
		*/	
	}
}
