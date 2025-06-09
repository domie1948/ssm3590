package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YujingxiaoxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YujingxiaoxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YujingxiaoxiView;


/**
 * 预警消息
 *
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
public interface YujingxiaoxiService extends IService<YujingxiaoxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YujingxiaoxiVO> selectListVO(Wrapper<YujingxiaoxiEntity> wrapper);
   	
   	YujingxiaoxiVO selectVO(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
   	
   	List<YujingxiaoxiView> selectListView(Wrapper<YujingxiaoxiEntity> wrapper);
   	
   	YujingxiaoxiView selectView(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YujingxiaoxiEntity> wrapper);
   	
}

