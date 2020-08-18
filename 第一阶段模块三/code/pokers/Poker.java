package 第一阶段第三次作业.pokers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker implements Comparable<Poker> {


    private String value;
    private Integer index;
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Poker(){}

    @Override
    public String toString() {
        return this.value;
    }

    public Poker(Integer index, String value) {
        this.index = index;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public static List<Poker> getPokers(){
        // 1、创建一个ArrayList用来装扑克
        List pokerList = new ArrayList();
        // 2、创建一个hashmap用来存放扑克与序号得映射
        Map<Integer, String> pokerMap = new HashMap<>();
        // 3、生成扑克，包括花色和大小
        String[] colors = {"方块","红桃","黑桃","梅花"};
        String[] pokerValues={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        // 4、扑克顺序
        Integer index = 0;
        for (String color:colors
                ) {
            for (String polerValue:pokerValues
                    ) {

                Poker poker = new Poker(index, color+polerValue);
                pokerList.add(poker);
                index++;
            }
        }
        // 5、添加大小王
        pokerList.add(new Poker(index,"小王"));
        index ++;
        pokerList.add(new Poker(index,"大王"));
        return pokerList;

    }

    @Override
    public int compareTo(Poker o) {
        // 升序排列
        return this.index-o.index;
    }
}
