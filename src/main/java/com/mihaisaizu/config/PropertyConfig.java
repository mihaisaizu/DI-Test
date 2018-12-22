package com.mihaisaizu.config;

import com.mihaisaizu.examplebeans.FakeDataSource;
import com.mihaisaizu.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${mihai.username}")
    String user;
    @Value("${mihai.password}")
    String password;
    @Value("${mihai.dburl}")
    String url;

    @Value("${mihai.jms.username}")
    String jmsUsername;
    @Value("${mihai.jms.password}")
    String jmsPassword;
    @Value(("${mihai.jms.dburl}"))
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(password);
        fakeJmsBroker.setUrl(url);

        return fakeJmsBroker;
    }

}
