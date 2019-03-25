package com.bb.common.vo;
import java.io.Serializable;
/**
 * 基于此对象封装帖子标题,内容信息等
 */
import java.util.Date;
public class CheckBox implements Serializable{
	private static final long serialVersionUID = -7861184138575615474L;
	private String forumBT;
    private String forumMessage;
	private String createdUser;
	private Date createdTime;
	private String forumAmount;

	public String getForumBT() {
		return forumBT;
	}
	public void setForumBT(String forumBT) {
		this.forumBT = forumBT;
	}
	public String getForumMessage() {
		return forumMessage;
	}
	public void setForumMessage(String forumMessage) {
		this.forumMessage = forumMessage;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getForumAmount() {
		return forumAmount;
	}
	public void setForumAmount(String forumAmount) {
		this.forumAmount = forumAmount;
	}
	@Override
	public String toString() {
		return "CheckBox [forumBT=" + forumBT + ", forumMessage=" + forumMessage + ", createdUser=" + createdUser
				+ ", createdTime=" + createdTime + ", forumAmount=" + forumAmount + "]";
	}

	
    
}
