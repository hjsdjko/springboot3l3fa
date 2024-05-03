package com.dao;

import com.entity.ChongdianzhuangbaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianzhuangbaoxiuVO;
import com.entity.view.ChongdianzhuangbaoxiuView;


/**
 * 充电桩报修
 * 
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface ChongdianzhuangbaoxiuDao extends BaseMapper<ChongdianzhuangbaoxiuEntity> {
	
	List<ChongdianzhuangbaoxiuVO> selectListVO(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
	
	ChongdianzhuangbaoxiuVO selectVO(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
	
	List<ChongdianzhuangbaoxiuView> selectListView(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);

	List<ChongdianzhuangbaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
	
	ChongdianzhuangbaoxiuView selectView(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
	

}
