package com.entity.view;

import com.entity.ChongdianzhuangbaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 充电桩报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@TableName("chongdianzhuangbaoxiu")
public class ChongdianzhuangbaoxiuView  extends ChongdianzhuangbaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongdianzhuangbaoxiuView(){
	}
 
 	public ChongdianzhuangbaoxiuView(ChongdianzhuangbaoxiuEntity chongdianzhuangbaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, chongdianzhuangbaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
