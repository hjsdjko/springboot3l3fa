package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianzhuangbaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianzhuangbaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianzhuangbaoxiuView;


/**
 * 充电桩报修
 *
 * @author 
 * @email 
 * @date 2022-03-02 13:45:25
 */
public interface ChongdianzhuangbaoxiuService extends IService<ChongdianzhuangbaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianzhuangbaoxiuVO> selectListVO(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
   	
   	ChongdianzhuangbaoxiuVO selectVO(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
   	
   	List<ChongdianzhuangbaoxiuView> selectListView(Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
   	
   	ChongdianzhuangbaoxiuView selectView(@Param("ew") Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianzhuangbaoxiuEntity> wrapper);
   	

}

