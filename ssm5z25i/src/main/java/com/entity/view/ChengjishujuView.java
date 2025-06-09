package com.entity.view;

import com.entity.ChengjishujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成绩数据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
@TableName("chengjishuju")
public class ChengjishujuView  extends ChengjishujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengjishujuView(){
	}
 
 	public ChengjishujuView(ChengjishujuEntity chengjishujuEntity){
 	try {
			BeanUtils.copyProperties(this, chengjishujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
