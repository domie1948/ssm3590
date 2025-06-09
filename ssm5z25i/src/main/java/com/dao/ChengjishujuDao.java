package com.dao;

import com.entity.ChengjishujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjishujuVO;
import com.entity.view.ChengjishujuView;


/**
 * 成绩数据
 * 
 * @author 
 * @email 
 * @date 2021-05-03 17:08:20
 */
public interface ChengjishujuDao extends BaseMapper<ChengjishujuEntity> {
	
	List<ChengjishujuVO> selectListVO(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
	
	ChengjishujuVO selectVO(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
	
	List<ChengjishujuView> selectListView(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);

	List<ChengjishujuView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
	
	ChengjishujuView selectView(@Param("ew") Wrapper<ChengjishujuEntity> wrapper);
	
}
