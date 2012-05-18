package com.demo.struts.forms;

import org.apache.struts.action.ActionForm; 

public class TestForm extends ActionForm {

	protected String str1 = null;
	protected String str2 = null;

	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
}
