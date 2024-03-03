package com.zjh.erueka.controller;

import com.zjh.erueka.config.RestTemplateConfig;
import com.zjh.erueka.util.wrapper.ReturnWrapMapper;
import com.zjh.erueka.util.wrapper.ReturnWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zjh
 * @date: 2024/2/28
 */
@Api(tags = {"客户端测试服务"})
@RestController
@RequestMapping("/erueka/client/test")
public class TestController {

    @Autowired
    private RestTemplateConfig restTemplate;

    @ApiOperation("测获取服务6001")
    @GetMapping("/get")
    public ReturnWrapper<String> get(@ApiParam("参数1") @RequestParam(required = false) Object param1,
                                         @ApiParam("参数2") @RequestParam(required = false) Object param2) {
        RestTemplate restTemplate = this.restTemplate.restTemplate();
        String result = restTemplate.getForObject(
                "http://eureke-server/erueka/server/test/get?param1=" + param1 + "&param2=" + param2,
                String.class
        );
        return ReturnWrapMapper.ok(result);
    }
}
