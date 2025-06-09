package com.dao;

import com.entity.YujingxiaoxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YujingxiaoxiVO;
import com.entity.view.YujingxiaoxiView;


/**
 * 预警消息
 * 
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
public interface YujingxiaoxiDao extends BaseMapper<YujingxiaoxiEntity> {
	
	List<YujingxiaoxiVO> selectListVO(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
	
	YujingxiaoxiVO selectVO(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
	
	List<YujingxiaoxiView> selectListView(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);

	List<YujingxiaoxiView> selectListView(Pagination page,@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
	
	YujingxiaoxiView selectView(@Param("ew") Wrapper<YujingxiaoxiEntity> wrapper);
	
}
