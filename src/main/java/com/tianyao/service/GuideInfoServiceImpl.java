package com.tianyao.service;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.mapper.GuideInfoMapper;
import com.tianyao.service.GuideInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideInfoServiceImpl implements GuideInfoService {

    @Autowired
    private GuideInfoMapper guideInfoMapper;

    @Override
    public List<GuideInfoEntity> queryAllGuideInfo() {

        return guideInfoMapper.selectAllGuideInfo();
    }
}
