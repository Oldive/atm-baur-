package com.baur.MiniBaur;

import org.springframework.context.annotation.*;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@ComponentScan(basePackages = {"com.baur.MiniBaur"})
@PropertySource("classpath:/application.properties")
public class SpringConfig {



}



