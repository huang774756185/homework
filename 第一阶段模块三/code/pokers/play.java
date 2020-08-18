package 第一阶段第三次作业.pokers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class play {
    public static void main(String[] args) {
        List<Poker> list = Poker.getPokers();
        // 洗牌
        Collections.shuffle(list);
        // 生成3个玩家
        TreeSet<Poker> player1 = new TreeSet<Poker>();
        TreeSet<Poker> player2 = new TreeSet<Poker>();
        TreeSet<Poker> player3 = new TreeSet<Poker>();
        TreeSet<Poker> dp = new TreeSet<Poker>();
        // 发牌
        for(int i = 0;i<list.size();i++) {
            //这里的i是正常索引值，而array里已经是打乱的索引值了
            //所以通过正常的索引i取出array对应的元素
            Poker poker = list.get(i);
            //先留三张牌为底牌
            if (i >= list.size() - 3) {
                dp.add(poker);
                //剩下的平均分给三个玩家
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }
        System.out.print("玩家一：");
        lookpoker(player1);
        System.out.print("玩家二：");
        lookpoker(player2);
        System.out.print("玩家三：");
        lookpoker(player3);
        System.out.print("底牌：");
        lookpoker(dp);
    }
    //创建看牌方法
    public static void lookpoker(TreeSet<Poker> list) {

        //遍历每一个玩家分到的索引，再将索引做键来取牌
        for (Poker poker : list) {

            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
