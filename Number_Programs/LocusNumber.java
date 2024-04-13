/*
class LocusNumber{
    public static void main(String[] args){
	    int num=10;
		int n1=2,n2=1,n3;
		for(int i=1;i<=num;i++){
		   n3=n1+n2;
		   System.out.println(n1);
		   n1=n2;
		   n2=n3;
		}
	}
}*/

class LocusNumber{
	public static void main(String[] args){
		int num=4;
		if(isLucus( num)){
			System.out.println("It is Lucus Number");
		}
		else{
			System.out.println("It is not Lucus Number");
		}
	}
	public static boolean isLucus(int num){
		int n1=2,n2=1,n3;
		while(true){
			if(n1==num){
				return true;
			}
			else if(n1>num){
				return false;
			}
			else{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		}
		//return n1==num;
	}
}