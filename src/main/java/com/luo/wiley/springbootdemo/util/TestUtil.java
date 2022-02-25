package com.luo.wiley.springbootdemo.util;

public class TestUtil {

    public static void main(String[] args) {
        //有n元钱，汽水2元一瓶，两个汽水瓶换一瓶汽水，四个瓶盖换一瓶汽水，最多可以喝多少瓶
        int n = 10;
        int total = drink(n);
        System.out.println("total:" + total);
    }

    private static int getTotal(int n) {
        int ret = 0;
        int buy_num = n/2; //购买数量

        int bottle_num = n/2; //空瓶数
        int lid_num = n/2; //盖数

        int bottle_buy_num = bottle_num/2; //空瓶兑换数量
        int lid_buy_num = lid_num/4; //盖兑换数量

        int bottle_remainder = bottle_num%2;
        int lid_remainder = lid_num%4;

        ret = buy_num + bottle_buy_num + lid_buy_num;

        do {
            int bottle_buy_num_older = bottle_buy_num;
            int lid_buy_num_older = lid_buy_num;
            bottle_buy_num = (bottle_buy_num_older + lid_buy_num_older + bottle_remainder) / 2;
            lid_buy_num = (bottle_buy_num_older + lid_buy_num_older + lid_remainder) / 4;

            bottle_remainder = (bottle_buy_num_older + lid_buy_num_older + bottle_remainder) % 2;
            lid_remainder = (bottle_buy_num_older + lid_buy_num_older + lid_remainder) % 4;

            ret = ret + bottle_buy_num + lid_buy_num;
        } while ((bottle_buy_num + lid_buy_num + bottle_remainder) / 2 != 0 || (bottle_buy_num + lid_buy_num + lid_remainder) / 4 != 0);

        return ret;
    }

    private static int drink(int money) {
        int bottles = money / 2;
        int res = 0;
        for(int i = 1; i <= bottles; i++) {
            res++;
            if(i % 2 == 0) {
                bottles++;
            }
            if(i % 4 == 0) {
                bottles++;
            }
        }
        return res;
    }
}
