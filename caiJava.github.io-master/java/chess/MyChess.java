package com.demo.chess;

import java.util.Scanner;

/**"��""��"
 * Created by Administrator on 2019/7/29/029.
 */
public class MyChess {
    // ����
    private String[][] chessBoard;
    // ���̴�С
    private final int SIZE = 10;

    // ���һ�������λ��
    private int x;
    private int y;

    //��ǵ�ǰ�ǲ��Ǻ���
    private boolean isBlack = false;

    // ���ٸ��������Ӿ�ʤ��
    private final int WIN_COUNT = 5;

    public static void main(String [] args){
        MyChess chess = new MyChess();
        chess.init();
        chess.render();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //  ����
            System.out.println("��������������");
            chess.player(scanner);
            // ˢ�����̣���ӡ
            chess.render();
            // �ж��Ƿ��������飬ֻҪ�жϵ�ǰ���ӵ���Χ�Ϳ�����
            if(chess.check()) {
                if (chess.isBlack) {
                    System.out.println("����ʤ��");
                } else {
                    System.out.println("����ʤ��");
                }
                break;
            }
        }
    }

    /**
     * ������ǰ������Χ�Ƿ񹹳���������
     * x ��y Ϊ��ǰ��������
     * @return
     */
    private boolean check() {
        // ���ڴ洢��ǰ�ж��ٸ���������
        int count = 1;
        // �洢��ǰλ����ʲô����
        String currentCheck = chessBoard[x][y];

        // �������·���
        // �����Ϸ�
        for (int i = x - 1; i >= 0; i --) {
            if (chessBoard[i][y].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        if (count >= WIN_COUNT) {
            return true;
        }
        // �����·�
        for (int i = x + 1; i < SIZE; i++) {
            if (chessBoard[i][y].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // �������5������ʤ�������С��5������������Ϊ1
        System.out.println("��ǰ������ֱ����" + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // �������ҷ���
        // ������
        for (int i = y - 1; i >= 0; i --) {
            if (chessBoard[x][i].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        if (count >= WIN_COUNT) {
            return true;
        }
        for (int i = y + 1; i < SIZE; i ++) {
            if (chessBoard[x][i].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // �������5������ʤ�������С��5������������Ϊ1
        System.out.println("��ǰ����ˮƽ����" + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // ���� \ ����
        // �������Ϸ�
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i --, j --) {
            if(chessBoard[i][j].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // �������·�
        for (int i = x + 1, j = y + 1; i < SIZE && j < SIZE; i ++, j ++) {
            if(chessBoard[i][j].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // �������5������ʤ�������С��5������������Ϊ1
        System.out.println("��ǰ���� \\ ����" + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // ���� / ����
        // ���� ���Ϸ�
        for (int i = x - 1, j = y + 1; i >= 0 && j < SIZE; i --, j ++) {
            if(chessBoard[i][j].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // ���� ���·�
        for (int i = x + 1, j = y - 1; i < SIZE && j >= 0; i ++, j --){
            if(chessBoard[i][j].equals(currentCheck)){
                count ++;
            } else {
                break;
            }
        }
        // �������5������ʤ�������С��5������������Ϊ1
        System.out.println("��ǰ���� / ����" + count);
        if (count >= WIN_COUNT) {
            return true;
        }
        return false;
    }

    /**
     * ��ʹ������
     */
    private void init() {
        chessBoard = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                chessBoard[i][j] = "+";
            }
        }
    }

    /**
     * ��ӡ����
     */
    private void render() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("\033[92;0m" + i + "\33[0m" + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("\033[92;0m" + i + "\33[0m" + " ");
            // ����ɫ������Ͱ����ò�ͬ����ɫ��ӡ"��""��"
            for (int j = 0; j < SIZE; j++) {
                if (chessBoard[i][j].equals("��")) {
                    System.out.print("\033[93;0m" + chessBoard[i][j] + "\033[0m" + " ");
                } else if (chessBoard[i][j].equals("��")){
                    System.out.print("\033[94;0m" + chessBoard[i][j] + "\033[0m" + " ");
                } else {
                    System.out.print("\033[95;0m" + chessBoard[i][j] + "\033[0m" + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * ����
     * @param scanner
     */
    private void player(Scanner scanner) {
        // �û�������ַ���
        String inputStr = scanner.nextLine();
        // ���ַ����ָ�Ϊ����
        String[] strArr = inputStr.split(",");
        // �ж������С�Ƿ���ȷ
        if (strArr.length != 2) {
            System.out.println("��������ȷ������!");
            player(scanner);
            return ;
        }
        //�ж�����������Ƿ�Ϸ�
        try {
            x = Integer.parseInt(strArr[0]);
            y = Integer.parseInt(strArr[1]);
        } catch (NumberFormatException e) {
            System.out.println("��������ȷ������");
            player(scanner);
            return ;
        }
        // �ж�����������Ƿ񳬳�����
        if (x < SIZE && y < SIZE) {
            // �жϵ�ǰλ���Ƿ��Ѿ�������
            if (chessBoard[x][y].equals("+")){
                // ����Ϸ�����ʼ����"��""��"
                if (isBlack) {
                    chessBoard[x][y] = "��";
                } else {
                    chessBoard[x][y] = "��";
                }
                isBlack = !isBlack;
            } else {
                System.out.println("��ǰλ����������");
                player(scanner);
                return ;
            }
        } else {
            System.out.println("�������귶Χ");
            player(scanner);
            return ;
        }
    }
}
