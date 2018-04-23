package com.tianyao.mapper;

import com.tianyao.entity.GuideInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;


public interface GuideInfoMapper {
    List<GuideInfoEntity> selectAllGuideInfo();
}
