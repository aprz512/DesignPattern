package com.aprz.factory;

public class BJPizzaStore extends PizzaStore {

	@Override
	public Pizza orderPizza(String pizzaName) {
		BJPizzaFactory factory = new BJPizzaFactory();
		return factory.createPizza(pizzaName);
	}

}
