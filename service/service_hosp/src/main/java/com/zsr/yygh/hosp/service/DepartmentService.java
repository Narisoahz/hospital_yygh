package com.zsr.yygh.hosp.service;


import com.zsr.yygh.model.hosp.Department;
import com.zsr.yygh.vo.hosp.DepartmentQueryVo;
import com.zsr.yygh.vo.hosp.DepartmentVo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    void save(Map<String, Object> paramMap);

    Page<Department> selectPage(int page, int limit, DepartmentQueryVo departmentQueryVo);

    void remove(String hoscode, String depcode);

    List<DepartmentVo> findDeptTree(String hoscode);

    Object getDepName(String hoscode, String depcode);
}
