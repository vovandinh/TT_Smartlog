package TT_Smartlog.Day2;

import java.util.Scanner;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int fni=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                int fn = nums[i-1];
                fni= i-1;
                break;
            }
        }
        if(fni>=0){
            int j = n-1;
            while(nums[j]<=nums[fni]){
                j--;
            }
            swap(nums,fni,j);
        }
        reverse(nums,fni+1);
    } 
    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public static void swap(int[] nums, int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        sc.close();

    }
}
