package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengjishujuDao;
import com.entity.ChengjishujuEntity;
import com.service.ChengjishujuService;
import com.entity.vo.ChengjishujuVO;
import com.entity.view.ChengjishujuView;

@Service("chengjishujuService")
public class ChengjishujuServiceImpl extends ServiceImpl<ChengjishujuDao, ChengjishujuEntity> implements ChengjishujuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjishujuEntity> page = this.selectPage(
                new Query<ChengjishujuEntity>(params).getPage(),
                new EntityWrapper<ChengjishujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjishujuEntity> wrapper) {
		  Page<ChengjishujuView> page =new Query<ChengjishujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjishujuVO> selectListVO(Wrapper<ChengjishujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjishujuVO selectVO(Wrapper<ChengjishujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjishujuView> selectListView(Wrapper<ChengjishujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjishujuView selectView(Wrapper<ChengjishujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
