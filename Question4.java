import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		  int[] arr = {1, 2, 3};  
		    ArrayList<Integer> ans = new ArrayList<>();  
		    int carry=0;  
		    int val=0;  
		    for(int i=arr.length-1;i>=0;i--){  
		        if(i==arr.length-1){  
		         val=(arr[i]+1+carry)%10;  
		         carry=(arr[i]+1+carry)/10;  
		        }  
		        else{  
		             val=(arr[i]+carry)%10;  
		            carry=(arr[i]+carry)/10;  
		        }  
		           
		        ans.add(0,val);  
		    }  
		    if(carry==1)  
		    ans.add(0,carry);  
		      
		    for(int i=0;i<ans.size();i++){  
		        System.out.print(ans.get(i)+" ");  
		    }  
		  
		  }  
		  
		}  
	
	
		

