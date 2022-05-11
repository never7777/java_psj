package day12;

public class Drink extends Product {

	private int capacity;//용량ml
	
	public Drink(String name, int price, int amount, int capacity) {
		super(name, price, amount);
		this.capacity =capacity;
	}

	@Override
	public void print() {
		if(capacity<1000) {
			System.out.println(getName()+"["+capacity+"ml] : "+getPrice()+"원 - " + getAmount());
			
		}
		else {
			System.out.println(getName()+"["+capacity/1000.0+"l] : "+getPrice()+"원 - " + getAmount());
		}
	}
	
}
