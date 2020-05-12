package com.js.enums.program;

/**
 * @Author: 姜爽
 * @Description: 系统的节目播放时间所对应的枚举类
 * @Date: 2020/5/9 10:37
 */
public enum  ProgramDateEnum {
    //对应每天的节目播放时间区间
    MONDAY_MORNING("11","周一早间","07:20","08:00"),
    MONDAY_MORN_CLASS("12","周一上午课间","09:30","10:15"),
    MONDAY_NOON("13","周一午间","11:40","12:45"),
    MONDAY_AFTERNOON_CLASS("14","周一下午课间","15:00","15:40"),
    MONDAY_EVENING("15","周一晚间","17:00","17:50"),

    TUESDAY_MORNING("21","周二早间","07:20","08:00"),
    TUESDAY_MORN_CLASS("22","周二上午课间","09:30","10:15"),
    TUESDAY_NOON("23","周二午间","11:40","12:45"),
    TUESDAY_AFTERNOON_CLASS("24","周二下午课间","15:00","15:40"),
    TUESDAY_EVENING("25","周二晚间","17:00","17:50"),

    WEDNESDAY_MORNING("31","周三早间","07:20","08:00"),
    WEDNESDAY_MORN_CLASS("32","周三上午课间","09:30","10:15"),
    WEDNESDAY_NOON("33","周三午间","11:40","12:45"),
    WEDNESDAY_AFTERNOON_CLASS("34","周三下午课间","15:00","15:40"),
    WEDNESDAY_EVENING("35","周三晚间","17:00","17:50"),

    THURSDAY_MORNING("41","周四早间","07:20","08:00"),
    THURSDAY_MORN_CLASS("42","周四上午课间","09:30","10:15"),
    THURSDAY_NOON("43","周四午间","11:40","12:45"),
    THURSDAY_AFTERNOON_CLASS("44","周四下午课间","15:00","15:40"),
    THURSDAY_EVENING("45","周四晚间","17:00","17:50"),

    FRIDAY_MORNING("51","周五早间","07:20","08:00"),
    FRIDAY_MORN_CLASS("52","周五上午课间","09:30","10:15"),
    FRIDAY_NOON("53","周五午间","11:40","12:45"),
    FRIDAY_AFTERNOON_CLASS("54","周五下午课间","15:00","15:40"),
    FRIDAY_EVENING("55","周五晚间","17:00","17:50"),

    SATURDAY_MORN_CLASS("62","周六上午课间","09:30","10:20"),
    SATURDAY_NOON("63","周六午间","11:40","12:45"),
    SATURDAY_AFTERNOON_CLASS("64","周六下午课间","15:00","16:20"),
    SATURDAY_EVENING("65","周六晚间","17:00","18:05"),

    SUNDAY_MORN_CLASS("72","周日上午课间","09:30","10:20"),
    SUNDAY_NOON("73","周日午间","11:40","12:45"),
    SUNDAY_AFTERNOON_CLASS("74","周日下午课间","15:00","16:20"),
    SUNDAY_EVENING("75","周日晚间","17:00","18:05"),
    ;
    private String code;

    private String msg;

    private String startTime;

    private String endTime;

    ProgramDateEnum(String code, String msg,String startTime,String endTime) {
        this.code = code;
        this.msg = msg;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    /**
     * 删除标记码
     **/
    public String getCode() {
        return code;
    }
    /**
     * 对应信息
     **/
    public String getMsg() {
        return msg;
    }

    /**
     * 获取对应的开始时间
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * 获取对应的结束时间
     **/
    public String getEndTime() {
        return endTime;
    }
}
