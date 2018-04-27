package com.tianyao.controller;
包头，传销

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.service.GuideInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GuideInfoController {

    @Autowired
    private GuideInfoService guideInfoService;

    @RequestMapping("/serchGuideInfo")
    public String serchGuideInfo(String keywords){

        return keywords;
    }

    @RequestMapping(value = "/importData",method= RequestMethod.GET)
    @ResponseBody
    public String importData(){
        List<GuideInfoEntity> guideInfoEntities = guideInfoService.queryAllGuideInfo();
        System.out.println(guideInfoEntities);
        return "刷新成功！！！";
    }

}
