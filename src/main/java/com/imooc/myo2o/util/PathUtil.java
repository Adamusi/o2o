package com.imooc.myo2o.util;

public class PathUtil {
	private static String seperator = System.getProperty("file.separator");
	//获取项目图片的根路径
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if(os.toLowerCase().startsWith("win")){
			basePath  = "G:/picture/image/";
		}else {
			basePath = "/home/project/image";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	//(业务需求)获取子项目的图片路径
	public static String getShopImagePath(long shopId) {
		String imagePath = "upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
