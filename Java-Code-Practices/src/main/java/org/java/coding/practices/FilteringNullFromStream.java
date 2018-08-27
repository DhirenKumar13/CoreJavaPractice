package org.java.coding.practices;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringNullFromStream {

	public static void main(String[] args) {
		 Stream<String> language = Stream.of("java", "python", "node", null, "react", null, "redux");
		 List<String> collect = language.filter(Objects::nonNull).collect(Collectors.toList());
		 System.out.println(collect);
		 
		 Stream<String> language1 = Stream.of("java", "python", "node", null, "react", null, "redux");
		 List<String> collect1 = language1.filter(a -> a != null).collect(Collectors.toList());
		 System.out.println(collect1);
	}

}
