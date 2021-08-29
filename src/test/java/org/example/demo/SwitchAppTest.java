package org.example.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description
 * @Date 2021-08-28 15:18
 * @Created by wuyuyan
 */
public class SwitchAppTest {

    @Test
    public void testDirection(){
        SwitchApp app = new SwitchApp();
        Assert.assertEquals("上",app.direction("up"));
        Assert.assertEquals("下",app.direction("down"));

    }
}
