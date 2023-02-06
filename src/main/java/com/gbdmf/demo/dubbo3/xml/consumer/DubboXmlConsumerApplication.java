/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gbdmf.demo.dubbo3.xml.consumer;

import com.gbdmf.demo.dubbo3.api.GreetingsService;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {
        HibernateJpaAutoConfiguration.class
})
@ImportResource("spring/dubbo-consumer.xml")
public class DubboXmlConsumerApplication implements ApplicationContextAware, CommandLineRunner {

    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        System.setProperty("dubbo.reference.version", "TEST");
        SpringApplication.run(DubboXmlConsumerApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println("consumer start ok >>>");
            GreetingsService greetingsService = applicationContext.getBean(GreetingsService.class);
            String ans = greetingsService.sayHi("满分");
            System.out.println("ans=" + ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.in.read();
    }
}
