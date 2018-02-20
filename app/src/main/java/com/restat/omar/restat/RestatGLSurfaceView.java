package com.restat.omar.restat;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by omara on 2/19/2018.
 */

public class RestatGLSurfaceView extends GLSurfaceView {
    private final RestatRenderer mRenderer;

    public RestatGLSurfaceView(Context context){
        super(context);

        // create a gles3 context
        setEGLContextClientVersion(3);

        mRenderer = new RestatRenderer();

        setRenderer(mRenderer);
    }
}
