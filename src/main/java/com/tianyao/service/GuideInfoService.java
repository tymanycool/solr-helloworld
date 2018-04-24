package com.tianyao.service;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.entity.TestEntity;

import java.util.List;


public interface GuideInfoService {

    List<GuideInfoEntity> queryAllGuideInfo();
    List<TestEntity> queryAllTestEntity();

}
