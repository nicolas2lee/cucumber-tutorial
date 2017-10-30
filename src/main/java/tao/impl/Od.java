package tao.impl;

/**
 * Created by xinrui on 30/10/2017.
 */

public class Od {
    private String el5;
    private Amount valudoc;

    public Od(String el5,  Amount valudoc) {
        this.el5 = el5;
        this.valudoc = valudoc;
    }

    public String getEl5() {
        return el5;
    }

    public void setEl5(String el5) {
        this.el5 = el5;
    }

    public Amount getValudoc() {
        return valudoc;
    }

    public void setValudoc(Amount valudoc) {
        this.valudoc = valudoc;
    }
}
