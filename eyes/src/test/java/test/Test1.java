package test;/**
 * Created by yaolijun on 2017/7/4.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaolijun on 2017/7/4 21:19
 */
public class Test1 {
    public static void main(String[] args) {
        String[] ss = {"大", "小", "前", "大", "小"};
        Map<String, Object> map = new HashMap<String, Object>();
        String sop = "";
        for (int i = 0; i < ss.length; i++) {
            String temp = ss[i];
            int count = 0;
            for (int j = 0; j < ss.length; j++) {
                String temp2 = ss[j];
                if (temp == temp2) {
                    count++;
                }
                map.put(ss[i], count);
            }
        }
        System.out.println(map.toString());
    }
}
