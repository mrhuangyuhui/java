package ch7_4;

import java.util.*;

import static java.util.Calendar.*;

/**
 * 7.4.2 Calendar 类
 */
public class CalendarTest {

    public static void main(String[] args) {

        // 使用当前时间来创建对象
        Calendar c = Calendar.getInstance();
        // 打印所有字段
        System.out.println(c);

        // 返回 Date 对象
        System.out.println(c.getTime());
        // 取出年
        System.out.println(c.get(YEAR));
        // 取出月
        System.out.println(c.get(MONTH));
        // 取出日
        System.out.println(c.get(DATE));

        // 分别设置年、月、日、时、分、秒 2003-11-23 12:32:23
        // 注意：月份从 0 开始
        c.set(2003, 10, 23, 12, 32, 23);
        System.out.println(c.getTime());

        // 将 Calendar 的年往前推 1 年
        c.add(YEAR, -1); // 2002-11-23 12:32:23
        System.out.println(c.getTime());

        // 将 Calendar 的月往前推 8 个月
        c.roll(MONTH, -8); // 2002-03-23 12:32:23
        System.out.println(c.getTime());

        // 注意 add 与 roll 的不同：add 会出现字段进位，roll 不会。

        Calendar cal1 = Calendar.getInstance();
        // 2003-08-23
        cal1.set(2003, 7, 23, 0, 0, 0);
        // MONTH 字段进位，YEAR 字段增加 1。
        cal1.add(MONTH, 6); // 2003-08-23 => 2004-2-23
        System.out.println(cal1.getTime());

        Calendar cal2 = Calendar.getInstance();
        // 2003-08-31
        cal2.set(2003, 7, 31, 0, 0, 0);
        // 如果下一级字段需要修正，那么该字段会修正到变化最小的值。
        cal2.add(MONTH, 6); // 2 月没有 31 日，2003-08-31 => 2004-02-29。
        System.out.println(cal2.getTime());

        Calendar cal3 = Calendar.getInstance();
        // 2003-08-23
        cal3.set(2003, 7, 23, 0, 0, 0);
        // MONTH 字段进位，但 YEAR 字段并不增加。
        cal3.roll(MONTH, 6); // 2003-08-23 => 2003-02-23
        System.out.println(cal3.getTime());

        Calendar cal4 = Calendar.getInstance();
        // 2003-08-31
        cal4.set(2003, 7, 31, 0, 0, 0);
        // 下一级字段的处理规则与 add 相同
        cal4.roll(MONTH, 6); // 2003-08-31 => 2003-2-28
        System.out.println(cal4.getTime());
    }
}