package com.rajesh.recyclerviewexample;

public class MyList {

    String desc;
    int imgId;


    public MyList(String desc, int imgId) {
        this.desc = desc;
        this.imgId = imgId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
