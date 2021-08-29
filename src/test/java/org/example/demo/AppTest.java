package org.example.demo;


import org.example.demo.App;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testScore(){
        App app = new App();
//        测试大于90分的是优秀
        Assert.assertEquals("优秀",app.score(99));
        Assert.assertEquals("良好",app.score(89));
        Assert.assertEquals("一般",app.score(79));
        Assert.assertEquals("及格",app.score(69));
        Assert.assertEquals("不及格",app.score(59));

    }
}
