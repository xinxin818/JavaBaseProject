//package com.tulingxueyuan.jvmtest;
//
//public class String {
//
//    public static void main(String[] args) {
//        System.out.println("My String Class");
//        /**
//         * 错误: 在类 com.tulingxueyuan.jvmtest.TestJdkClassLoader 中找不到 main 方法, 请将 main 方法定义为:
//         *    public static void main(String[] args)
//         * 否则 JavaFX 应用程序类必须扩展javafx.application.Application
//         */
//        /**
//         * 为什么要设计双亲委派机制：
//         * 1.沙箱安全机制：自己写的Java.String.class类不会被加载，这样便可以防止核心API库被随意篡改
//         * 2.避免类的重复加载：当父亲已经加载了该类时，就没有必要子ClassLoader再加载一次，保证被加载类的唯一性
//         */
//    }
//}
