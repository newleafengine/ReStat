package com.restat.omar.restat;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES30;
import android.opengl.GLSurfaceView;

/**
 * Created by omara on 2/19/2018.
 */

public class RestatRenderer implements GLSurfaceView.Renderer {

    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
        GLES30.glClearColor(0.2f, 0.4f, 0.6f, 1.0f);
    }

    public void onDrawFrame(GL10 unused){
        GLES30.glClear(GLES30.GL_COLOR_BUFFER_BIT);
    }

    public void onSurfaceChanged(GL10 unused, int width, int height){
        GLES30.glViewport(0, 0, width, height);
    }

}
