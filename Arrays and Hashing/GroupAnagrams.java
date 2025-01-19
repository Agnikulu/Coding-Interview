import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<ArrayList<Integer>, ArrayList<String>> hashmap = new HashMap<ArrayList<Integer>, ArrayList<String>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        for (int i = 0; i < strs.length; i++) {
            curr.clear();
            for (int j = 0; j < 26; j++) {
                curr.add(0);
            }
            for (int j = 0; j < strs[i].length(); j++) {
                int c = strs[i].charAt(j) - 'a';
                curr.set(c, curr.get(c) + 1);
            }
            ArrayList<String> group;
            if (hashmap.containsKey(curr)) {
                group = hashmap.get(curr);
            } else {
                group = new ArrayList<String>();
            }
            group.add(strs[i]);
            hashmap.put(curr, group);
        }

        return new ArrayList<>(hashmap.values());
    }
}
