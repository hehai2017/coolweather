package com.oneone.uuu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by uuu on 17-8-15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
