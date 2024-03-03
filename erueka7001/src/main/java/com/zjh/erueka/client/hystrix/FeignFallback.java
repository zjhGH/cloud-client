package com.zjh.erueka.client.hystrix;

import com.zjh.erueka.client.IGetServerByFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: zjh
 * @date: 2024/2/29
 */
@Component
public class FeignFallback implements IGetServerByFeignClient {

    @Override
    public String get(Object param1, Object param2) {
        return "请求失败！！！";
    }
}
