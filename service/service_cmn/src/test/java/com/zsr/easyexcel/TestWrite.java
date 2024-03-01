package com.zsr.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args) {
//        构建list
        List<UserData> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            UserData userData = new UserData();
            userData.setUid(i);
            userData.setUsername("lucy"+i);
            list.add(userData);
        }
        //设置excel文件路径和文件名称
        String fileName = "D:\\excel\\01.xlsx";

        //调用方法实现写操作
        EasyExcel.write(fileName, UserData.class).sheet("用户信息").doWrite(list);

    }
}
