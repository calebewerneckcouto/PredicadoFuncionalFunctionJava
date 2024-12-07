package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;

	public Product() {

	}

	public Product(String name, Double price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	
	public static String staticUpperCaseName(Product p) {   // metodo statico utiliza a forma que ira retornar o metodo(String no caso)
	  return p.getName().toUpperCase();
	}
	
	
	public  String nonStaticUpperCaseName() {   // metodo statico utiliza a forma que ira retornar o metodo(String no caso)
		 return name.toUpperCase();
		}

}
