package com.js.controller.program;

import com.js.common.annotation.Log;
import com.js.common.enums.StatusCode;
import com.js.common.exception.SystemException;
import com.js.common.response.BaseResponse;
import com.js.service.program.ProgramDateService;
import com.js.vo.program.DefaultProgramDateVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 姜爽
 * @Description: 播放节目时间范围
 * @Date: 2020/5/9 11:31
 */
@RestController
@RequestMapping("/program/data")
@Api("播放节目时间范围")
@Slf4j
public class ProgramDateController {
    @Autowired
    private ProgramDateService programDateService;

    @GetMapping("getList")
    @ApiOperation(value = "播放节目时间范围", notes = "播放节目时间范围")
    @Log(value = "查询播放节目的时间范围")
    public BaseResponse<List<DefaultProgramDateVo>> getDateList() {
        List<DefaultProgramDateVo> defaultProgramDateVos = new ArrayList<>();
        try {
            defaultProgramDateVos = programDateService.getDefaultProgramDate();
        } catch (Exception e) {
            log.info("查询出现的异常为{}", e);
            throw new SystemException("查询失败");
        }
        return new BaseResponse<>(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMsg(), defaultProgramDateVos);
    }

    @GetMapping("getData")
    @ApiOperation(value = "根据编码查询详细时间", notes = "根据编码查询详细时间")
    @Log(value = "根据编码查询详细时间")
    public BaseResponse<DefaultProgramDateVo> getDateByCode(@RequestParam("code") String code) {
        DefaultProgramDateVo defaultProgramDateVo = null;
        try {
            defaultProgramDateVo = programDateService.getDefaultProgramDateByCode(code);
        } catch (Exception e) {
            log.info("查询出现的异常为{}", e);
            throw new SystemException("查询失败");
        }
        if (defaultProgramDateVo != null) {
            return new BaseResponse<>(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMsg(), defaultProgramDateVo);
        } else {
            return new BaseResponse<>(StatusCode.FAIL.getCode(), StatusCode.FAIL.getMsg());
        }
    }

}
