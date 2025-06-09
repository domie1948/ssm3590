package com.entity.view;

import com.entity.YujingxiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预警消息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
@TableName("yujingxiaoxi")
public class YujingxiaoxiView  extends YujingxiaoxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YujingxiaoxiView(){
	}
 
 	public YujingxiaoxiView(YujingxiaoxiEntity yujingxiaoxiEntity){
 	try {
			BeanUtils.copyProperties(this, yujingxiaoxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
