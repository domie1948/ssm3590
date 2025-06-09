package com.entity.vo;

import com.entity.YujingxiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 预警消息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
public class YujingxiaoxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学院班级
	 */
	
	private String xueyuanbanji;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 所在学院
	 */
	
	private String suozaixueyuan;
		
	/**
	 * 备注消息
	 */
	
	private String beizhuxiaoxi;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：学院班级
	 */
	 
	public void setXueyuanbanji(String xueyuanbanji) {
		this.xueyuanbanji = xueyuanbanji;
	}
	
	/**
	 * 获取：学院班级
	 */
	public String getXueyuanbanji() {
		return xueyuanbanji;
	}
				
	
	/**
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：所在学院
	 */
	 
	public void setSuozaixueyuan(String suozaixueyuan) {
		this.suozaixueyuan = suozaixueyuan;
	}
	
	/**
	 * 获取：所在学院
	 */
	public String getSuozaixueyuan() {
		return suozaixueyuan;
	}
				
	
	/**
	 * 设置：备注消息
	 */
	 
	public void setBeizhuxiaoxi(String beizhuxiaoxi) {
		this.beizhuxiaoxi = beizhuxiaoxi;
	}
	
	/**
	 * 获取：备注消息
	 */
	public String getBeizhuxiaoxi() {
		return beizhuxiaoxi;
	}
			
}
