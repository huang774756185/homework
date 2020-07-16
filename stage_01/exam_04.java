class exam_04{
	public static void main(String[] args){
		int [] nums = new int[10];
		int count = 0;// 元素计数器
		int[] new_nums;
		int len; // 扩容后数组长度
		while(true){
			nums[count]=1;
			if(count>=8){ // 元素个数大于8，则扩容
				len = nums.length + (nums.length>>1);
				new_nums = new int[len];
				for(int i=0;i<count;i++){ // 将旧数组的元素复制到新数组
					new_nums[i] = nums[i];
				}
				break;
			}
			count++;
		}
		System.out.println("扩容后长度：" + new_nums.length);
	}
}