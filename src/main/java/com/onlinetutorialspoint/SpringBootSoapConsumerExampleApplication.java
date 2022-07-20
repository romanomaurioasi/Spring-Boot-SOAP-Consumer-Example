package com.onlinetutorialspoint;

import com.onlinetutorialspoint.model.LogItem;
import com.onlinetutorialspoint.repository.LogItemRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootSoapConsumerExampleApplication implements CommandLineRunner {

    @Autowired
    LogItemRepository logItemRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootSoapConsumerExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            logItemRepository.save(new LogItem(DateTime.now(), "Starting Application"));
        }
        catch( Exception e ) {
            String msg = e.toString();
        }
    }

    @Bean
    public LogItemRepository getLogItemRepository() {
        return logItemRepository;
    }

}

// use TransmitterDB;
// db.createUser({ user:"oasi", pwd:"oasi", roles: [{role:"readWrite", db:"TransmitterDB"}]})

