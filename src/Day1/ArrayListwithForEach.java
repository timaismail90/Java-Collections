package Day1;
import java.util.*;

//Rewrite the following code so that it fills the ArrayList values with the elements of the array nums using a for-each loop instead of a for loop.

public class ArrayListwithForEach {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        // for (int i = 0; i < nums.length; i ++) {
        //     values.add(nums[i]);
        // }
        for(int element : nums)
        values.add(element);
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}
