package core;

public class uglynumber {
	
	    public static boolean isUgly(int n) {
	    	n = Math.abs(n);
	        int uglycount=0;
	        int not=0;
	        if(n==1 ||n==2 || n==3 ||n==5){
	            return true;
	        }
	        if(n%5 == 0 || n%3 == 0 || n%2 == 0 ){
                uglycount +=1;
            }
	        if(n%4==0) {
	        	 not +=1;
	        }
	        for(int i=6;i<=n/2;i++){
	        	int res=n%i;
	        	if(res ==0) {
	        		not +=1;
	        	}
	            else{
	                
	            }
	            
	       }
	       if(not >=1 && uglycount>0){
	                return false;
	            }
	            return true;
	            
	    }


	public static void main(String[] args) {
		boolean a=isUgly(14);
		System.out.println(a);
	}

}
