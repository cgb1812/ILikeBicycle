package com.bb.sys.entity;

import java.io.Serializable;
import java.util.Date;

import com.bb.common.DateJsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 帖子实体类
 * @author bianzc
 *
 */
public class Forum implements Serializable{

	private static final long serialVersionUID = 7301581972702786937L;
	public String forumID;//文章ID
	public String forumBT;//文章标题
	public String forumMessage;//文章内容
	public String forumType;//发布类别
	public String forumAmount;//帖子浏览量
	public String forumAvatar;//头像
	public String createdUser;//发布人名字
	public Date createdTime;//发布时间
	public String modifiedUser;//修改人名字
	public Date modifiedTime;//修改时间
	//Getter and Setter
	public String getForumID() {
		return forumID;
	}
	public void setForumID(String forumID) {
		this.forumID = forumID;
	}
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
	public String getForumType() {
		return forumType;
	}
	public void setForumType(String forumType) {
		this.forumType = forumType;
	}
	public String getForumAmount() {
		return forumAmount;
	}
	public void setForumAmount(String forumAmount) {
		this.forumAmount = forumAmount;
	}
	public String getForumAvatar() {
		return forumAvatar;
	}
	public void setForumAvatar(String forumAvatar) {
		this.forumAvatar = forumAvatar;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createUser) {
		this.createdUser = createUser;
	}
	@JsonSerialize(using=DateJsonSerializer.class)
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createTime) {
		this.createdTime = createTime;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	@JsonSerialize(using=DateJsonSerializer.class)
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	//重写toString
	@Override
	public String toString() {
		return "forumEntity [forumID=" + forumID + ", forumBT=" + forumBT + ", forumMessage=" + forumMessage
				+ ", forumType=" + forumType + ", forumAmount=" + forumAmount + ", forumAvatar=" + forumAvatar
				+ ", createUser=" + createdUser + ", createTime=" + createdTime + ", modifiedUser=" + modifiedUser
				+ ", modifiedTime=" + modifiedTime + "]";
	}

}
