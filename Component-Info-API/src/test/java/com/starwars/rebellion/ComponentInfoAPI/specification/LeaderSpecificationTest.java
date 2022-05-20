package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.repositories.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeaderSpecificationTest {

    @Autowired
    private LeaderSpecification leaderSpecification;

    @Autowired
    private LeaderRepository leaderRepository;


}
