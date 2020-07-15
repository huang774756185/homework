class exam_02{
	public static void main (String[] args){
		for (int i=1;i<=1000;i++){
			int sum=0;// 每遍历一个数将和清0
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum += j;
				}
			}
			if (i==sum){
					System.out.println(i);
				}
		}
	}
	
}