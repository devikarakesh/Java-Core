package demo;

import java.util.Arrays;
import java.util.List;

public class SubArray {
	// Method to calculate minimum changes
    static int minChanges(List<Integer> list, int k) {
        int n = list.size();  // size of the list
        int changes = 0;      // total changes needed

        // Loop for each position in the window
        for (int i = 0; i < k; i++) {
            int totalInGroup = 0;   // number of elements in this group
            int maxFreq = 0;        // maximum frequency of any number in this group

            // Loop through elements in this group (step by k)
            for (int j = i; j < n; j += k) {
                totalInGroup++;
                int freq = 0;

                // Count how many times list[j] appears in this group
                for (int x = i; x < n; x += k) {
                    if (list.get(j).equals(list.get(x))) {
                        freq++;
                    }
                }

                // Keep track of the most frequent number
                if (freq > maxFreq) {
                    maxFreq = freq;
                }
            }

            // Elements to change = total in group - most frequent number
            changes += totalInGroup - maxFreq;
        }

        return changes;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 2, 3);
        int windowLength = 3;

        System.out.println(minChanges(list, windowLength)); // Output: 1
	}
}

