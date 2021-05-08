package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Test Ürün",12,50);
		productService.add(product);
		
	}

}
