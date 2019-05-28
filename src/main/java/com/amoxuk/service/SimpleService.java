
package com.amoxuk.service;

import com.amoxuk.entity.SimpleEntity;
import com.amoxuk.mapper.SimpleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SimpleService {


    @Autowired
    private SimpleMapper mapper;

    private SimpleService(SimpleMapper mapper) {
        this.mapper = mapper;
    }

    public List<SimpleEntity> selectAll() {
        return mapper.select();
    }
}
