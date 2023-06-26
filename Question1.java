
public class Question1 {

	public static void main(String[] args) {
		int[] nums= {2,11,7,15};
		int Target=9;
		int i;
		int j;
		 for( i=0;i<nums.length;i++) {
	           for(j=i+1;j<nums.length;j++){
	               if( nums[i] + nums[j] == Target){
	                  System.out.println(i+","+j) ;
	               }        
	           }
		
	}
	
	}
}

