class exam_05{
	public static void main(String[] args){
        String[][] chessboard=new String[17][17];
        for(int row=0;row<17;row++) {
            for (int column = 0; column < 17; column++) {
                if ((row == 0) && (column == 0)) {
                    chessboard[row][column] = " "; // ���Ͻ���ĸΪ���ַ���
                } else if (row == 0) {
                    chessboard[0][column] = Integer.toHexString(column - 1);// ��0��Ϊ���0��16��16�����ַ���
                } else if (column == 0) {
                    chessboard[row][0] = Integer.toHexString(row - 1);// ��0��Ϊ���0��16��16�����ַ���
                } else {
                    chessboard[row][column] = "*";// ���������С��У���*���
                }

            }
        }
        // ˫��ѭ����ӡ
        for(int row=0;row<17;row++){
            for(int column=0;column<17;column++){
                System.out.print(chessboard[row][column]+" ");
            }
            System.out.print("\n");// ÿһ����"\n"����
        }

    }
}

