package com.xtgj.j2ee.chapter05.entity;

import java.util.HashSet;

public class TblQx implements java.io.Serializable {
	private int qxid = 0;
	private String qx = "";
	
	public String getQx() {
		return qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

	public int getQxid() {
		return qxid;
	}

	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
}
