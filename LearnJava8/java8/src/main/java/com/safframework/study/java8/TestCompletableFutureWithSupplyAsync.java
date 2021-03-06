package com.safframework.study.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 用supplyAsync()创建CompletableFuture
 * Created by tony on 2017/9/16.
 */
public class TestCompletableFutureWithSupplyAsync {

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("CompletableFuture");
    }
}
