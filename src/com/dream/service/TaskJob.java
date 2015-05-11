package com.dream.service;

import org.springframework.stereotype.Component;

@Component("taskJob")
public class TaskJob {

	public void job1() {  
        System.out.println("任务进行中..."); 
    }  
	
}
