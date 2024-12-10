package com.neoteric.JDBCConnection;

import java.util.Date;

public class Project {

    private int id;

    private String pname;

    private Date startdte;

    private Date endtime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdte() {
        return startdte;
    }

    public void setStartdte(Date startdte) {
        this.startdte = startdte;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}
