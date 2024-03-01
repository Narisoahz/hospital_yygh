package com.zsr.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsr.yygh.model.cmn.Dict;
import com.zsr.yygh.model.hosp.HospitalSet;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChlidData(Long id);
    //导出
    public void exportData(HttpServletResponse response);
    public void importData(MultipartFile file);
}
