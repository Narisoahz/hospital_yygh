package com.zsr.yygh.common.exception;

import com.zsr.yygh.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * 自定义异常处理方法
     * @param e
     * @return
     */
    @ExceptionHandler(YyghException.class)
    @ResponseBody
    public Result error(YyghException e){
        return Result.build(e.getCode(), e.getMessage());
    }
}
