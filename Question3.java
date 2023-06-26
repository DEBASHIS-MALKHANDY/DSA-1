
public class Question3 {

	public static void main(String[] args) {
		int[] nums = {1,3,6,7,9};
		int target = 4;
		int start = 0;
		int end = nums.length - 1;
		
		
		while (start<=end) {
			  int mid = (start + end) / 2;
	            
	            //if target value found.
	            if(nums[mid] == target) {
	               System.out.println("target is found in "+mid+" no index");
	               break;
	            }
	            else if (target > nums[mid]) {
	                start = mid + 1;
	            }
	            
	           
	             else {
	                end = mid - 1;
	            }
	        }
	        
		
		}
       
	}

