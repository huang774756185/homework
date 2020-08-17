package com.demo.chess;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 2019/7/28/028.
 * ������
 */
public class Chess {

    /**
     * ���̴�С
     */
    final private int SIZE = 10;

    /**
     * ��ʾ���̵Ķ�ά����
     */
    private String[][] chessBoard;

    /**
     * ��ʾ��ǰ�Ǻ��廹�ǰ���

     */
    private boolean flag = true;

    /**
     * ���ٸ��������߾�ʤ��
     */
    private int WIN_COUNT = 5;

    /**
     * ���һ�������λ��
     */
    private int x = 0;
    private int y = 0;

    public Chess() {
        this.init();
        this.render();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Chess chess = new Chess();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            // ����
            chess.player(scanner);
            // ��ӡ����
            chess.render();
            // �ж��Ƿ��Ѿ���Ϸ����
            if (chess.checkIsWin(chess.x, chess.y)) {
                if (chess.flag) {
                    System.out.println("\033[93;1m" + "=====================\n=======�ڷ�ʤ��=======\n=====================" + "\033[0m");
                } else {
                    System.out.println("\033[93;1m" + "=====================\n=======�׷�ʤ��=======\n=====================" + "\033[0m");
                }
                break;
            }
        }
    }

    /**
     * �����Ƿ�ʤ��
     */
    private boolean checkIsWin(final int x, final int y) {
        // ���̴�С
        int size = SIZE;
        // ��¼�ж��ٸ���������
        int count = 1;
        // ʤ�������Ƕ��ٸ���������
        int winCount = WIN_COUNT;
        // ��ǰ��������
        String currentChess = chessBoard[x][y];

        // ������ֱ����
        // �����·�
        for (int i = x + 1; i < size; i ++) {
            if(chessBoard[i][y].equals(currentChess)) {
                count ++;
            } else {
                break;
            }
        }
        // �����Ϸ�
        for (int i = x - 1; i >= 0; i --) {
            if(chessBoard[i][y].equals(currentChess)) {
                count ++;
            } else {
                break;
            }
        }
//        System.out.println("��ǰ��ֱ����: " + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // �������ҷ���
        // ������
        for (int i = y - 1; i >= 0; i --) {
            if(chessBoard[x][i].equals(currentChess)) {
                count ++;
            } else {
                break;
            }
        }
        // �����ҷ�
        for (int i = y + 1; i < size; i ++) {
            if(chessBoard[x][i].equals(currentChess)) {
                count ++;
            } else {
                break;
            }
        }
//        System.out.println("��ǰ��������: " + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // ���� / ����
        // ��������
        for (int i = x - 1, j = y + 1; i >= 0 && j < size; i --, j ++) {
            if (chessBoard[i][j].equals(currentChess)) {
                count++;
            } else {
                break;
            }
        }
        // ��������
        for (int i = x + 1, j = y - 1; i < size && j >= 0; i ++, j --) {
            if (chessBoard[i][j].equals(currentChess)) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("��ǰ / ����: " + count);
        if (count >= WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }

        // ���� \ ����
        // ��������
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i --, j --) {
            if (chessBoard[i][j].equals(currentChess)) {
                count++;
            } else {
                break;
            }
        }
        // ��������
        for (int i = x + 1, j = y + 1; i < size && j < size; i ++, j ++) {
            if (chessBoard[i][j].equals(currentChess)) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("��ǰ \\ ����: " + count);
        if (count >= this.WIN_COUNT) {
            return true;
        } else {
            count = 1;
        }
        return false;
    }

    /**
     * ��ʼ������
     */
    private void init() {
        int size = this.SIZE;
        chessBoard = new String[size][];
        for (int i = 0; i < size; i++) {
            String[] row = new String[size];
            for (int j = 0; j < size; j++) {
                row[j] = "+";
            }
            chessBoard[i] = row;
        }
    }

    /**
     * ��Ⱦ����
     */
    private void render() {
        int size = this.SIZE;
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print("\033[91;1m" + i + "\033[0m" + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("\033[91;1m" + i + "\033[0m" + " ");
            for (int j = 0; j < size; j++) {
                String value = chessBoard[i][j];
                if (value.equals("��")) {
                    System.out.print("\033[93;1m" + value + "\033[0m" + " ");
                } else if (value.equals("��")) {
                    System.out.print("\033[96;1m" + value + "\033[0m" + " ");
                } else {
                    System.out.print("\033[95;1m" + value + "\033[0m" + " ");
                }
            }
            System.out.println();
        }
    }
    private void player(Scanner scanner) {
        System.out.println("�����壬ʾ����2,3");
        String orgin = scanner.nextLine();
        String [] orginArr = orgin.split(",");
        if (orginArr.length != 2) {
            System.out.println("�밴�ո�ʽ�������꣡");
            player(scanner);
            return ;
        }
        int x = 0;
        int y = 0;
        try{
            x = Integer.parseInt(orginArr[0]);
            y = Integer.parseInt(orginArr[1]);
        } catch (NumberFormatException e) {
            System.out.println("��������ȷ�����֣�");
            player(scanner);
            return ;
        }
        if (x > this.SIZE || y > this.SIZE) {
            System.out.println("�������̣����������룡");
            player(scanner);
            return ;
        }
        if (!this.chessBoard[x][y].equals("+")) {
            System.out.println("��ǰλ���ѱ�ռ��");
            player(scanner);
            return ;
        }
        // ����
        if (flag) {
            chessBoard[x][y] = "��";
            flag = !flag;
        } else {
            chessBoard[x][y] = "��";
            flag = !flag;
        }
        this.x = x;
        this.y = y;
    }
}
