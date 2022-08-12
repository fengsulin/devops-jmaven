package com.aspire.service.impl;

import com.aspire.service.ComputeNumberService;

/**
 * FileName: ComputeNumberServiceImpl
 * Author:   fengsulin
 * Date:     2022/5/22 17:44
 * Description: 四则运算业务实现类
 */
public class ComputeNumberServiceImpl implements ComputeNumberService {
    @Override
    public double addNum(double a, double b) {
        return a + b;
    }

    @Override
    public double subNum(double a, double b) {
        return a - b;
    }

    @Override
    public double mulNum(double a, double b) {
        return a * b;
    }

    @Override
    public double divNum(double a, double b) {
        if(b == 0){
            return a;
        }
        return a / b;
    }
}
