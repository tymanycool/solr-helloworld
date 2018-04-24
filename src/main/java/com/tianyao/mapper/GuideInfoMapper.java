package com.tianyao.mapper;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.entity.TestEntity;

import java.util.List;


public interface GuideInfoMapper {
    List<GuideInfoEntity> selectAllGuideInfo();
    List<TestEntity> selectAllTestEntity();
}
