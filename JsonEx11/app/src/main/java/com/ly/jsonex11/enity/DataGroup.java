package com.ly.jsonex11.enity;

import java.util.List;

/**
 * Created by ly on 2019/7/26 10:12
 * <p>
 * Copyright is owned by chengdu haicheng technology
 * co., LTD. The code is only for learning and sharing.
 * It is forbidden to make profits by spreading the code.
 */
public class DataGroup {

    private DataEntity data;

    private int status;

    private List<List<InfoEntity>> info;

    public void setData(DataEntity data) {
        this.data = data;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public void setInfo(List<List<InfoEntity>> info) {
        this.info = info;
    }

    public DataEntity getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public List<List<InfoEntity>> getInfo() {
        return info;
    }

    public static class DataEntity {
        private String uid;
        private String user_name;
        private Object user_image;
        private String user_address;
        private String id;
        private String path1;
        private String path2;
        private Object path3;
        private Object path4;
        private Object path5;
        private Object path6;
        private Object path7;
        private Object path8;
        private Object path9;
        private String content;
        private String type;
        private String imgnum;
        private String count;
        private String c_time;
        private Object special;
        private String cnum;
        private int gz;
        private int dz;
        private int sc;
        private Object sid;
        /**
         * lname : 粉丝
         * lid : 57
         */

        private List<LabelsEntity> labels;

        public void setUid(String uid) {
            this.uid = uid;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public void setUser_image(Object user_image) {
            this.user_image = user_image;
        }

        public void setUser_address(String user_address) {
            this.user_address = user_address;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPath1(String path1) {
            this.path1 = path1;
        }

        public void setPath2(String path2) {
            this.path2 = path2;
        }

        public void setPath3(Object path3) {
            this.path3 = path3;
        }

        public void setPath4(Object path4) {
            this.path4 = path4;
        }

        public void setPath5(Object path5) {
            this.path5 = path5;
        }

        public void setPath6(Object path6) {
            this.path6 = path6;
        }

        public void setPath7(Object path7) {
            this.path7 = path7;
        }

        public void setPath8(Object path8) {
            this.path8 = path8;
        }

        public void setPath9(Object path9) {
            this.path9 = path9;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setImgnum(String imgnum) {
            this.imgnum = imgnum;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public void setC_time(String c_time) {
            this.c_time = c_time;
        }

        public void setSpecial(Object special) {
            this.special = special;
        }

        public void setCnum(String cnum) {
            this.cnum = cnum;
        }

        public void setGz(int gz) {
            this.gz = gz;
        }

        public void setDz(int dz) {
            this.dz = dz;
        }

        public void setSc(int sc) {
            this.sc = sc;
        }

        public void setSid(Object sid) {
            this.sid = sid;
        }

        public void setLabels(List<LabelsEntity> labels) {
            this.labels = labels;
        }

        public String getUid() {
            return uid;
        }

        public String getUser_name() {
            return user_name;
        }

        public Object getUser_image() {
            return user_image;
        }

        public String getUser_address() {
            return user_address;
        }

        public String getId() {
            return id;
        }

        public String getPath1() {
            return path1;
        }

        public String getPath2() {
            return path2;
        }

        public Object getPath3() {
            return path3;
        }

        public Object getPath4() {
            return path4;
        }

        public Object getPath5() {
            return path5;
        }

        public Object getPath6() {
            return path6;
        }

        public Object getPath7() {
            return path7;
        }

        public Object getPath8() {
            return path8;
        }

        public Object getPath9() {
            return path9;
        }

        public String getContent() {
            return content;
        }

        public String getType() {
            return type;
        }

        public String getImgnum() {
            return imgnum;
        }

        public String getCount() {
            return count;
        }

        public String getC_time() {
            return c_time;
        }

        public Object getSpecial() {
            return special;
        }

        public String getCnum() {
            return cnum;
        }

        public int getGz() {
            return gz;
        }

        public int getDz() {
            return dz;
        }

        public int getSc() {
            return sc;
        }

        public Object getSid() {
            return sid;
        }

        public List<LabelsEntity> getLabels() {
            return labels;
        }

        public static class LabelsEntity {
            private String lname;
            private String lid;

            public void setLname(String lname) {
                this.lname = lname;
            }

            public void setLid(String lid) {
                this.lid = lid;
            }

            public String getLname() {
                return lname;
            }

            public String getLid() {
                return lid;
            }
        }
    }

    public static class InfoEntity {
        private String lid;
        private String lname;
        private String xaxis;
        private String yaxis;
        private String direct;
        private String lclass;

        public void setLid(String lid) {
            this.lid = lid;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public void setXaxis(String xaxis) {
            this.xaxis = xaxis;
        }

        public void setYaxis(String yaxis) {
            this.yaxis = yaxis;
        }

        public void setDirect(String direct) {
            this.direct = direct;
        }

        public void setLclass(String lclass) {
            this.lclass = lclass;
        }

        public String getLid() {
            return lid;
        }

        public String getLname() {
            return lname;
        }

        public String getXaxis() {
            return xaxis;
        }

        public String getYaxis() {
            return yaxis;
        }

        public String getDirect() {
            return direct;
        }

        public String getLclass() {
            return lclass;
        }
    }
}
