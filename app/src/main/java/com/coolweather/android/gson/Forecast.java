package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/28.
 */

public class Forecast {

    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt_d")
        public String nowInfo;

        @SerializedName("txt_n")
        public String nextInfo;
    }

    public class Temperature{
        public String max;
        public String min;
    }
}
