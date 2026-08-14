class Solution {
    public int convertTime(String current, String correct) {

        String[] p = current.split(":");
        String[] p1 = correct.split(":");

        String h1 = p[0];
        String h2 = p1[0];
        String m1 = p[1];
        String m2 = p1[1];

        int tot1 = Integer.parseInt(h1) * 60 + Integer.parseInt(m1);
        int tot2 = Integer.parseInt(h2) * 60 + Integer.parseInt(m2);

        int d =tot2 -tot1;
        int c =0;

        while (d != 0) {

            if (d >= 60) {
                c+=d / 60;
                d=d % 60;
            }
            else if (d >= 15) {
                c+= d / 15;
                d=d % 15;
            }
            else if (d >= 5) {
                c += d/ 5;
                d =d %5;
            }
            else {
                c += d;
                d =0;
            }
        }

        return c;
    }
}