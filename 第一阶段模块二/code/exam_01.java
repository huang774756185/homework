package stage_02;

import java.util.Random;

public class exam_01 {
    public static void main(String[] args) {
        Random random = new Random();
        // 定义数组
        int[][] nums=new int[16][16];
        // 输入所有元素值
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]= j+10+i;
                System.out.print(nums[i][j]+"    ");
            }
            System.out.println();
        }
        // 每一行元素累加行元素。i为行，j为列
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = 0; j < nums[i].length; j++) {
                // 将某一行所有列相加
                sum += nums[i][j];
            }
            System.out.println("第"+(i+1)+"行之和为："+sum);
        }

        // 每一列之和。i当成列，j当成行

        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = 0; j < nums[i].length; j++) {
                // 列不动行动。将第i列所有行的数字相加
                sum +=nums[j][i];
            }
            System.out.println("第"+(i+1)+"列之和为："+sum);
        }

        // 左上角到右下角。行号等于列号
        int sum1=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i==j){
                    sum1 += nums[i][j];
                }
            }
        }
        System.out.println("左上到右下之和：" + sum1);

        // 右上角到左下角。行号之和为15
        int sum2=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i+j==15){
                    sum2 += nums[i][j];
                }
            }
        }
        System.out.println("左上到右下之和：" + sum2);


    }
}
