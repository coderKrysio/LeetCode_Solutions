//Question No: 167
package Medium;

public class Two_Sum_II_Input_Array_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] i = new int[2];

        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum==target){
                i[0] = start + 1;
                i[1] = end + 1;
                break;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return i;
    }
}
