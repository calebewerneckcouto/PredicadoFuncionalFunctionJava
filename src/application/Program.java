package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		
		
		//Converter lista para stream .stream()
		
		//Converter Stream para Lista collect(Collectors.toList());

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		Function<Product, String> prods = p-> p.getName().toUpperCase();

	  List<String> name =	list.stream().map(prods).collect(Collectors.toList());
	  
	  
	  
	  
	//  for(String s : name) {
	//	  System.out.println(s);   // for comum
//	  }
	  
	  
	  name.forEach(System.out::println);//forEach

	}
}
