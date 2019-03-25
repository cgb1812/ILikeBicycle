package com.bb.common.vo;

import java.util.List;

import com.bb.sys.entity.Forum;
/**封装当前页数据及分页信息*/
public class PageObject {
	/**当前页的记录*/
	private List<Forum> records;
	/**总页数*/
	private int pageCount;
	/**总记录数*/
	private int rowCount;
	/**当前页页码*/
	private int pageCurrent;

	public List<Forum> getRecords() {
		return records;
	}

	public void setRecords(List<Forum> records) {
		this.records = records;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	@Override
	public String toString() {
		return "PageObject [records=" + records + ", pageCount=" + pageCount + ", rowCount=" + rowCount
				+ ", pageCurrent=" + pageCurrent + "]";
	}
}
