class Solution {
    public boolean isBalanced(String num) {
        int ev= 0;
        int od = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (i % 2 == 0) {
                ev += digit;
            } else {
                od += digit;
            }
        }

        return ev == od;
    }
}