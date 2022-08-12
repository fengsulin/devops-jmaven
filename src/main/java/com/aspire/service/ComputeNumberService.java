package com.aspire.service;

/**
 * FileName: ComputeNumber
 * Author:   fengsulin
 * Date:     2022/5/22 17:34
 * Description: 四则运算业务接口
 */
public interface ComputeNumberService {
    /**加法*/
    public double addNum(double a,double b);

    /**减法*/
    public double subNum(double a,double b);

    /**乘法*/
    public double mulNum(double a,double b);

    /**除法*/
    public double divNum(double a,double b);

}
