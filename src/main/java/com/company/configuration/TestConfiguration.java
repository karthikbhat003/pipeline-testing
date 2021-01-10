package com.company.configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.dropwizard.Configuration;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties (ignoreUnknown = true)
@JsonInclude (value = JsonInclude.Include.NON_NULL)
@ToString
public class TestConfiguration extends Configuration {
    private String template;
}
