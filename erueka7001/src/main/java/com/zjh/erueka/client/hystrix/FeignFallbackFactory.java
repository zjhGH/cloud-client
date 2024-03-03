package com.zjh.erueka.client.hystrix;

import com.zjh.erueka.client.IGetServerByFeignClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author: zjh
 * @date: 2024/2/29
 */
@Component
public class FeignFallbackFactory implements FallbackFactory<IGetServerByFeignClient> {

    @Override
    public IGetServerByFeignClient create(Throwable cause) {
        return (param1, param2) -> "请求失败！！！";
    }
}
