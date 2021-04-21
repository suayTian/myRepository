package com.tian.springcloud.fallback;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tian.springcloud.client.ConsumerClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ConsumerClientFallBackFactory implements FallbackFactory {
    @Override
    public ConsumerClient create(Throwable throwable) {
        return new ConsumerClient() {
            @Override
            public List<Map<String, Object>> getList() {
                return Lists.newArrayList();
            }

            @Override
            public Map<String, Object> getById(String id) {
                Map<String, Object> map = Maps.newHashMap();
                try {
                    throw new BusinessException("this is consumer client server hystrix ~");
                } catch (BusinessException e) {
                    map.put("name", "this is consumer client server hystrix ~");
                }
                return map;
            }
        };
    }
}
