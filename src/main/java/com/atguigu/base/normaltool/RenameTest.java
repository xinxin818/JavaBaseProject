package com.atguigu.base.normaltool;

import java.io.File;

public class RenameTest {

	public static void main(String[] args) {

		String path = "F:\\太棒了！终于有人把JVM讲清楚了！（Java虚拟机+JVM调优+MySQL调优+JVM类加载机制）";
		String subString = "太棒了！终于有人把JVM讲清楚了！（Java虚拟机+JVM调优+MySQL调优+JVM类加载机制） - ";

		File file = new File(path);
		File[] list = file.listFiles();

		// 如果目录下文件存在
		if (file.exists() && file.isDirectory()) {
			for (int i = 0; i < list.length; i++) {
				// 取文件名子存入name中
				String name = list[i].getName();
				System.out.println(name);

				if (name.contains(subString)) {
					String newName = name.substring(subString.length());
					// 重命名
					File dest = new File(path + "/" + newName);
					list[i].renameTo(dest);
					System.out.println(dest.getName());
				}
			}
		}
	}

}
