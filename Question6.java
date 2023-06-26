
public class Question6 {

	public static void main(String[] args) {
		int[] nums= {1,2,3,8};
		int key=nums[0];
		int sum=0;
		
		int low=nums.length-1;
		while(key<=low) {
		
		for(int i=key;i<=low;i++) {
			if(key==nums[i]) {
				sum++;
			}else {
				key=nums[i+1];
			}
		}
		}
		
		if(sum>1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
