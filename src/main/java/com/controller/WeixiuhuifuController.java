package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WeixiuhuifuEntity;
import com.entity.view.WeixiuhuifuView;

import com.service.WeixiuhuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 维修回复
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
@RestController
@RequestMapping("/weixiuhuifu")
public class WeixiuhuifuController {
    @Autowired
    private WeixiuhuifuService weixiuhuifuService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeixiuhuifuEntity weixiuhuifu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			weixiuhuifu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiuyuan")) {
			weixiuhuifu.setWeixiugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeixiuhuifuEntity> ew = new EntityWrapper<WeixiuhuifuEntity>();
		PageUtils page = weixiuhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuhuifu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeixiuhuifuEntity weixiuhuifu, 
		HttpServletRequest request){
        EntityWrapper<WeixiuhuifuEntity> ew = new EntityWrapper<WeixiuhuifuEntity>();
		PageUtils page = weixiuhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuhuifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeixiuhuifuEntity weixiuhuifu){
       	EntityWrapper<WeixiuhuifuEntity> ew = new EntityWrapper<WeixiuhuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weixiuhuifu, "weixiuhuifu")); 
        return R.ok().put("data", weixiuhuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeixiuhuifuEntity weixiuhuifu){
        EntityWrapper< WeixiuhuifuEntity> ew = new EntityWrapper< WeixiuhuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weixiuhuifu, "weixiuhuifu")); 
		WeixiuhuifuView weixiuhuifuView =  weixiuhuifuService.selectView(ew);
		return R.ok("查询维修回复成功").put("data", weixiuhuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeixiuhuifuEntity weixiuhuifu = weixiuhuifuService.selectById(id);
        return R.ok().put("data", weixiuhuifu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeixiuhuifuEntity weixiuhuifu = weixiuhuifuService.selectById(id);
        return R.ok().put("data", weixiuhuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeixiuhuifuEntity weixiuhuifu, HttpServletRequest request){
    	weixiuhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weixiuhuifu);
        weixiuhuifuService.insert(weixiuhuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody WeixiuhuifuEntity weixiuhuifu, HttpServletRequest request){
    	weixiuhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weixiuhuifu);
        weixiuhuifuService.insert(weixiuhuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WeixiuhuifuEntity weixiuhuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weixiuhuifu);
        weixiuhuifuService.updateById(weixiuhuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weixiuhuifuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WeixiuhuifuEntity> wrapper = new EntityWrapper<WeixiuhuifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiuyuan")) {
			wrapper.eq("weixiugonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = weixiuhuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
