package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuhuifuView;


/**
 * 维修回复
 *
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface WeixiuhuifuService extends IService<WeixiuhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuhuifuVO> selectListVO(Wrapper<WeixiuhuifuEntity> wrapper);
   	
   	WeixiuhuifuVO selectVO(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
   	
   	List<WeixiuhuifuView> selectListView(Wrapper<WeixiuhuifuEntity> wrapper);
   	
   	WeixiuhuifuView selectView(@Param("ew") Wrapper<WeixiuhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuhuifuEntity> wrapper);
   	

}

