package com.mihaisaizu;

import com.mihaisaizu.controllers.ConstructorInjectedController;
import com.mihaisaizu.controllers.MyController;
import com.mihaisaizu.controllers.PropertyInjectedController;
import com.mihaisaizu.controllers.SetterInjectedController;
import com.mihaisaizu.examplebeans.FakeDataSource;
import com.mihaisaizu.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");


        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());


        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());

    }
}
