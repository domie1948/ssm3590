package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjishujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjishujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjishujuView;


/**
 * 成绩数据
 *
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
public interface ChengjishujuService extends IService<ChengjishujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjishujuVO> selectListVO(Wrapper<ChengjishujuEntity> wrapper);
   	
   	ChengjishujuVO selectVO(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
   	
   	List<ChengjishujuView> selectListView(Wrapper<ChengjishujuEntity> wrapper);
   	
   	ChengjishujuView selectView(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjishujuEntity> wrapper);
   	
}

