package com.oneone.uuu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by uuu on 17-8-15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
