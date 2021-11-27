package module2._11_DSA_stack_queue.exercise.e2;

import java.util.Map;
import java.util.TreeMap;

public class CheckString {
    public static void main(String[] args) {
        String str = new String("abcdaceb");
        String arrays[] = str.split("");
        int count = 0;
        Map<String, Integer> stringTreeMap = new TreeMap<String, Integer>();
        for (int i = 0; i < arrays.length; i++) {
            stringTreeMap.put(arrays[i], 0);
        }
        for (int i = 0; i < arrays.length; i++) {
            boolean check = stringTreeMap.containsKey(arrays[i]);
            if (check) {
                count = stringTreeMap.get(arrays[i]);
                count++;
                stringTreeMap.put(arrays[i], count);
            } else {
                stringTreeMap.put(arrays[i], 1);
            }
        }
        System.out.println(stringTreeMap);
    }
}
