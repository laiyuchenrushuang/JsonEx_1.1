package com.ly.jsonex11.enity;

import java.util.List;

public class JsonRootBean {

    private int code;
    private String message;
    private List<Data> data;
    private String mile;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setMile(String mile) {
        this.mile = mile;
    }

    public String getMile() {
        return mile;
    }

    public static class Data {

        private long checkTime;
        private String currVin;
        private String oldVin;
        private String systemName;

        public void setCheckTime(long checkTime) {
            this.checkTime = checkTime;
        }

        public long getCheckTime() {
            return checkTime;
        }

        public void setCurrVin(String currVin) {
            this.currVin = currVin;
        }

        public String getCurrVin() {
            return currVin;
        }

        public void setOldVin(String oldVin) {
            this.oldVin = oldVin;
        }

        public String getOldVin() {
            return oldVin;
        }

        public void setSystemName(String systemName) {
            this.systemName = systemName;
        }

        public String getSystemName() {
            return systemName;
        }

    }
}