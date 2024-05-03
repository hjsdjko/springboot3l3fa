package com.entity.view;

import com.entity.WeixiuhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@TableName("weixiuhuifu")
public class WeixiuhuifuView  extends WeixiuhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiuhuifuView(){
	}
 
 	public WeixiuhuifuView(WeixiuhuifuEntity weixiuhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, weixiuhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
