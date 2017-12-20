package com.example.a15616.douweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hungryao on 12/16/2017.
 */

public class Suggestion {

    public Air air;
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("drsg")
    public DressSug dressSug;
    @SerializedName("flu")
    public Influenza influenza;
    public Sport sport;
    @SerializedName("trav")
    public Travel travel;
    @SerializedName("uv")
    public Ultraviolet ultraviolet;

    public class Air {
        @SerializedName("brf")
        public String brief;
        /**
         * 空气质量
         */
        @SerializedName("txt")
        public String info;
    }

    /**
     * 舒适度指数
     */
    public class Comfort {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 洗车指数
     */
    public class CarWash {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 穿衣指数
     */
    public class DressSug {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 感冒指数
     */
    public class Influenza {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 运动指数
     */
    public class Sport {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 旅行指数
     */
    public class Travel {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }

    /**
     * 紫外线指数
     */
    public class Ultraviolet {
        @SerializedName("brf")
        public String brief;
        @SerializedName("txt")
        public String info;
    }
}
