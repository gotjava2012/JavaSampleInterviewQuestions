package com.example.demo;

public class Permutation {

    public static void main(String[] args)
    {
        String str = "ABCDE";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param left starting index
     * @param right end index
     */
    private void permute(String str, int left, int right)
    {
        if (left == right)
            System.out.println(str);
        else
        {
            for (int i = left; i <= right; i++)
            {
                str = swap(str,left,i);
                permute(str, left+1, right);
                str = swap(str,left,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
