package com.javainuse.service;

import com.javainuse.model.Customer;
import com.javainuse.model.Message;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Product;
import java.util.HashMap;
import java.util.Map;

@Service
public class JewelleryShopService {

	private final KieContainer kieContainer;

	@Autowired
	public JewelleryShopService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

//	public Product getProductDiscount(Product product) {
//		KieSession kieSession = kieContainer.newKieSession("rulesSession");
//		kieSession.insert(product);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return product;
//	}
        public Message getProductDiscount(Message message) {
		KieSession kieSession = kieContainer.newKieSession("ksession-process");              
//              message.setMessage("Rule is fired");
//              message.setStatus(Message.HELLO);
                Map<String, Object> mess = new HashMap<String, Object>();
                mess.put("message", message);                
//              в session совать объект в процесс хашмап, иначе проверки не будут робить.


			Customer customer1 = new Customer("Frank");
			customer1.setAge(4);
			customer1.setCat_id(82);
			customer1.setProduct_code("03.01.00");

			Customer customer2 = new Customer("John");
			customer2.setAge(1);
			customer2.setCat_id(0);
			customer2.setProduct_code("03.01.00");

			FactHandle fact1 = kieSession.insert(customer1);
			FactHandle fact2 = kieSession.insert(customer2);

			kieSession.fireAllRules();

			System.out.println("The discount for the Customer " + customer1.getName() + " is " + customer1.getDiscount());
			System.out.println("The discount for the Customer " + customer2.getName() + " is " + customer2.getDiscount());
//                kieSession.insert(message);
//                kieSession.startProcess("com.javacodegeeks.drools", mess);
//                kieSession.fireAllRules();
				kieSession.dispose();
		return message;
        }
        
//            public static final void main(String[] args) {
//        try {
//            // load up the knowledge base
//	        KieServices ks = KieServices.Factory.get();
//    	    KieContainer kContainer = ks.getKieClasspathContainer();
//        	KieSession kSession = kContainer.newKieSession("ksession-process");
//        	Message message = new Message();
//            message.setMessage("Rule is fired");
//            message.setStatus(Message.HELLO);
//            kSession.insert(message);
//            
//            // start a new process instance
//            kSession.startProcess("com.javacodegeeks.drools", null);    
//            kSession.fireAllRules();
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
//    }
}