import java.util.Random;

class exam_03{
	public static void main(String[] args) {
        int[] arr = new int[7]; // ���鳤��Ϊ7
        for (int i = 0; i < 7; i++) {
            arr[i]=-1; // ÿ��λ��Ĭ��Ϊ-1
        }
        Random rand = new Random();
        // ���ɺ�ɫ��ÿһλ�������������������ǰ���Ѿ����ɣ�������ѭ����������
        for (int i = 0; i < arr.length-1 ; i++) {
            while (arr[arr.length-2]==-1){
                boolean flag = false; // ��־���ɵ�������Ƿ����������У�false���ڣ�true��
                int tmp = rand.nextInt(33)+1;
                // ��������������
                for (int j = 0; j < i; j++) {
                    if (arr[j]==tmp){
                        flag = true; // �ҵ��˸�����������Ѵ��ڣ�����־��Ϊ�Ѵ��ڣ�����ѭ��
                        break;
                    }
                }
                System.out.println(flag);
                if(flag==false){
                    System.out.println(tmp);
                    // ������������������ڣ�������iλ��ֵΪ�����������ѭ��������һλ����
                    arr[i]=tmp;
                    break;
                }
            }
        }
        arr[arr.length-1]=rand.nextInt(16)+1;// ������ɫ��
        for (int num: arr
             ) {
            System.out.print(num+" ");
        }
    }
}