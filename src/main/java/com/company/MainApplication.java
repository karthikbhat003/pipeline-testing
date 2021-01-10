package com.company;

import com.company.configuration.TestConfiguration;
import com.company.resource.TestResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.extern.slf4j.Slf4j;

// todo - Look at the logging configuration in yml to get better picture
@Slf4j
public class MainApplication extends Application<TestConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TestConfiguration> bootstrap) {
        /**
         * This is required for reading yml from config.
         */
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
        /**
         * This is required to read the environment variables
         */
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));
    }

    public void run(TestConfiguration testConfiguration, Environment environment) {
        log.info("Configuration is available in running environment {}", testConfiguration.toString());
        final TestResource testResource = new TestResource();
        environment.jersey().register(testResource);
    }
}
