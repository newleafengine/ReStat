package com.restat.omar.restat;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by omara on 2/19/2018.
 */

public class GLES3Activity extends Activity{
    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        // create a surface view
        mGLView = new RestatGLSurfaceView(this);
        setContentView(mGLView);
        hideSystemUI();
    }

    @Override
    public void onResume(){
        super.onResume();
        hideSystemUI();
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
