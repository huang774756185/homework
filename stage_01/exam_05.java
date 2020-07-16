class exam_05{
	public static void main(String[] args){
        String[][] chessboard=new String[17][17];
        for(int row=0;row<17;row++) {
            for (int column = 0; column < 17; column++) {
                if ((row == 0) && (column == 0)) {
                    chessboard[row][column] = " "; // 左上角字母为空字符串
                } else if (row == 0) {
                    chessboard[0][column] = Integer.toHexString(column - 1);// 第0行为输出0到16的16进制字符串
                } else if (column == 0) {
                    chessboard[row][0] = Integer.toHexString(row - 1);// 第0列为输出0到16的16进制字符串
                } else {
                    chessboard[row][column] = "*";// 除了特殊行、列，用*填充
                }

            }
        }
        // 双重循环打印
        for(int row=0;row<17;row++){
            for(int column=0;column<17;column++){
                System.out.print(chessboard[row][column]+" ");
            }
            System.out.print("\n");// 每一行用"\n"换行
        }

    }
}

