import java.util.*;
public class unique {
    public static void main(String... args) {
        int arr[] = {1, 2, 1, 2, 1, 2};
        int k = 3;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        al.add(map.size());

        for (int i = k; i < n; i++) {
            if (map.containsKey(arr[i - k])) {
                if (map.get(arr[i - k]) == 1) {
                    map.remove(arr[i - k]);
                } else {
                    map.put(arr[i - k], map.get(arr[i - k]) - 1);
                }
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            al.add(map.size());
        }

        System.out.println(al);
    }
}
