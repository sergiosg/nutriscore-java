Nutriscore algorithm implementated in java

Use example:

		`final Product product = new Product.ProductBuilder()
				.energy(1121f)
				.fat(3f)
				.saturatedFat(0.5f)
				.sugar(0.5f)
				.fiber(3f)
				.proteins(9f)
				.sodium(0.315f)
				.salt(0.8f)
				.build();
		
		final String result = Nutriscore.getNutriscore(product, FoodType.GENERAL);`