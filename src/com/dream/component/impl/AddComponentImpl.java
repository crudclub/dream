package com.dream.component.impl;

import org.springframework.stereotype.Component;

import com.dream.component.AddComponent;

@Component("addComponent")
public class AddComponentImpl implements AddComponent {

	@Override
	public int add(int a,int b) {
			
		     int j = a+b;
			System.out.println("i+jµÄºÍÎª:"+j);
	        return j;
		
	}

	@Override
	public int substrut(int i, int j) {
		
		return i-j;
	}

}
