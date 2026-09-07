class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i]== B[i]) {
                count++;
            } else {
                if (set.contains(A[i])) count++;
                if (set.contains(B[i])) count++;
            }
            set.add(A[i]);
            set.add(B[i]);
            res[i] = count;
        }

        return res;
    }
}