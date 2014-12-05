package com.dream.component.impl;

import org.springframework.stereotype.Component;

import com.dream.component.AddComponent;

@Component("addComponent")
public class AddComponentImpl implements AddComponent {

	/* (non-Javadoc)
	 * @see com.dream.component.AddComponent#add(int, int)
	 */
	@Override
	public int add(int a,int b) {
			
		     int j = a+b;
			System.out.println("i+j的和为:"+j);
	        return j;
		
	}

	@Override
	public int substrut(int i, int j) {
		
		return i-j;
	}

}
