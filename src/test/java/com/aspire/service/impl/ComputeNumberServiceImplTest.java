package com.aspire.service.impl;

import com.aspire.service.ComputeNumberService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FileName: ComputeNumberServiceImplTest
 * Author:   fengsulin
 * Date:     2022/5/22 17:47
 * Description:
 */
public class ComputeNumberServiceImplTest {

    private ComputeNumberService computeNumberService = new ComputeNumberServiceImpl();
    @Test
    public void addNum() {
        double v = computeNumberService.addNum(2, 5);
        assertEquals(7,v,0);
    }

    @Test
    public void subNum() {
        double v = computeNumberService.subNum(2, 5);
        assertEquals(3,v,0);

    }

    @Test
    public void mulNum() {
        double v = computeNumberService.mulNum(2, 5);
        assertEquals(3,v,0);
    }

    @Test
    public void divNum() {
        double v = computeNumberService.divNum(2, 5);
        assertEquals(3,v,0);

    }

//    @Test
//    public void divNum1(){
//        double v = computeNumberService.divNum(2, 0);
//        assertEquals(3,v,0);
//
//    }
}