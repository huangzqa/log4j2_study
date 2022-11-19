package com.huangzq;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTest {
    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(MyTest.class);
        logger.debug("log4j2 success ===== debug");
        logger.info("log4j2 success ===== info");
        logger.warn("log4j2 success ===== warn");
        logger.error(" ===== error");
    }
}
