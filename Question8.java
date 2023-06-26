
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] nums={1,2,3,4,5,6,7,7,9,10};
		  
		  findErrorNums(nums);
	}	
	 public static int[] findErrorNums(int[] nums) {
	        int a1=0;
	        int a2=0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    a1=nums[i];
	                    a2=nums[j]+1;
	                }else{
	                    break;
	                }
	            }


	        }
	        return new int[] {a1,a2};
	    }
	}


