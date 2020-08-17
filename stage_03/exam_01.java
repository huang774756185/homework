package stage_03;

import java.util.regex.*;
public class exam_01 {
    public static void main(String[] args) {
        String s =  "ABCD123!@#$%ab";
        int upCount=0;
        int lowCount=0;
        int dCount=0;
        int oCount=0;
        Pattern up=Pattern.compile("[A-Z]");
        Pattern low=Pattern.compile("[a-z]");
        Pattern d=Pattern.compile("\\d");
        Pattern o=Pattern.compile("\\W");

        for (char c:s.toCharArray()
             ) {
            if (up.matcher(String.valueOf(c)).find()){
                upCount +=1;
            }
            if(low.matcher(String.valueOf(c)).find()){
                lowCount +=1;
            }
            if(d.matcher(String.valueOf(c)).find()){
                dCount +=1;
            }
            if(o.matcher(String.valueOf(c)).find()){
                oCount +=1;
            }
        }
        System.out.println(upCount);
        System.out.println(lowCount);
        System.out.println(dCount);
        System.out.println(oCount);

    }

}
