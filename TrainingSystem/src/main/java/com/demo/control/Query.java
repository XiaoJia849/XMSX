package com.demo.control;

import com.demo.service.QueryService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Query {
    @Resource
    QueryService queryService;

    @RequestMapping("/query")
    @ResponseBody
    int query(){
        return queryService.getIdSum();
    }

    @RequestMapping("/xx")
    String getAA(){
        return "hh";
    }

    @RequestMapping("/bb")
    String getaa(){
        return "ww";
    }

}

