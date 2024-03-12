package com.zsr.yygh.hosp.controller;

import com.zsr.yygh.common.result.Result;
import com.zsr.yygh.hosp.service.HospitalService;
import com.zsr.yygh.model.hosp.Hospital;
import com.zsr.yygh.vo.hosp.HospitalQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/hosp/hospital")
@Api(value = "hospital-controller")
//@CrossOrigin
public class HospitalController {
    @Autowired
    @Qualifier(value = "hospitalServiceImpl")
    private HospitalService hospitalService;

    //医院列表（条件查询分页）
    @ApiOperation(value = "获取分页列表")
    @GetMapping("list/{page}/{limit}")
    public Result index(@PathVariable Integer page, @PathVariable Integer limit, HospitalQueryVo hospitalQueryVo) {
        Page<Hospital> pageModel = hospitalService.selectPage(page, limit, hospitalQueryVo);
        List<Hospital> content = pageModel.getContent();
        long totalElements = pageModel.getTotalElements();
        return Result.ok(pageModel);
    }
    @ApiOperation(value = "更新上线状态")
    @GetMapping("updateStatus/{id}/{status}")
    public Result lock(@PathVariable("id") String id, @PathVariable("status") Integer status){
        hospitalService.updateStatus(id, status);
        return Result.ok();
    }
    @ApiOperation(value = "获取医院详情")
    @GetMapping("showHospDetail/{id}")
    public Result show(@PathVariable String id) {
        Map<String, Object> map = hospitalService.show(id);
        return Result.ok(map);
    }

}
