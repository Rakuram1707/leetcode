class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        String str = "";
        int min = Integer.MAX_VALUE;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {

            map.put(s.charAt(j),
                    map.getOrDefault(s.charAt(j), 0) + 1);

           
            while (map.getOrDefault('1', 0) == k) {

                int len = j - i + 1;

                if (len < min) {
                    min = len;
                    str = s.substring(i, j + 1);
                }
                else if (len == min) {
                    String current = s.substring(i, j + 1);

                    if (current.compareTo(str) < 0) {
                        str = current;
                    }
                }

                char ch = s.charAt(i);

                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }

                i++;
            }
        }

        return str;
    }
}