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


import com.dao.YujingxiaoxiDao;
import com.entity.YujingxiaoxiEntity;
import com.service.YujingxiaoxiService;
import com.entity.vo.YujingxiaoxiVO;
import com.entity.view.YujingxiaoxiView;

@Service("yujingxiaoxiService")
public class YujingxiaoxiServiceImpl extends ServiceImpl<YujingxiaoxiDao, YujingxiaoxiEntity> implements YujingxiaoxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YujingxiaoxiEntity> page = this.selectPage(
                new Query<YujingxiaoxiEntity>(params).getPage(),
                new EntityWrapper<YujingxiaoxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YujingxiaoxiEntity> wrapper) {
		  Page<YujingxiaoxiView> page =new Query<YujingxiaoxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YujingxiaoxiVO> selectListVO(Wrapper<YujingxiaoxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YujingxiaoxiVO selectVO(Wrapper<YujingxiaoxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YujingxiaoxiView> selectListView(Wrapper<YujingxiaoxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YujingxiaoxiView selectView(Wrapper<YujingxiaoxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
