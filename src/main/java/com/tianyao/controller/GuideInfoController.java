package com.tianyao.controller;
27号，我来到包头，感觉这里像传销，我很纠结……，不知道怎么办，赵珊，我的女朋友……
5.1号，今天有人来讲某平台，越发像传销，地点是包头青山区，北新街，3单元，六楼。
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
