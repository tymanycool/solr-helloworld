package com.tianyao.controller;

import com.tianyao.entity.GuideInfoEntity;
import com.tianyao.service.GuideInfoService;
import com.tianyao.util.MyPropertiesUtil;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class GuideInfoController {

    @Autowired
    private GuideInfoService guideInfoService;

    @RequestMapping("/serchGuideInfo")
    public String serchGuideInfo(String keywords) {

        return keywords;
    }

    @RequestMapping(value = "importData"/*,produces = "application/json;charset=utf-8"*/, method = RequestMethod.GET)
    @ResponseBody
    public String importData() {
        List<GuideInfoEntity> guideInfoEntities = guideInfoService.queryAllGuideInfo();
        // 获得solr的客户端连接
        HttpSolrServer solr = new HttpSolrServer(MyPropertiesUtil.getMyProperty("mySolr.properties", "solr_url"));
        solr.setParser(new XMLResponseParser());
        solr.setConnectionTimeout(3000);

        try {
            // 先删除原有数据
            solr.deleteByQuery("*:*");
            // 向solr导入数据
            solr.addBeans(guideInfoEntities);
            solr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return "导入失败！！！";
        }

        System.out.println(guideInfoEntities);
        return "导入成功！！！";
    }

}
