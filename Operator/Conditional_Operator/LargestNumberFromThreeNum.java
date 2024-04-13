
//find largest number from three number

class LargestNumberFromThreeNum{
     public static void main(String[] args){
	    
		int n1=20, n2=5 ,n3=35;
		
		/* ------(1)------------
		int large=(n1>n2) ? n1 : n2;
		int largest=(n3>large) ? n3 : large;
		
		System.out.println(largest);*/
		
		//*****************************************************
		
		/*-----------( 2 )-----------------
		 
		 int ans= (n1>n2) ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3);
		 System.out.println(ans);*/
		 
		 //***********************************************************
		 
		 //----------------( 3 )------------------
		 
		  /*int ans = n1>(n2>n3 ? n2 : n3) ? (n1) : (n2>n3 ? n2 : n3);
		  System.out.println(ans);*/
		  
		  
		  //***********************************************************
		  
		  //--------------------( 4 )---------
		  
		   /*int ans;
		   
		   int res= n1>(ans=n2>n3 ? n2 : n3) ? n1 : ans;
		   System.out.println(res);*/
		   
		//*************************************************************
		   
		   //----------------(  5 )-----------
		   
		   int ans= (n1>n2 ? n1 : n2)>n3 ? (n1>n2 ? n1 : n2) : n3;
		   System.out.println(ans);
			
	 }
}