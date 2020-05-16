import java.util.HashMap;
import java.util.Map;

public class TestMap {
   //找出那个只出现了一次的元素。
    //示例 1:
    //
    //输入: [2,2,1]
    //输出: 1
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //把数字转成map存储
        for (int x : nums) {
            if(map.get(x) == null ) {
                map.put(x, 1);
            }
            else  {
                map.put(x, 1 + map.get(x));
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
