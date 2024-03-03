package TT_Smartlog.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int[] taken = new int[nums.length];
        permutations(0, nums, taken, res, list);
        return res;
    }
    public static void permutations(int index, int[] arr, int[] taken,List<List<Integer>> res, List<Integer> list){
        if(list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        //if a value is not taken I can take it
        for(int i = 0;i < arr.length;i++){
            if(taken[i] == 0){
                //take it
                taken[i] = 1;
                list.add(arr[i]);
                permutations(i + 1, arr, taken, res, list);
                list.remove(list.size() - 1);
                taken[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println(permute(nums));

        sc.close();
    }
}
