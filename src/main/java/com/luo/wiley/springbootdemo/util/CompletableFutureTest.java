package com.luo.wiley.springbootdemo.util;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            throw new RuntimeException("出错了！！");
        });

        try {
            future.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
