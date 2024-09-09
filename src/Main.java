import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer numba : nums) {
            if (nums.get(numba) % 2 != 0) {
                System.out.print(numba);
            }
        }
        System.out.println();
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> num1 = new HashSet<>(nums1);
        //for (int i = 0; i < nums1.size(); i++) {
            //if (nums1.get(i)%2==0) {
                //System.out.println(i);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println();

   // }
//}
        HashSet<String> words = new HashSet<>(List.of("Вася","Крыса","Вася","Товарищ","Бекас","омега","Крыса"));
        System.out.println(words);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        HashMap<String, Integer> strings1 = new HashMap<>();        //Придется копипастить
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string,1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values());


    }
}




