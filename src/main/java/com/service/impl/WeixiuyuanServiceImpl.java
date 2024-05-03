package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeixiuyuanDao;
import com.entity.WeixiuyuanEntity;
import com.service.WeixiuyuanService;
import com.entity.vo.WeixiuyuanVO;
import com.entity.view.WeixiuyuanView;

@Service("weixiuyuanService")
public class WeixiuyuanServiceImpl extends ServiceImpl<WeixiuyuanDao, WeixiuyuanEntity> implements WeixiuyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiuyuanEntity> page = this.selectPage(
                new Query<WeixiuyuanEntity>(params).getPage(),
                new EntityWrapper<WeixiuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiuyuanEntity> wrapper) {
		  Page<WeixiuyuanView> page =new Query<WeixiuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiuyuanVO> selectListVO(Wrapper<WeixiuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiuyuanVO selectVO(Wrapper<WeixiuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiuyuanView> selectListView(Wrapper<WeixiuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiuyuanView selectView(Wrapper<WeixiuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
