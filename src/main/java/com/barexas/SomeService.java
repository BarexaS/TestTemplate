package com.barexas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {
    @Autowired
    private SomeDAO someDAO;

    public void action(){
        System.out.println("Action!");
        someDAO.repositoryAction();
    }
}
