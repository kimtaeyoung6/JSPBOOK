package dao;

import java.io.ArrayList;

import dto.Product;

public class ProductRepository {
	
    private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    
    public ProductRepository() {
       Product phone = new Product("P1234", "iPhone 6s", 800000);
       phone.setDescription("4.7-inch, 1334x750 Renina HD display,8-megapixel iSight Camera");
       phone.setCategory("Smary Phone");
       phone.setMannfacturer("Apple");
       phone.setUnitsInStock(1000);
       phone.setCondition("New");
       
       Product notebook = new Product("P1235", "LG PC ±×·¥", 1500000);
       notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
       notebook.setCategory("Notebook");
       notebook.setMannfacturer("LG");
       notebook.setUnitsInStock(100);
       notebook.setCondition("Refurbished");
       
       Product notebook = new Product("P1236", "Galaxy Tab s", 900000);
       tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
       tablet.setCategory("Tablet");
       tablet.setMannfacturer("Samsung");
       tablet.setUnitsInStock("1000");
       tablet.setCondition("Old");
       
       listOfProducts.add(phone);
       listOfProducts.add(notebook);
       listOfProducts.add(tablet);
    }
}