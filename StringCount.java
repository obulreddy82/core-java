import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        List<String> sentences = List.of("java is fun", "streams are powerful", "java is powerful");
        Map<String, Long> wordCountList = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(wordCountList);

//        StringBuilder singleText= new StringBuilder("");
//        sentences.forEach(sentence -> singleText.append(sentence).append(" "));
//        System.out.println(singleText);
//        System.out.println("----------------------------");
//        String[] s = singleText.toString().split(" ");
//        System.out.println(Arrays.toString(s));
//
//
//        Map<String, Long> wordCountList = Arrays.stream(s).collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()));
//        System.out.println(wordCountList);
//        Map<String, Long> wordCount=Arrays.stream(singleText.toString()
//                .split(" "))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//       System.out.println(wordCount);
    }
}
