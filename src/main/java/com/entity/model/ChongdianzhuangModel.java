package com.entity.model;

import com.entity.ChongdianzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 充电桩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public class ChongdianzhuangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电桩类别
	 */
	
	private String dianzhuangleibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 输入电压
	 */
	
	private String shurudianya;
		
	/**
	 * 输出功率
	 */
	
	private String shuchugonglv;
		
	/**
	 * 使用方式
	 */
	
	private String shiyongfangshi;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 所处位置
	 */
	
	private String suochuweizhi;
		
	/**
	 * 每时单价
	 */
	
	private Float meishidanjia;
				
	
	/**
	 * 设置：电桩类别
	 */
	 
	public void setDianzhuangleibie(String dianzhuangleibie) {
		this.dianzhuangleibie = dianzhuangleibie;
	}
	
	/**
	 * 获取：电桩类别
	 */
	public String getDianzhuangleibie() {
		return dianzhuangleibie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：输入电压
	 */
	 
	public void setShurudianya(String shurudianya) {
		this.shurudianya = shurudianya;
	}
	
	/**
	 * 获取：输入电压
	 */
	public String getShurudianya() {
		return shurudianya;
	}
				
	
	/**
	 * 设置：输出功率
	 */
	 
	public void setShuchugonglv(String shuchugonglv) {
		this.shuchugonglv = shuchugonglv;
	}
	
	/**
	 * 获取：输出功率
	 */
	public String getShuchugonglv() {
		return shuchugonglv;
	}
				
	
	/**
	 * 设置：使用方式
	 */
	 
	public void setShiyongfangshi(String shiyongfangshi) {
		this.shiyongfangshi = shiyongfangshi;
	}
	
	/**
	 * 获取：使用方式
	 */
	public String getShiyongfangshi() {
		return shiyongfangshi;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：所处位置
	 */
	 
	public void setSuochuweizhi(String suochuweizhi) {
		this.suochuweizhi = suochuweizhi;
	}
	
	/**
	 * 获取：所处位置
	 */
	public String getSuochuweizhi() {
		return suochuweizhi;
	}
				
	
	/**
	 * 设置：每时单价
	 */
	 
	public void setMeishidanjia(Float meishidanjia) {
		this.meishidanjia = meishidanjia;
	}
	
	/**
	 * 获取：每时单价
	 */
	public Float getMeishidanjia() {
		return meishidanjia;
	}
			
}
