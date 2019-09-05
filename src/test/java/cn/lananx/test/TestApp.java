package cn.lananx.test;
import cn.lananx.app.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestApp {
    @Before
    public void init(){
        System.out.println("开始");
    }
    @Test
    public void testApp(){
        App app =new App();
        String app1 = app.getApp();
        System.out.println(app1);
    }
    @After
    public void end(){
        System.out.println("结束");
    }
}
