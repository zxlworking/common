package com.zxl.common;

import android.util.Log;

/**
 * Created by uidq0955 on 2018/5/18.
 */

public class DebugUtil {
    public static boolean STATE_OPEN = true;
    public static boolean STATE_CLOSE = false;
    public static boolean IS_DEBUG = false;

    public static void d(String tag,String message){
        if(IS_DEBUG){
            Log.d(tag,message);
        }
    }

    public static void d(Object object,String message){
        if(IS_DEBUG){
            Log.d(object.getClass().getSimpleName(),message);
        }
    }
}
