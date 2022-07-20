package com.onlinetutorialspoint.repository;

import com.onlinetutorialspoint.model.LogItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface LogItemRepository extends MongoRepository<LogItem, String> {

    @Query("{name:'?0'}")
    LogItem findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<LogItem> findAll(String category);

    public long count();
}

// Now we can use MongoRepository’s methods: save(), findOne(), findById(), findAll(), count(),
// delete(), deleteById()… without implementing these methods.

