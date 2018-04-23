package com.tianyao.service;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.mapper.GuideInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GuideInfoService {

    List<GuideInfoEntity> queryAllGuideInfo();

}
