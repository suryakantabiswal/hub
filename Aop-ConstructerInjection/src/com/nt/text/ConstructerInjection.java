package com.nt.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishmessageGenerater;

public class ConstructerInjection {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishmessageGenerater wish=null;
		res=new FileSystemResource("src/com/nt/cnfs/applicationcontext.xml");
		factory=new XmlBeanFactory(res);
		wish=(WishmessageGenerater) factory.getBean("wish");
		System.out.println("wish message::"+wish.GenerateWishMsg("Lalu"));
		
		
	}

}
