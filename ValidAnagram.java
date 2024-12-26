public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] hashmap1 = new int[26];
        int[] hashmap2 = new int[26];
        for (int i = 0; i < 26; i++) {
            hashmap1[i] = 0;
            hashmap2[i] = 0;
        }

        for (int i = 0; i < s.length(); i++)  {
            hashmap1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++)  {
            hashmap2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hashmap1[i] != hashmap2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "carrace";
        String s3 = "jar";
        String s4 = "jam";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram(s3, s4));
    }
}