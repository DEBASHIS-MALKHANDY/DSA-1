
public class Question2 {

	public static void main(String[] args) {
		int[] nums= {3,3,2,2};
		int count=0;
		int val=3;
		int i,j;
		for(i=0;i<nums.length;i++) {
			if(nums[i]==3) {
				continue;
			}else {
				 nums[count] = nums[i];
		            count++;
			}
						
		}
		System.out.println("Result is "+count);

	}

}
