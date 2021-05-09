package Interview.Competitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveStringStartsWithA {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Akbar", "Azhar", "Khan", "Farhan");

        System.out.println(s.stream().filter(s1->s1.charAt(0)!='A').collect(Collectors.toList()));
    }
}
