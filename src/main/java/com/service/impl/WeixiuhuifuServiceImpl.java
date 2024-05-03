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


import com.dao.WeixiuhuifuDao;
import com.entity.WeixiuhuifuEntity;
import com.service.WeixiuhuifuService;
import com.entity.vo.WeixiuhuifuVO;
import com.entity.view.WeixiuhuifuView;

@Service("weixiuhuifuService")
public class WeixiuhuifuServiceImpl extends ServiceImpl<WeixiuhuifuDao, WeixiuhuifuEntity> implements WeixiuhuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiuhuifuEntity> page = this.selectPage(
                new Query<WeixiuhuifuEntity>(params).getPage(),
                new EntityWrapper<WeixiuhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiuhuifuEntity> wrapper) {
		  Page<WeixiuhuifuView> page =new Query<WeixiuhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiuhuifuVO> selectListVO(Wrapper<WeixiuhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiuhuifuVO selectVO(Wrapper<WeixiuhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiuhuifuView> selectListView(Wrapper<WeixiuhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiuhuifuView selectView(Wrapper<WeixiuhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
