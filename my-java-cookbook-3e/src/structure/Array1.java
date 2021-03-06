package structure;

import java.util.Calendar;

/**
 * 7.1 使用数组
 */
public class Array1 {
    public static void main(String[] argv) {
        // 数组元素是基本类型
        int[] monthLen1;            // declare a reference
        monthLen1 = new int[12];        // construct it
        int[] monthLen2 = new int[12];    // short form
        // even shorter is this initializer form:
        int[] monthLen3 = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31,
        };
        // 数组元素是引用类型
        final int MAX = 10;
        Calendar[] days = new Calendar[MAX];
        for (int i = 0; i < MAX; i++) {
            days[i] = Calendar.getInstance();
        }
        // 二维数组
        int[][] me = new int[10][];
        for (int i = 0; i < 10; i++)
            me[i] = new int[24];
        // 数组长度
        System.out.println(me.length);
        System.out.println(me[0].length);
    }
}