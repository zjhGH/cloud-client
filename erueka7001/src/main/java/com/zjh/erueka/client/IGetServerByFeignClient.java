package com.zjh.erueka.client;

import com.zjh.erueka.client.hystrix.FeignFallback;
import com.zjh.erueka.client.hystrix.FeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zjh
 * @date: 2024/2/29
 */
// 或 @FeignClient(name = "eureke-server", fallbackFactory = FeignFallbackFactory.class)
@FeignClient(value = "eureke-server-6003", fallback = FeignFallback.class)
public interface IGetServerByFeignClient {

    @GetMapping("/erueka/server/test/get")
    String get(@RequestParam(required = false) Object param1,
               @RequestParam(required = false) Object param2);
}
