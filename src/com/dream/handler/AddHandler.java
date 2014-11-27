package com.dream.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ѧϰjava ��̬����
 * @author dsy
 *
 */
public class AddHandler implements InvocationHandler  {
	
	 // ������Ķ���
    private Object target;
    
    
    public AddHandler(Object target)
    {
    	this.target = target;
    }
	
	
	/**
     * @param proxy ������ProxyҪΪ�����ɵĴ������ʵ����ע�⣬����������new������AddComponeentImpl
     * @param method ���õķ�����Methodʵ�������������add()����ô����add()��Methodʵ��
     * @param args ���÷���ʱ����Ĳ��������������add()����ô���Ǵ���add()�Ĳ���
     * @return ʹ�ô������Ϊ���÷�����ķ���ֵ�����������add()����ô���ǵ���add()��ķ���ֵ
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("���÷���ǰ....");
		// ���ñ��������ķ������õ�����ֵ
        Object returnValue = method.invoke(target, args);
        System.out.println("�õ��ķ���ֵΪ:"+returnValue);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String nowStr = format.format(date);
        
        // ���÷���ǰ�󶼿��Լ���һЩ�������߼�
        System.out.println("proxy ���÷����� " + method.getName() + "() at " + nowStr);
        // ���Է����κ���Ҫ���ص�ֵ
        return returnValue;
	}
	
	

}
