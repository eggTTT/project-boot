/*
package com.jy;

import java.io.File;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

public class ProjectMaker {
	private static boolean enableDubbo = false, enableJob = false, enableKafka = false, enableMethodLog = false,
			enableRedis = false, enableExcel = false;
	private static String exampleBasePath = "D:/project/jy-example-mvc";
	private static String projectName = "proto";// 这里去掉jy-

	public static void main(String[] args) {
		File exampleBasePathFile = new File(exampleBasePath);

		for (File exampleFile : FileUtil.loopFiles(exampleBasePathFile)) {
			if (exampleFile.getPath().contains(".git") || exampleFile.getPath().contains(".settings")
					|| exampleFile.getPath().contains(".idea") || exampleFile.getPath().contains("target")
					|| exampleFile.getName().startsWith(".")
					|| exampleFile.getName().equals(ProjectMaker.class.getSimpleName())) {
				continue;
			}

			if (!enableDubbo && (exampleFile.getPath().contains("jy-example-client")
					|| exampleFile.getPath().contains("jy-example-rpc"))) {
				continue;
			}

			File newFile = new File(exampleFile.getPath().replace(exampleBasePathFile.getName(), projectName)
					.replace("example", projectName));

			if (exampleFile.isDirectory()) {
				FileUtil.mkdir(newFile);
			} else {
				FileUtil.touch(newFile);

				String content = StrUtil.replace(FileUtil.readString(exampleFile, "utf-8"), "example", projectName);

				if (enableDubbo) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--dubbo开关", ""), "dubbo开关-->", "");
				}

				if (enableJob) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--job开关", ""), "job开关-->", "");
				}

				if (enableKafka) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--kafka开关", ""), "kafka开关-->", "");
				}

				if (enableMethodLog) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--方法日志开关", ""), "方法日志开关-->", "");
				}

				if (enableRedis) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--redis开关", ""), "redis开关-->", "");
				}

				if (enableExcel) {
					content = StrUtil.replace(StrUtil.replace(content, "<!--excel开关", ""), "excel开关-->", "");
				}

				FileUtil.writeString(content, newFile, "utf-8");
			}
		}

		System.out.println("项目生成成功");
	}

}
*/
