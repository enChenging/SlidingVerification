package com.release.slidingverification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.appcompat.widget.AppCompatSeekBar;

/**
 * @author Mr.release
 * @create 2019-12-19
 * @Describe
 */

public class SlidingVerification extends AppCompatSeekBar {

    public SlidingVerification(Context context) {
        super(context);
    }

    public SlidingVerification(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlidingVerification(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int left = getThumb().getBounds().left;
        int right = getThumb().getBounds().right;
        int x = (int) event.getX();

        if (event.getAction() == MotionEvent.ACTION_DOWN){
            if (x < left || x > right){
                return false;
            }
        }
        return super.dispatchTouchEvent(event);
    }
}
