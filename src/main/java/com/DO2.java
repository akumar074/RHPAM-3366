package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DO2 implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.DO1 do1;

	private java.lang.String address;

	private java.lang.String email;

	public DO2() {
	}

	public com.DO1 getDo1() {
		return this.do1;
	}

	public void setDo1(com.DO1 do1) {
		this.do1 = do1;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public DO2(com.DO1 do1, java.lang.String address, java.lang.String email) {
		this.do1 = do1;
		this.address = address;
		this.email = email;
	}

}