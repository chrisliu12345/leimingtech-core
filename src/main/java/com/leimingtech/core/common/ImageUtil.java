package com.leimingtech.core.common;

import java.awt.Dimension;
import java.io.IOException;

import com.leimingtech.core.image.ImageJDKUtil;
import com.leimingtech.core.image.ImageMagickUtil;

import magick.MagickException;


/**
 * @author huanglei
 * @date 2008-5-7
 */

public class ImageUtil {
	/**
	 * @param args
	 * @throws IOException
	 * @throws MagickException
	 */
	public static void main(String[] args) throws IOException, MagickException {
		scaleRateImageFile("E:\\yuan\\MCBNR.jpg","E:\\yuan\\MCBNR.jpg_400x400.jpg",400,400);
	}

	public static boolean existsImageMagick() {
		//记得修改 公用类
		//if ("1".equals(CommonConstants.MASK_TYPE)) {
		if ("1".equals(0)) {
			return true;
		} else {
			return false;
		}
	}

	public static Dimension getDimension(String fileName) throws MagickException, IOException {
		if (existsImageMagick()) {
			return ImageMagickUtil.getDimension(fileName);
		} else {
			return ImageJDKUtil.getDimension(fileName);
		}
	}

	public static void scaleRateImageFile(String fromFileName, String toFileName, int toWidth, int toHeight)
			throws IOException, MagickException {
		if (existsImageMagick()) {
			ImageMagickUtil.scaleRateImageFile(fromFileName, toFileName, toWidth, toHeight);
		} else {
			ImageJDKUtil.scaleRateImageFile(fromFileName, toFileName, toWidth, toHeight);
		}
	}

	public static void scaleRateImageFile(String fromFileName, String toFileName, double rate) throws MagickException,
			IOException {
		if (existsImageMagick()) {
			ImageMagickUtil.scaleRateImageFile(fromFileName, toFileName, rate);
		} else {
			ImageJDKUtil.scaleRateImageFile(fromFileName, toFileName, rate);
		}
	}

	public static void scaleFixedImageFile(String fromFileName, String toFileName, int toWidth, int toHeight)
			throws MagickException, IOException {
		if (existsImageMagick()) {
			ImageMagickUtil.scaleFixedImageFile(fromFileName, toFileName, toWidth, toHeight);
		} else {
			ImageJDKUtil.scaleFixedImageFile(fromFileName, toFileName, toWidth, toHeight);
		}
	}

	public static void pressText(String filePath, String pressText, int color, int fontSize, int position) {
		if (existsImageMagick()) {
			ImageMagickUtil.pressText(filePath, pressText, color, fontSize, position);
		} else {
			ImageJDKUtil.pressText(filePath, pressText, color, fontSize, position);
		}
	}

	public final static void pressImage(String targetImg, String pressImg, int position) {
		if (existsImageMagick()) {
			ImageMagickUtil.pressImage(targetImg, pressImg, position);
		} else {
			ImageJDKUtil.pressImage(targetImg, pressImg, position);
		}
	}

}
