package cn.com.bsfit.assets.func;

import java.util.Date;

import cn.com.bsfit.anno.Func;
import cn.com.bsfit.anno.Param;

/**
 * 方法类，里面只存储各种方法，对应以前assets的全局方法
 */
//@NS("区块链")
public class GlobalFunction1 {

    @Func("时间差")
    public static Long getTimeDistance(@Param("日期时间") Object obj1, @Param("日期时间") Object obj2) {
        if (obj1 == null || "".equals(obj1) || obj2 == null || "".equals(obj2))
            return null;
        long time1 = 0, time2 = 0;
        if (obj1 instanceof Date) {
            time1 = ((Date) obj1).getTime();
        } else if (obj1 instanceof Long) {
            time1 = (Long) obj1;
        } else {
            time1 = Long.valueOf(obj1.toString());
        }

        if (obj2 instanceof Date) {
            time2 = ((Date) obj2).getTime();
        } else if (obj2 instanceof Long) {
            time2 = (Long) obj2;
        } else {
            time2 = Long.valueOf(obj2.toString());
        }
        return Math.abs(time1 - time2);
    }

    @Func("判断第一个字符串参数以第二个字符串参数开头")
    public static boolean isStartWith(@Param("第一个字符串") Object obj1, @Param("第2个字符串") Object obj2) {
        if (obj1 == null || obj2 == null)
            return false;
        if (obj1 instanceof String && obj2 instanceof String) {
            return String.valueOf(obj1).startsWith(String.valueOf(obj2));
        }
        return false;
    }

    @Func("平均间隔时间")
    public static Long avg_between_time(@Param("计数") Object count, @Param("开始时间") Object first_time,
                                           @Param("最新时间") Object last_time) {
        if (count == null || first_time == null || last_time == null)
            return -1L;
        if (count instanceof Long && first_time instanceof Long && last_time instanceof Long) {
            return ((Long)last_time-(Long)first_time)/(Long)count;
        }
        return -1L;
    }


    
}
