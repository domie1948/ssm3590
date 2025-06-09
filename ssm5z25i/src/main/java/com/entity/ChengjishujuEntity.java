package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 成绩数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
@TableName("chengjishuju")
public class ChengjishujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengjishujuEntity() {
		
	}
	
	public ChengjishujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学年学期
	 */
					
	private String xuenianxueqi;
	
	/**
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 课程性质
	 */
					
	private String kechengxingzhi;
	
	/**
	 * 学分
	 */
					
	private Float xuefen;
	
	/**
	 * 成绩
	 */
					
	private Float chengji;
	
	/**
	 * 成绩备注
	 */
					
	private String chengjibeizhu;
	
	/**
	 * 所得绩点
	 */
					
	private Float suodejidian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学年学期
	 */
	public void setXuenianxueqi(String xuenianxueqi) {
		this.xuenianxueqi = xuenianxueqi;
	}
	/**
	 * 获取：学年学期
	 */
	public String getXuenianxueqi() {
		return xuenianxueqi;
	}
	/**
	 * 设置：课程编号
	 */
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：课程性质
	 */
	public void setKechengxingzhi(String kechengxingzhi) {
		this.kechengxingzhi = kechengxingzhi;
	}
	/**
	 * 获取：课程性质
	 */
	public String getKechengxingzhi() {
		return kechengxingzhi;
	}
	/**
	 * 设置：学分
	 */
	public void setXuefen(Float xuefen) {
		this.xuefen = xuefen;
	}
	/**
	 * 获取：学分
	 */
	public Float getXuefen() {
		return xuefen;
	}
	/**
	 * 设置：成绩
	 */
	public void setChengji(Float chengji) {
		this.chengji = chengji;
	}
	/**
	 * 获取：成绩
	 */
	public Float getChengji() {
		return chengji;
	}
	/**
	 * 设置：成绩备注
	 */
	public void setChengjibeizhu(String chengjibeizhu) {
		this.chengjibeizhu = chengjibeizhu;
	}
	/**
	 * 获取：成绩备注
	 */
	public String getChengjibeizhu() {
		return chengjibeizhu;
	}
	/**
	 * 设置：所得绩点
	 */
	public void setSuodejidian(Float suodejidian) {
		this.suodejidian = suodejidian;
	}
	/**
	 * 获取：所得绩点
	 */
	public Float getSuodejidian() {
		return suodejidian;
	}
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

}
