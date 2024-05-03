package com.entity.vo;

import com.entity.WeixiuhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public class WeixiuhuifuVO  implements Serializable {
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
	 * 所处位置
	 */
	
	private String suochuweizhi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 维修工号
	 */
	
	private String weixiugonghao;
		
	/**
	 * 维修姓名
	 */
	
	private String weixiuxingming;
		
	/**
	 * 维修状态
	 */
	
	private String weixiuzhuangtai;
		
	/**
	 * 维修登记
	 */
	
	private String weixiudengji;
				
	
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：维修工号
	 */
	 
	public void setWeixiugonghao(String weixiugonghao) {
		this.weixiugonghao = weixiugonghao;
	}
	
	/**
	 * 获取：维修工号
	 */
	public String getWeixiugonghao() {
		return weixiugonghao;
	}
				
	
	/**
	 * 设置：维修姓名
	 */
	 
	public void setWeixiuxingming(String weixiuxingming) {
		this.weixiuxingming = weixiuxingming;
	}
	
	/**
	 * 获取：维修姓名
	 */
	public String getWeixiuxingming() {
		return weixiuxingming;
	}
				
	
	/**
	 * 设置：维修状态
	 */
	 
	public void setWeixiuzhuangtai(String weixiuzhuangtai) {
		this.weixiuzhuangtai = weixiuzhuangtai;
	}
	
	/**
	 * 获取：维修状态
	 */
	public String getWeixiuzhuangtai() {
		return weixiuzhuangtai;
	}
				
	
	/**
	 * 设置：维修登记
	 */
	 
	public void setWeixiudengji(String weixiudengji) {
		this.weixiudengji = weixiudengji;
	}
	
	/**
	 * 获取：维修登记
	 */
	public String getWeixiudengji() {
		return weixiudengji;
	}
			
}
