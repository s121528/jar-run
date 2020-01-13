package cn.hacz.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Project -
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
@JobHandler(value = "demoHandler")
@Slf4j
@Component
public class DemoHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        log.info(">>>>>>>>>>> xxl-job开启，任务传入参数：[{}]", param);
        return null;
    }
}
