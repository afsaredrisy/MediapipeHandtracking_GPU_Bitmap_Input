package com.google.mediapipe.apps.handtrackinggpu;

import android.graphics.Bitmap;


public interface CustomFrameAvailableListner {

    public void onFrame(Bitmap bitmap);
}
