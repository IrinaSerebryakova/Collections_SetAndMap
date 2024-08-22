import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");


        //Task 2
        Set<Integer> nums2 = new HashSet<>();
        List<Integer> numsNew = new ArrayList<>(nums2);
        numsNew.sort(Comparator.naturalOrder());
        for (Integer num : nums) {
            if (num % 2 == 0) {
                nums2.add(num);
            }
        }
        for (Integer num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println("");


        //Task 3
        String strings1 = "Напишите код, с помощью которого можно напечатать " +
                "только нечетные 7 числа в консоль. Код должен работать 6 с любой последовательностью " +
                "и объемом списка чисел. 56 В качестве отладочной информации можете использовать список чисел." +
                "Напишите код, который выводит в консоль все уникальные eg слова из списка слов, в котором " +
                "могут встречаться дубли. В качестве отладочной информации возьмите произвольный набор " +
                "слов или текст, в котором встречаются повторения. Это может быть произвольный набор слов, " +
                "литературный текст или произвольное предложение. 25g Код должен работать с любой последовательностью" +
                "и объемом списка слов.";

        String[] stringsArray = strings1.split("[a-zA-Z.,!?;:\\s\\d]+");
        List<String> stringsList = new ArrayList<>(List.of(stringsArray));

        for (String str : stringsArray) {
            if (!stringsList.contains(str)) {
                stringsList.add(str);
            }
        }

        Set<String> stringsSet = new HashSet<>();
        for (String str : stringsList) {
            stringsSet.add(str);
        }
        System.out.println(stringsSet);


        //Task 4
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        List<String> unicStrings = new ArrayList<>();
        StringBuilder result = new StringBuilder("{");
        int counterEnd = 0;
        int counter = 0;
        for (int i = 0; i < strings.size(); i++) {
                if (!unicStrings.contains(strings.get(i))) {
                    unicStrings.add(strings.get(i));
                }
            }
        for (String unicString : unicStrings) {
            for (int i = 0; i < strings.size(); i++) {
                if (unicString.equals(strings.get(i))) {
                    counter++;
                    counterEnd++;
                }
            }
            result.append(counter + "-" + unicString + ",");
            counter = 0;
            }
        result.append("}");
        System.out.println(result);
        }
    }
