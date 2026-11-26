class Solution {
    int bs(MountainArray arr, int l, int h, int target, boolean dir) {
        while (l <= h) {
            int m = l + (h - l) / 2;
            int x = arr.get(m);

            if (x == target)
                return m;

            if (dir) {
                if (x > target) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (x > target) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int l = 0, h = arr.length() - 1;

        while (l < h) {
            int m = l + (h - l) / 2;

            if (arr.get(m) < arr.get(m + 1)) {
                l = m + 1;
            } else {
                h = m;
            }
        }

        int pi = l;

        int x = bs(arr, 0, pi, target, true);

        if (x >= 0)
            return x;

        return bs(arr, pi + 1, arr.length() - 1, target, false);
    }
}