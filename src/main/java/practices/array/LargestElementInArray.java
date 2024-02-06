package practices.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {7,1,2,35,2};
        System.out.println(solution2(nums));
    }

    public static int solution2(int[] num){
        int largest=num[0];

        for (int i=1;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                    largest = num[i];
            }
        }
        return largest;

    }

    /*
    broute solution O(nlogn)
        int[] nums = {7,1,2,35,2,10000};
            Arrays.sort(nums);
            System.out.println(nums[nums.length-1]);
    */
}
