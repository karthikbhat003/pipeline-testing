package com.company;

import com.company.configuration.TestConfiguration;
import com.company.resource.TestResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<TestConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    public void run(TestConfiguration testConfiguration, Environment environment) throws Exception {
        final TestResource testResource = new TestResource();
        environment.jersey().register(testResource);
    }
}
