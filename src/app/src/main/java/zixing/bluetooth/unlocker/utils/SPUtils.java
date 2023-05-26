package zixing.bluetooth.unlocker.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SPUtils {


    public static SPUtils xsp;
    public SharedPreferences sp;

    private SPUtils() {

    }

    public static synchronized SPUtils getInstance() {
        if (xsp == null) {
            xsp = new SPUtils();
        }
        return xsp;
    }

    /**
     * 初始化
     *
     * @param context
     */
    public void init(Context context) {
        sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
    }

    /**
     * 下面的是读取数据
     *
     * @param key
     * @param def
     * @return
     */
    public static String getString(String key, String def) {
        return SPUtils.getInstance().sp.getString(key, def);
    }

    public static int getInt(String key, int def) {
        return SPUtils.getInstance().sp.getInt(key, def);
    }

    public static float getFloat(String key, float def) {
        return SPUtils.getInstance().sp.getFloat(key, def);
    }

    public static long getLong(String key, long def) {
        return SPUtils.getInstance().sp.getLong(key, def);
    }

    public static boolean getBoolean(String key, boolean def) {
        return SPUtils.getInstance().sp.getBoolean(key, def);
    }

    /**
     * 下面是保存数据
     *
     * @param key
     * @param v
     * @return
     */
    public static boolean setString(String key, String v) {
        return SPUtils.getInstance().sp.edit().putString(key, v).commit();
    }

    public static boolean setInt(String key, int v) {
        return SPUtils.getInstance().sp.edit().putInt(key, v).commit();
    }

    public static boolean setBoolean(String key, boolean v) {
        return SPUtils.getInstance().sp.edit().putBoolean(key, v).commit();
    }

    public static boolean setFloat(String key, float v) {
        return SPUtils.getInstance().sp.edit().putFloat(key, v).commit();
    }

    public static boolean setLong(String key, long v) {
        return SPUtils.getInstance().sp.edit().putLong(key, v).commit();
    }
}
