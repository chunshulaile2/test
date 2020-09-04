package com.dao;

import java.util.List;
import java.util.Map;

import com.bean.Bbb;

public interface BbbDao {
	//查询所有报班
	List<Map<String, Object>> getBblist();
	//添加报班
	int  addBb(Bbb bbb);
	//模糊查询报班
	List<Map<String, Object>> getBblistDynamic(Bbb bbb);
	//删除报班
	int del(int bbid);
	//修改报班
	int update(Bbb bbb);
	
	int bm(Bbb bbb);
	
	List<Map<String, Object>> bbjl();
	
	

}
