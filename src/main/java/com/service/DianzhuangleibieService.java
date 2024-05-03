package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzhuangleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzhuangleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzhuangleibieView;


/**
 * 电桩类别
 *
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface DianzhuangleibieService extends IService<DianzhuangleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzhuangleibieVO> selectListVO(Wrapper<DianzhuangleibieEntity> wrapper);
   	
   	DianzhuangleibieVO selectVO(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
   	
   	List<DianzhuangleibieView> selectListView(Wrapper<DianzhuangleibieEntity> wrapper);
   	
   	DianzhuangleibieView selectView(@Param("ew") Wrapper<DianzhuangleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzhuangleibieEntity> wrapper);
   	

}

