package cf.binzikeji.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public void test() {
        logger.info("test");
    }
}
