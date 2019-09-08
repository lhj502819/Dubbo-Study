package dubbo.test.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.test.provider.DubboProviderService;
import org.springframework.stereotype.Component;

/**
 * @author
 * @create date
 * @description
 * @date
 */
@Service
@Component
public class DubboProviderServiceImpl implements DubboProviderService {

    public String sayHelloToWho(String name) {

        return "provider say hello to"+name;

    }
}
