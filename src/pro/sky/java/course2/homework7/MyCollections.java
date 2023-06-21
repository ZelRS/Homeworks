package pro.sky.java.course2.homework7;

import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        List<Integer> nums1 = new ArrayList<>(List.of(2, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums1);
        separator();
        /*==========================================================================================*/
        System.out.println("Задача 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 50, 1, 2, 3, 4, 4, 19, 5, 5, 18, 18, 6, 7));
        printEvenIncreaseUniqueNumbers(nums2);
        separator();
        /*==========================================================================================*/
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("Ivan", "Boris", "Marta", "Kate", "Tom", "Tom", "Ivan", "Bill"));
        printUniqueStrings(strings);
        separator();
        /*==========================================================================================*/
        System.out.println("Задача 4");
        List<String> strings1 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printCountOfDouble(strings1);
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    /*======================================================================================*/

    public static void printEvenIncreaseUniqueNumbers(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> nums1 = new LinkedHashSet<>(List.of());
        for (Integer num : nums) {
            if (num % 2 == 0) {
                nums1.add(num);
            }
        }
        nums.clear();
        nums.addAll(nums1);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }

    /*===============================================================================================*/

    public static void printUniqueStrings(List<String> strings) {
        Set<String> strings1 = new HashSet<>(List.of());
        strings1.addAll(strings);
        strings.clear();
        strings.addAll(strings1);
        for (int i = 0; i < strings.size(); i++) {
            if (i != strings.size() - 1) {
                System.out.print(strings.get(i) + ", ");
            } else {
                System.out.println(strings.get(i));
            }
        }
    }

    private static void printCountOfDouble(List<String> strings) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : strings) {
            if (wordCount.containsKey(s)) {
                wordCount.put(s, wordCount.get(s) + 1);
            } else {
                wordCount.put(s, 1);
            }
        }
        for (String s : wordCount.keySet()) {
            int count = wordCount.get(s);
            System.out.println(count);
        }
    }

    public static void separator() {
        System.out.println("\n==================================================================");
    }
}
