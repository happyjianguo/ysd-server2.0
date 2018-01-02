package spring;

import com.ysd.task.TaskApp;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * xishengchun
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TaskApp.class)
// 注释标签是表明此测试类的事务启用，这样所有的测试方案都会自动的 rollback，
// 即您不用自己清除自己所做的任何对数据库的变更了
@Transactional
public class AbstractTest {
}
