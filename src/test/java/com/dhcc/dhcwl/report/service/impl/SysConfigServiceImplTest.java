package com.dhcc.dhcwl.report.service.impl;

import com.dhcc.dhcwl.report.mapper.SysConfigMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SysConfigServiceImplTest {

    @Resource
    SysConfigMapper sysConfigMapper;

    @Test
    void list() {
//        List<SysConfig> list=sysConfigMapper.selectList(null);
//        list.forEach(System.out::println );
    }
}