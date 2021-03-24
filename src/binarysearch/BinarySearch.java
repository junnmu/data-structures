package binarysearch;

import java.util.List;

public class BinarySearch {
    public int search(List<Integer> list, int elem, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == elem) {
                return mid;
            }
            if (elem < list.get(mid)) {
                return search(list, elem, start, mid - 1);
            }
            else {
                return search(list, elem, mid + 1, end);
            }
        }
        else {
            return -1;
        }
    }
}
