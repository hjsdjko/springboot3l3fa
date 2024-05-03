package com.entity.view;

import com.entity.DianzhuangleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电桩类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@TableName("dianzhuangleibie")
public class DianzhuangleibieView  extends DianzhuangleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianzhuangleibieView(){
	}
 
 	public DianzhuangleibieView(DianzhuangleibieEntity dianzhuangleibieEntity){
 	try {
			BeanUtils.copyProperties(this, dianzhuangleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
