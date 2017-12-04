package com.ymdev.ymzxinglib;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.ymdev.ymzxinglib.camera.CameraManager;

/**
 * Created by yumodev on 17/12/4.
 */

public abstract class CaptureBaseActivity extends Activity {

    public abstract ViewfinderView getViewfinderView();

    public abstract CameraManager getCameraManager();
    public abstract Handler getHandler();
    public abstract void handleDecode(Result rawResult, Bitmap barcode, float scaleFactor);
    public abstract void drawViewfinder();
}
