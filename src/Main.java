import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 64,65, 2, 3, 4, 32, 4, 5, 125, 5, 6, 7));
        Set<Integer> set = new TreeSet<>(nums);
        List<String> stringList = new ArrayList<>(Arrays.asList ("Мело", "мело", "по", "всей", "земле", "Во", "все", "пределы",
                "Свеча", "горела", "на", "столе", "Свеча", "горела"));
        Set<String> setString = new HashSet<>(stringList);

        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
        System.out.println();
        System.out.println(setString);

        System.out.println();

        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();

        for (String string : words) {
            if (map.containsKey(string)) {
                Integer count = map.get(string) + 1;
                map.put(string, count);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map.values());
    }
}