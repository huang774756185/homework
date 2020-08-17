package 第一阶段第三次作业;

import java.util.HashMap;
import java.util.Map;

public class exam_03 {
    public static void main(String[] args) {
        String digitals="123,456,789,123,456";
        Map<String,Integer> map = new HashMap<>();
        for (String d:digitals.split(",")
             ) {
            // 如果map中没有这个字符串，则给这个key赋值
            if(!map.keySet().contains(d)){
                map.put(d,1);
            }else {
                // 如果已有该字符串，则将value值+1
                map.put(d,map.get(d)+1);
            }
        }
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+":"+String.valueOf(entry.getValue()));
        }
    }
}
