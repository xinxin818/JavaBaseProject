package com.tulingxueyuan.jvmtest;

import sun.misc.Launcher;

import java.net.URL;

public class TestJdkClassLoader {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());// null
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClass().getName());// java.lang.Class
        System.out.println(TestJdkClassLoader.class.getClassLoader().getClass().getName());// sun.misc.Launcher$AppClassLoader

        System.out.println();
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootstrapLoader = extClassLoader.getParent();

        System.out.println("the bootstrapLoader : " + bootstrapLoader);// the bootstrapLoader : null
        System.out.println("the extClassLoader : " + extClassLoader);// the extClassLoader : sun.misc.Launcher$ExtClassLoader@266474c2
        System.out.println("the appClassLoader : " + appClassLoader);// the appClassLoader : sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println();
        System.out.println("bootstrapLoader加载以下文件：");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urLs.length; i++) {
            System.out.println(urLs[i]);
        }

        System.out.println();
        System.out.println("extClassLoader加载以下文件：");
        System.out.println(System.getProperty("java.ext.dirs"));

        System.out.println();
        System.out.println("appClassLoader加载以下文件：");
        System.out.println(System.getProperty("java.class.path"));

        // bootstrapLoader加载以下文件：
        // file:/D:/java/jdk1.8.0_172/jre/lib/resources.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/rt.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/sunrsasign.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/jsse.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/jce.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/charsets.jar
        // file:/D:/java/jdk1.8.0_172/jre/lib/jfr.jar
        // file:/D:/java/jdk1.8.0_172/jre/classes

        // extClassLoader加载以下文件：
        // D:\Java\jdk1.8.0_172\jre\lib\ext;C:\Windows\Sun\Java\lib\ext

        //appClassLoader加载以下文件：
        //D:\java\jdk1.8.0_172\jre\lib\charsets.jar;
        //D:\java\jdk1.8.0_172\jre\lib\deploy.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\access-bridge-64.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\cldrdata.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\dnsns.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\jaccess.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\jfxrt.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\localedata.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\nashorn.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\sunec.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\sunjce_provider.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\sunmscapi.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\sunpkcs11.jar;
        //D:\java\jdk1.8.0_172\jre\lib\ext\zipfs.jar;
        //D:\java\jdk1.8.0_172\jre\lib\javaws.jar;
        //D:\java\jdk1.8.0_172\jre\lib\jce.jar;
        //D:\java\jdk1.8.0_172\jre\lib\jfr.jar;
        //D:\java\jdk1.8.0_172\jre\lib\jfxswt.jar;
        //D:\java\jdk1.8.0_172\jre\lib\jsse.jar;
        //D:\java\jdk1.8.0_172\jre\lib\management-agent.jar;
        //D:\java\jdk1.8.0_172\jre\lib\plugin.jar;
        //D:\java\jdk1.8.0_172\jre\lib\resources.jar;
        //D:\java\jdk1.8.0_172\jre\lib\rt.jar;
        //D:\code\ideaWorkSpace1\GitProjectManage\JavaBaseProject\target\classes;
        //D:\java\Maven-Repository\junit\junit\4.12\junit-4.12.jar;
        //D:\java\Maven-Repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;
        //D:\java\Maven-Repository\net\sourceforge\cglib\com.springsource.net.sf.cglib\2.1.3\com.springsource.net.sf.cglib-2.1.3.jar;
        //D:\workEnv\IntelliJ IDEA 2020.1.1\lib\idea_rt.jar

    }
}
