package com.coohua;

public class FunctionVo implements Cloneable {

	/**
   * 
   */
	private static final long serialVersionUID = -9177827618080541039L;

	protected Long userId;

	protected String groupName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public FunctionVo clone() throws CloneNotSupportedException {
		FunctionVo cloned = (FunctionVo) super.clone();
		return cloned;
	}
}
