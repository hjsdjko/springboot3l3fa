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
 * 充电桩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@TableName("chongdianzhuang")
public class ChongdianzhuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongdianzhuangEntity() {
		
	}
	
	public ChongdianzhuangEntity(T t) {
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
