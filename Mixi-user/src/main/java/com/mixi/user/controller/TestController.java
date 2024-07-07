package com.mixi.user.controller;

import com.mixi.common.annotation.auth.ApiAuth;
import com.mixi.common.annotation.auth.AuthType;
import io.github.common.web.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 描述: 云接口测试类(不用管)
 * @author suifeng
 * 日期: 2024/7/6
 */
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@ApiAuth(AuthType.NOT)
public class TestController {

    @ApiAuth(AuthType.NEED)
    @PostMapping(value = "/test1")
    public Result test1(){
        return Result.success("test1");
    }

    @PostMapping(value = "/test2")
    public Result test21(){
        return Result.success("test2");
    }

    @PutMapping(value = "/test3")
    public Result test3(){
        return Result.success("test3");
    }

    @ApiAuth(AuthType.INNER)
    @DeleteMapping(value = "/test4")
    public Result test4(){
        return Result.success("test4");
    }
}
