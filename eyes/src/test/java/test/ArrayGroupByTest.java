package test;
/**
 * Created by yaolijun on 2017/7/3.
 */

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by yaolijun on 2017/7/3 20:05
 */
public class ArrayGroupByTest {

    public static void main(String[] args) {
        List<GroupEntity>  initList = new ArrayList<>();
        initList.add(new GroupEntity(new BigDecimal(10.00),"美国","上海","M"));
        initList.add(new GroupEntity(new BigDecimal(9.00),"美国","沈阳","M"));
        initList.add(new GroupEntity(new BigDecimal(10.00),"中国","广东","Z"));
        initList.add(new GroupEntity(new BigDecimal(8.00),"日本","珠海","R"));
        initList.add(new GroupEntity(new BigDecimal(10.00),"韩国","海南","H"));
        initList.add(new GroupEntity(new BigDecimal(6.00),"美国","海南","M"));
        initList.add(new GroupEntity(new BigDecimal(4.00),"美国","上海","M"));
        initList.add(new GroupEntity(new BigDecimal(10.00),"日本","珠海","R"));
        initList.add(new GroupEntity(new BigDecimal(11.00),"中国","沈阳","Z"));
        initList.add(new GroupEntity(new BigDecimal(17.00),"缅甸","上海","M"));

        System.out.println("排序前:");
        for (GroupEntity ge : initList) {
            System.out.println("金额："+ge.getAmount()+",贸易:"+ge.getTrade()+",口岸:"+ge.getKouan());
        }

        // 排序
        Collections.sort(initList);

        System.out.println("排序后:");
        for (GroupEntity ge : initList) {
            System.out.println("金额："+ge.getAmount()+",贸易:"+ge.getTrade()+",口岸:"+ge.getKouan());
        }

//        排序后:
//        金额：10,贸易:韩国,口岸:海南
//        金额：10,贸易:美国,口岸:上海
//        金额：9,贸易:美国,口岸:沈阳
//        金额：6,贸易:美国,口岸:海南
//        金额：4,贸易:美国,口岸:上海
//        金额：17,贸易:缅甸,口岸:上海
//        金额：8,贸易:日本,口岸:珠海
//        金额：10,贸易:日本,口岸:珠海
//        金额：10,贸易:中国,口岸:广东
//        金额：11,贸易:中国,口岸:沈阳
        Map<String, Object> map = new HashMap<String, Object>();
        String sop = "";
        for (int i = 0; i < initList.size(); i++) {
            String temp = initList.get(i).getTrade();
            int count = 0;
            for (int j = 0; j < initList.size(); j++) {
                String temp2 = initList.get(j).getTrade();
                if (temp == temp2) {
                    count++;
                }
                map.put(count+"", initList.get(i).getTrade());
            }
        }
        System.out.println(map.toString());


//        List<GroupEntity> groupEntitiesList = new ArrayList<>();
//        groupEntitiesList.add(0, GroupEntity);




//        // 定义一个中文排序器
//        Comparator comparator = Collator.getInstance(Locale.CHINA);
//        // 升序排序
//        Arrays.sort(tradeList.toArray(), comparator);

    }
}
