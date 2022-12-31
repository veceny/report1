package com.dhcc.dhcwl.report.controller;


import com.dhcc.dhcwl.report.common.Result;
import com.dhcc.dhcwl.report.service.ISysConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 系统配置表 前端控制器
 * </p>
 *
 * @author vecny
 * @since 2022-09-18
 */
@RestController
@RequestMapping("/sysconfig")
@Api(tags = "系统配置控制")
public class SysConfigController {
    @Resource
    ISysConfigService configService;

    @RequestMapping("/list")
    @ApiOperation("列表")
    Result getList() {
        return Result.ok(configService.list());
    }

    @RequestMapping("/listALL")
    @ApiOperation("列表")
    Result getListAll() {
        return Result.ok("OK");
    }

}
