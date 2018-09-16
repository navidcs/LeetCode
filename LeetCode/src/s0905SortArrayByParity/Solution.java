public class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int resultIterator = 0;
        int[] result = new int[arr.length];
        for (int num : arr)
            if (num % 2 == 0)
                result[resultIterator++] = num;

        for (int num : arr)
            if (num % 2 == 1)
                result[resultIterator++] = num;

        return result;
    }
}
