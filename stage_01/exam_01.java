import java.util.Scanner;

class exam_01{
	
	public static void main(String[] args){
		
		int year = 0; // ��
		int month = 0; // ��
		int day = 0; // ��
		int sum = 0; // ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������꣺");
		year = sc.nextInt();
		System.out.println("�������£�");
		month = sc.nextInt();
		System.out.println("�������գ�");
		day = sc.nextInt();
		for (int i=1;i<month; i++){
			
			switch (i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					sum += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum += 30;
					break;
				case 2:
					if (((year%4 == 0 && year%100 != 0) || year%400 == 0)) {
						
						sum+=29;
						break;
					}else{
						sum+=28;
						break;
					}
				
				default:
					break;
			}
				
		}
		sum += day;
		System.out.println("�ڣ�" + sum + "��");
		
	}
}