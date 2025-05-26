import java.util.Scanner;

public class CCCadvitiya {
    public static void main (String[] args) throws java.lang.Exception
	{
	    String str="ADVITIYA";
			
		int T=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=T;i++){
		    String S=sc.nextLine();
		    int ans=0;
		    if(S.equals(str)){
		        ans=0;
		    }
		    else{
    		    for(int j=0;j<S.length();j++){
    		        if(S.charAt(j)!=str.charAt(j)){
    		            int asci=S.charAt(j);
    		            int advi=str.charAt(j);

    		            if(advi<asci){
    		                ans+=(26-(asci-advi));  // in cyclic, each char can come to itself in 26 steps, if we want to reach
                                                    //another alphabet then subtract from 26 the diff of two alphabets
    		            }
    		            else{
    		                ans=ans+(advi-asci);
    		            }
    		        }
    		    }
		    }
		  System.out.println(ans);  
		}
	}
}