
//find smallest number from three number

class SmallestFromThreeNumber{
      public static void main(String[] args){
	     
		 int n1=10,n2=5,n3=1;
		 
		 //-------------( 1 )-------------------
		 /*int small=n1<n2 ? n1 : n2;
		 int smallest = n3<small ? n3 : small;
		 System.out.println(smallest);*/
		 
		//***************************************************
		
		 //-----------------( 2 )------------
		 
		   /* int ans= (n1<n2) ? (n1<n3 ? n1 : n3 ) : (n2<n3 ? n2 : n3);
			System.out.println(ans);*/
			
	    //**********************************************************
		
		//----------------------( 3 )-------------
		 
		 /*int ans= n1 <(n2<n3 ? n2 : n3) ? n1 : (n2<n3 ? n2 : n3);
		 System.out.println(ans);*/
		 
		 
		//-*************************************************************
		
		 //-------------------------( 4 )--------------------
		 
		 /* int ans;
		  
		   int res= n1 < (ans = (n2<n3) ? n2 :n3) ? n1 :ans;
		   System.out.println(res);*/
		   
		 //****************************************************************
		 
		 //-----------------------------( 5 )----------------------
		 
		    int ans= (n1<n2 ? n1 : n2)<n3 ? (n1<n3 ? n1 : n3) :(n2<n3 ? n2 : n3);
			System.out.println(ans);
	  }
}