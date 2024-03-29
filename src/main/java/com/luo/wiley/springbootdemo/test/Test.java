package com.luo.wiley.springbootdemo.test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lsgem
 */
public class Test {

    private static final String TEST = "abcde";

    public static void main(String[] args) {

        //快速排序
        int[] numbers = new int[]{3, 2, 7, 4, 5, 6, 9, 8, 0, 1};
        quick_sort(numbers, 0, numbers.length - 1);
        System.out.println("快速排序结果：" + Arrays.toString(numbers));

        //修改String的值
        System.out.println("TEST值为：" + TEST);
        String copy = "abcde";
        String replace = "hello";
        try {
            Field field = TEST.getClass().getDeclaredField("value");
            field.setAccessible(true);
            char[] value = (char[])field.get(copy);
            System.arraycopy(replace.toCharArray(), 0, value, 0, value.length);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("TEST值修改为：" + TEST);

        // Arrays.asList(str)方法是将对象引用指向新的变量名，如果修改原对象，新的变量值会改变，
        String[] str = new String[] {"you", "wu"};
        List<String> strings = Arrays.asList(str);

        str[0] = "hello";
        System.out.println(strings.get(0));

        // int类型
        Integer a = new Integer(9);
    }

    private static int n = 0;
    public static void quick_sort(int[] s, int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) { // 从右向左找第一个小于x的数
                    j--;
                }
                if(i < j) {
                    s[i++] = s[j];
                }

                while(i < j && s[i] < x) {// 从左向右找第一个大于等于x的数
                    i++;
                }
                if(i < j) {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            n++;
            System.out.println("快速排序第" + n + "次排序结果：" + Arrays.toString(s));
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

    private static int[] quickSort(int[] numbers) {
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = numbers.length - 1; j > 0; j--) {
                    if (i < j && numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
            }
        }
        return numbers;
    }
}
