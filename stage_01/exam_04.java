class exam_04{
	public static void main(String[] args){
		int [] nums = new int[10];
		int count = 0;// Ԫ�ؼ�����
		int[] new_nums;
		int len; // ���ݺ����鳤��
		while(true){
			nums[count]=1;
			if(count>=8){ // Ԫ�ظ�������8��������
				len = nums.length + (nums.length>>1);
				new_nums = new int[len];
				for(int i=0;i<count;i++){ // ���������Ԫ�ظ��Ƶ�������
					new_nums[i] = nums[i];
				}
				break;
			}
			count++;
		}
		System.out.println("���ݺ󳤶ȣ�" + new_nums.length);
	}
}