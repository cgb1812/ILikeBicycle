package com.bb.sys.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 帖子回复实体类
 * @author bianzc
 *
 */
public class ForumReply implements Serializable{

	private static final long serialVersionUID = -7460463898037609107L;
	public String replyID;//回复ID
	public String replyAvatar;//回复人头像
	public String replyContent;//回复内容
	public Date replyTime;//回复时间
	public String replyportID;//帖子ID
	public String replyName;//回复人名称
	public Date createdTime;//回复创建时间
	public Date modifiedTime;//回复修改时间
	//Getter and Setter
	public String getReplyID() {
		return replyID;
	}

	public void setReplyID(String replyID) {
		this.replyID = replyID;
	}

	public String getReplyAvatar() {
		return replyAvatar;
	}

	public void setReplyAvatar(String replyAvatar) {
		this.replyAvatar = replyAvatar;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyportID() {
		return replyportID;
	}

	public void setReplyportID(String replyportID) {
		this.replyportID = replyportID;
	}

	public String getReplyName() {
		return replyName;
	}

	public void setReplyName(String replyName) {
		this.replyName = replyName;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createTime) {
		this.createdTime = createTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	//重写toString
	@Override
	public String toString() {
		return "forumReplyEntity [replyID=" + replyID + ", replyAvatar=" + replyAvatar + ", replyContent="
				+ replyContent + ", replyTime=" + replyTime + ", replyportID=" + replyportID + ", replyName="
				+ replyName + ", createTime=" + createdTime + ", modifiedTime=" + modifiedTime + "]";
	}
}
