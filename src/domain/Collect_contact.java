package domain;

import java.sql.Timestamp;

public class Collect_contact {
	
	private int id;
	private int uid;
	private Blog blog;
	private int rewardNum;
	private Timestamp time;
	
	
	public Collect_contact(){}
	//创建中间过程的关系，用于插入数据库
	public Collect_contact(int uid,int blog_id)
	{
		this.uid=uid;
		this.blog=new Blog(blog_id); 
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public int getRewardNum() {
		return rewardNum;
	}
	public void setRewardNum(int rewardNum) {
		this.rewardNum = rewardNum;
	}
	
	
}
