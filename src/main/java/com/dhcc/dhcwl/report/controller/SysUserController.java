package com.dhcc.dhcwl.report.controller;


import com.dhcc.dhcwl.report.common.Result;
import com.dhcc.dhcwl.report.entity.SysUser;
import com.dhcc.dhcwl.report.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author vecny
 * @since 2022-09-18
 */
@RestController
@RequestMapping("/sys-user")
@Api(tags = "用户相关接口")
@Slf4j
public class SysUserController {

    @Resource
    ISysUserService service;

    @ApiOperation("获取所有用户信息")
    @GetMapping("/users")
    @ResponseBody
    public Result findAllUserNew() {
        List<SysUser> list = service.list();

        return Result.ok(list);
    }

    @ApiOperation("获取所有用户信息")
    @GetMapping("/user/{id}")
    public Result findUserById(@PathVariable("id") Integer id) {
        log.info(id.toString());
        return Result.ok(service.getById(id));

    }

    @ApiOperation("获取所有用户信息")
    @GetMapping("/username/")
    public Result findUserById(String username) {

        return Result.ok(username);

    }

    @ApiOperation("获取所有用户信息")
    @GetMapping("/login/")
    public Result findUserById(String username, String password) {
        System.out.println(username + password);
        Assert.notNull(username, "用户名不能为空");
        Assert.notNull(password, "用户名密码不能为空");
        return Result.ok(username + password);

    }
}
