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


import com.dao.DianzhuangleibieDao;
import com.entity.DianzhuangleibieEntity;
import com.service.DianzhuangleibieService;
import com.entity.vo.DianzhuangleibieVO;
import com.entity.view.DianzhuangleibieView;

@Service("dianzhuangleibieService")
public class DianzhuangleibieServiceImpl extends ServiceImpl<DianzhuangleibieDao, DianzhuangleibieEntity> implements DianzhuangleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzhuangleibieEntity> page = this.selectPage(
                new Query<DianzhuangleibieEntity>(params).getPage(),
                new EntityWrapper<DianzhuangleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzhuangleibieEntity> wrapper) {
		  Page<DianzhuangleibieView> page =new Query<DianzhuangleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzhuangleibieVO> selectListVO(Wrapper<DianzhuangleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzhuangleibieVO selectVO(Wrapper<DianzhuangleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzhuangleibieView> selectListView(Wrapper<DianzhuangleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzhuangleibieView selectView(Wrapper<DianzhuangleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
