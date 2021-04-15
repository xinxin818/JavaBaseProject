package com.atguigu.base.normaltool;

import java.io.File;

public class RenameTest {

	public static void main(String[] args) {

		String path = "D:\\learn\\video\\2021版Java架构师课程全套视频300集";
		String subString = "2021版Java架构师课程全套视频300集，现在分享给大家，入门到精通(Java零基础到Java高 - ";

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
