package com.dao;

import com.entity.DianzhuangleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzhuangleibieVO;
import com.entity.view.DianzhuangleibieView;


/**
 * 电桩类别
 * 
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface DianzhuangleibieDao extends BaseMapper<DianzhuangleibieEntity> {
	
	List<DianzhuangleibieVO> selectListVO(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
	
	DianzhuangleibieVO selectVO(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
	
	List<DianzhuangleibieView> selectListView(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);

	List<DianzhuangleibieView> selectListView(Pagination page,@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
	
	DianzhuangleibieView selectView(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
	

}
