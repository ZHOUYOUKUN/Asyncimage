package com.interfaces;

import android.graphics.Bitmap;

/**
 * 异步下载图片的回调接口
 * @author len
 *
 */
public interface onImageLoaderListener{
	void onImageLoader(Bitmap bitmap, String url);
}
