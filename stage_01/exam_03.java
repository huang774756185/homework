import java.util.Random;

class exam_03{
	public static void main(String[] args) {
        int[] arr = new int[7]; // 数组长度为7
        for (int i = 0; i < 7; i++) {
            arr[i]=-1; // 每个位数默认为-1
        }
        Random rand = new Random();
        // 生成红色球，每一位随机生成数，如果这个数前面已经生成，则跳出循环重新生成
        for (int i = 0; i < arr.length-1 ; i++) {
            while (arr[arr.length-2]==-1){
                boolean flag = false; // 标志生成的随机数是否已在数组中，false不在，true在
                int tmp = rand.nextInt(33)+1;
                // 遍历已生成数字
                for (int j = 0; j < i; j++) {
                    if (arr[j]==tmp){
                        flag = true; // 找到了该随机数，则已存在，将标志标为已存在，跳出循环
                        break;
                    }
                }
                System.out.println(flag);
                if(flag==false){
                    System.out.println(tmp);
                    // 生成随机数不在数组内，则将数组i位赋值为随机数，跳出循环生成下一位数字
                    arr[i]=tmp;
                    break;
                }
            }
        }
        arr[arr.length-1]=rand.nextInt(16)+1;// 生成蓝色球
        for (int num: arr
             ) {
            System.out.print(num+" ");
        }
    }
}