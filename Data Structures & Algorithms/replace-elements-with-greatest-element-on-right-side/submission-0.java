class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n;i++)
        {
            max = 0;
            for (int j = i + 1; j < n;j++)
            {
                if (arr[j] > max)
                    max = arr[j];
            }
            arr[i] = max;
            if (i == n - 1)
                arr[i] = -1;
        }
        return arr;
    }
}