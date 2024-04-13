
class PrintName{
    public static void main(String args[]){
	   int n1=5,n2=25;
	   
	   for(int i=1;i<=n1;i++){
	      for(int j=1;j<=n2;j++){
		     if(i==1&&j<=3 ||i==2&&j==1 || i==2&&j==3 ||i==3&&j<=3 ||i==4&&j==1||i==5&&j==1){
			     System.out.print("*"+" ");
			  }
			  else if(i==1&&j==6 ||i==2&&j==5 ||i==2&&j==7 ||i==3&&j==5 ||i==3&&j==7 ||i==4&&j==5 ||i==4&&j==7 ||i==5&&j==6){
				  System.out.print("*"+" ");
			  }
			  else if(i==1&&j==10 ||i==2&&j==9 ||i==2&&j==11 ||i==3&&j==9 ||i==3&&j==11 ||i==4&&j==9 ||i==4&&j==11||i==5&&j==10){
				  System.out.print("*"+" ");
			  }
			  else if(i==1&&j==13|| i==1&&j==14 ||i==1&&j==15 || i==2&& j==14||i==3&& j==14||i==4&& j==14||i==5&& j==14 ||i==4&&j==13||i==5&&j==13){
				  System.out.print("*"+" ");
			  }
			  else if(i==3&&j==17||i==1&&j==18 ||i==2&&j==17||i==2&&j==19||i==3&&j==17||i==3&&j==18||i==3&&j==19||i==4&&j==17||i==4&&j==19||i==5&&j==17||i==5&&j==19){
				   System.out.print("*"+" ");
			  }
			  else{
				  System.out.print("  ");
			  }
			 
		  }
		   System.out.println();
	   }
	}
}


