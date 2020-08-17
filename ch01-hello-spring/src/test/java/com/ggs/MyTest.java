package com.ggs;

import com.ggs.service.SomeService;
import com.ggs.service.impl.SomeServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
}
