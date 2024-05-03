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


import com.dao.ChongdianzhuangbaoxiuDao;
import com.entity.ChongdianzhuangbaoxiuEntity;
import com.service.ChongdianzhuangbaoxiuService;
import com.entity.vo.ChongdianzhuangbaoxiuVO;
import com.entity.view.ChongdianzhuangbaoxiuView;

@Service("chongdianzhuangbaoxiuService")
public class ChongdianzhuangbaoxiuServiceImpl extends ServiceImpl<ChongdianzhuangbaoxiuDao, ChongdianzhuangbaoxiuEntity> implements ChongdianzhuangbaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianzhuangbaoxiuEntity> page = this.selectPage(
                new Query<ChongdianzhuangbaoxiuEntity>(params).getPage(),
                new EntityWrapper<ChongdianzhuangbaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianzhuangbaoxiuEntity> wrapper) {
		  Page<ChongdianzhuangbaoxiuView> page =new Query<ChongdianzhuangbaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongdianzhuangbaoxiuVO> selectListVO(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianzhuangbaoxiuVO selectVO(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianzhuangbaoxiuView> selectListView(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianzhuangbaoxiuView selectView(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
