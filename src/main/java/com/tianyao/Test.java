package com.tianyao;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.service.GuideInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test{
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        GuideInfoService guideInfoService = (GuideInfoService) ioc.getBean("guideInfoService");
        System.out.println(guideInfoService);
        //List<TestEntity> testEntities = guideInfoService.queryAllTestEntity();
        //System.out.println(testEntities);
        List<GuideInfoEntity> testEntities = guideInfoService.queryAllGuideInfo();
        System.out.println(testEntities);

    }
}
