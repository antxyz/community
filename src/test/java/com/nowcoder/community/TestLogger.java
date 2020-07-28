package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestLogger {

    private static final Logger logger = LoggerFactory.getLogger(TestLogger.class);

    @Test
    public void logger(){
        logger.trace("logger.trace");
        logger.debug("logger debug");
        logger.info("logger info");
        logger.warn("logger warn");
        logger.error("logger error");
    }
}
