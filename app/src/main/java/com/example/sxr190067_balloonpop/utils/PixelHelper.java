package com.example.sxr190067_balloonpop.utils;


import android.content.Context;
import android.util.TypedValue;

public class PixelHelper {


    /*
     * Convert pixels to dp
     * */
    public static int pixelsToDp(int px, Context context) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                context.getResources().getDisplayMetrics());
    }


    /*
     * Convert dp to pixles
     * */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}