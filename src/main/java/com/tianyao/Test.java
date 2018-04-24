package com.tianyao;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.entity.TestEntity;
import com.tianyao.service.GuideInfoService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test{
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:beans.xml");
        GuideInfoService guideInfoService = (GuideInfoService) ioc.getBean("guideInfoService");
        System.out.println(guideInfoService);
        MapperScannerConfigurer mapperScannerConfigurer = (MapperScannerConfigurer)ioc.getBean("mapperScannerConfigurer");
        System.out.println(mapperScannerConfigurer);
        List<TestEntity> testEntities = guideInfoService.queryAllTestEntity();
        System.out.println(testEntities);

    }
}
