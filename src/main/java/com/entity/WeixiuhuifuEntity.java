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
 * 维修回复
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@TableName("weixiuhuifu")
public class WeixiuhuifuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiuhuifuEntity() {
		
	}
	
	public WeixiuhuifuEntity(T t) {
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
	 * 电桩编号
	 */
					
	private String dianzhuangbianhao;
	
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
	 * 设置：电桩编号
	 */
	public void setDianzhuangbianhao(String dianzhuangbianhao) {
		this.dianzhuangbianhao = dianzhuangbianhao;
	}
	/**
	 * 获取：电桩编号
	 */
	public String getDianzhuangbianhao() {
		return dianzhuangbianhao;
	}
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
