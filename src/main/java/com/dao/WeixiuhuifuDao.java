package com.dao;

import com.entity.WeixiuhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuhuifuVO;
import com.entity.view.WeixiuhuifuView;


/**
 * 维修回复
 * 
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface WeixiuhuifuDao extends BaseMapper<WeixiuhuifuEntity> {
	
	List<WeixiuhuifuVO> selectListVO(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
	
	WeixiuhuifuVO selectVO(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
	
	List<WeixiuhuifuView> selectListView(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);

	List<WeixiuhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
	
	WeixiuhuifuView selectView(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
	

}
