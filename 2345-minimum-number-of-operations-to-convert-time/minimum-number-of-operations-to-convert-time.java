class Solution {
    public int convertTime(String current, String correct) {

        String[] a = current.split(":");
        String[] b =correct.split(":");

        int start = Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
        int end =Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1]);
        int diff=end - start;

        int[] ops = {60, 15, 5, 1};
        int i = 0;
        int count = 0;
        while (diff > 0) {

            if (diff >= ops[i]) {
                diff -= ops[i];
                count++;
            } else {
                i++;
            }
        }

        return count;
    }
}