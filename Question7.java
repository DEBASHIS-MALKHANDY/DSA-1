import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums= {0,1,0,3,12};
		
		
		int n=nums.length;
		int[] temp=new int[n];
		int k=0;
		
		for(int i=0;i<n;i++) {
			 if (nums[i]!=0){
	                temp[k]=nums[i];
	                k++;
	            }
		}
		while(k<n) {
			temp[k]=0;
		}
		for(int j=0;j<n;j++)
	       {
	           System.out.print(temp[j]+" ");
	       }	
	}

}
