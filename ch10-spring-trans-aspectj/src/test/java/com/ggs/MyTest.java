package com.ggs;

import com.ggs.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取service
        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");
        //com.sun.proxy.$Proxy12
        System.out.println("service是代理：" + service.getClass().getName());
        //调用方法
        service.buy(1001, 10);
    }
}