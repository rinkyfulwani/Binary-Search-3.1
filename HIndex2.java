public class HIndex2 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int hIndex = n - mid;
            if (citations[mid] >= hIndex) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return n - low;
    }
}
