package com.tianyao.service.impl;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.entity.TestEntity;
import com.tianyao.dao.GuideInfoMapper;
import com.tianyao.service.GuideInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideInfoServiceImpl implements GuideInfoService {

    @Autowired
    private GuideInfoMapper guideInfoMapper;

    @Override
    public List<GuideInfoEntity> queryAllGuideInfo() {
        return null;
        //return guideInfoMapper.selectAllGuideInfo();
    }

    @Override
    public List<TestEntity> queryAllTestEntity() {
        return guideInfoMapper.selectAllTestEntity();
    }
}
