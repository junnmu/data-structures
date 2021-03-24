package binarysearch;

import java.util.List;

public class BinarySearch {
    public int looping(List<Integer> list, int elem, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == elem) {
                return mid;
            }
            if (elem < list.get(mid)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int recursive(List<Integer> list, int elem, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == elem) {
                return mid;
            }
            if (elem < list.get(mid)) {
                return recursive(list, elem, start, mid - 1);
            }
            else {
                return recursive(list, elem, mid + 1, end);
            }
        }
        else {
            return -1;
        }
    }
}
