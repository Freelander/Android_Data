package com.chengxinet.bobo.utils;

import android.util.Log;

import com.orhanobut.logger.Logger;

/**
 * Description : 日子工具类
 * Author : Jun
 */
public class LogUtils {
    public static final boolean DEBUG = true;

    public static void v(String tag, String message) {
        if(DEBUG) {
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if(DEBUG) {
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if(DEBUG) {
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if(DEBUG) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if(DEBUG) {
            Log.e(tag, message);
        }
    }

    public static void e(String tag, String message, Exception e) {
        if(DEBUG) {
            Log.e(tag, message, e);
        }
    }


    /**
     * 使用 Logger 工具
     */

    public static void logv(String tag, String message) {
        if (DEBUG) {
            Logger.init(tag);
            Logger.v(message);
        }
    }

    public static void logd(String tag, String message) {
        if(DEBUG) {
            Logger.init(tag);
            Logger.d(message);
        }
    }

    public static void logi(String tag, String message) {
        if(DEBUG) {
            Logger.init(tag);
            Logger.i(message);
        }
    }

    public static void logw(String tag, String message) {
        if(DEBUG) {
            Logger.init(tag);
            Logger.w(message);
        }
    }

    public static void loge(String tag, String message) {
        if(DEBUG) {
            Logger.init(tag);
            Logger.e(message);
        }
    }

    public static void loge(String tag, String message, Exception e) {
        if(DEBUG) {
            Logger.init(tag);
            Logger.e(message, e);
        }
    }

    public static void logJ(String tag, String message) {
        if (DEBUG) {
            Logger.init(tag);
            Logger.json(message);
        }
    }
}