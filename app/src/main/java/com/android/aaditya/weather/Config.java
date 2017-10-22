package com.android.aaditya.weather;

import android.content.pm.ActivityInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aaditya on 10/20/17.
 */

public class Config {

    //--------------------------------------------------------------------------------
    // App general configurations
    //--------------------------------------------------------------------------------
    public static final boolean DEBUG = true;

    public static final int ORIENTATION_PORTRAIT    = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
    public static final int ORIENTATION_LANDSCAPE   = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
    public static final int ORIENTATION_SENSOR      = ActivityInfo.SCREEN_ORIENTATION_SENSOR;
    public static final int ORIENTATION_DEFAULT     = ORIENTATION_PORTRAIT;

    //--------------------------------------------------------------------------------
    // API related constants/configurations - used in ApiModule
    //--------------------------------------------------------------------------------
    public static final String API_BASE_URL_PRODUCTION = "http://openweathermap.org/data/2.5/";
    public static final String API_BASE_URL_MOCK = "api.openweathermap.org/data/2.5/";
    // Active base url
    public static final String API_BASE_URL = API_BASE_URL_PRODUCTION;

    // Common http headers required to be added by interceptor
    public static final Map<String, String> API_HEADERS = new HashMap<String, String>() {{
        put("User-Agent", "Weather-App");
        put("Content-Type", "application/json");
    }};

    // Key
    public static final String KEY_ = "b1b15e88fa797225412429c1c50c122a";

    public static final String[] KEYS = new String[]{
            "b1b15e88fa797225412429c1c50c122a1",
            "b2c2f73ec36ac4a0a2ccd2107e34f54d",
            "7f225dfb054c4db8e8427a9e07753d77",
            "f3dae0e698039afa2098348484241311",
            "9eb1d8aed3bdc09c360faf7e61c01c51",
            "1cac6167e047af242e771ff28881f2ab",
            "fe8264bdaae5649e2ac309b1e5db924b"
    };

}
