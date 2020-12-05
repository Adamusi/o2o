package com.imooc.myo2o.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	
	//读取绝对路径(线程)
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	//时间格式化的格式
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat(
			"yyyyMMddHHmmss"); 
	//随机对象
	private static final Random r = new Random();
	
	//文件上传的方法
	public static String generateThumbnail(File thumbnail, String targetAddr) {
		//获取上传文件随机名
		String realFileName = getRandomFileName();
		//获取上传文件的扩展名
		String extension = getFileExtension(thumbnail);
		//创建文件上传的目标地址
		makeDirPath(targetAddr);
		//文件上传的相对路径(目标地址+文件名+扩展名)
		String relativeAddr = targetAddr + realFileName + extension;
		//文件上传的绝对路径
		File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
		try {
			//水印图片
			Thumbnails.of(thumbnail).size(200, 200).watermark(Positions.BOTTOM_RIGHT, 
					ImageIO.read(new File(basePath + "java.jpg")), 0.25f).outputQuality(0.8f).toFile(dest);
		} catch (IOException e) {
			throw new RuntimeException("创建缩略图失败：" + e.toString());
		}
		return relativeAddr;
	}
	
	/**
	 * 生成随机文件名：当前年月日时分秒+五位随机数
	 * （为了在实际项目中防止文件同名而进行的处理）
	 * @return
	 */
	public static String getRandomFileName() {
		//获取随机五位数
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; 
		//当前时间
		String nowTimeStr = sDateFormat.format(new Date()); 
		return nowTimeStr + rannum;
	}
	
	/**
	 * 获取输入文件流的扩展名
	 * @param cFile
	 * @return
	 */
	private static String getFileExtension(File cFile) {
		String originalFileName = cFile.getName();
		return originalFileName.substring(originalFileName.lastIndexOf("."));
	}
	
	/**
	 * 创建目标路径所涉及到的目录
	 * @param targetAddr
	 */
	private static void makeDirPath(String targetAddr) {
		//获取绝对根路径
		String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
		File dirPath = new File(realFileParentPath);
		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}
	}
}
