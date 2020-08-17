package 第一阶段第三次作业;

public class exam_02 {
    public static void main(String[] args) {
        String s1="asdafghjka";
        String s2="aaasdfg";
        System.out.println(getMaxSubstring(s1,s2));


    }
    // 获得最大子串
    public static String getMaxSubstring(String s1, String s2) {
        // 先判断两个字符串长度
        String max = null,min = null;
        max = (s1.length()>s2.length())?s1:s2;

        min = max.equals(s1)?s2:s1;

        System.out.println("max="+max);
        System.out.println("min="+min);



        for (int i = 0; i < min.length(); i++) {

            for(int a = 0,b = min.length()-i; b != min.length()+1; a++,b++){

                String sub = min.substring(a, b);
                if(max.contains(sub))
                    return sub;
            }
        }

        return "-1";
    }
}

