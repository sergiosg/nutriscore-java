package nutriscore;

public class Product {

	private final Float fiber;
	private final Float proteins;
	private final Float fruits;
	private final Float energy;
	private final Float fat;
	private final Float saturatedFat;
	private final Float sodium;
	private final Float salt;
	private final Float sugar;

	public Product(ProductBuilder builder) {
		this.fiber = builder.fiber;
		this.proteins = builder.proteins;
		this.fruits = builder.fruits;
		this.fat = builder.fat;
		this.saturatedFat = builder.saturatedFat;
		this.sodium = builder.sodium;
		this.sugar = builder.sugar;
		this.energy = builder.energy;
		this.salt = builder.salt;
	}

	public Float getFiber() {
		return fiber;
	}

	public Float getProteins() {
		return proteins;
	}

	public Float getFruits() {
		return fruits;
	}

	public Float getEnergy() {
		return energy;
	}

	public Float getFat() {
		return fat;
	}

	public Float getSaturatedFat() {
		return saturatedFat;
	}

	public Float getSodium() {
		return sodium;
	}

	public Float getSugar() {
		return sugar;
	}

	public Float getSalt() {
		return salt;
	}
	
	public static class ProductBuilder {
		private Float fiber;
		private Float proteins;
		private Float energy;
		private Float fat;
		private Float saturatedFat;
		private Float sodium;
		private Float salt;
		private Float sugar;
		private Float fruits;

		public ProductBuilder fiber(Float fiber) {
			this.fiber = fiber;
			return this;
		}

		public ProductBuilder proteins(Float proteins) {
			this.proteins = proteins;
			return this;
		}

		public ProductBuilder fruits(Float fruits) {
			this.fruits = fruits;
			return this;
		}

		public ProductBuilder energy(Float energy) {
			this.energy = energy;
			return this;
		}

		public ProductBuilder saturatedFat(Float saturatedFat) {
			this.saturatedFat = saturatedFat;
			return this;
		}

		public ProductBuilder sodium(Float sodium) {
			this.sodium = sodium;
			return this;
		}

		public ProductBuilder fat(Float fat) {
			this.fat = fat;
			return this;
		}

		public ProductBuilder sugar(Float sugar) {
			this.sugar = sugar;
			return this;
		}

		public ProductBuilder salt(Float salt) {
			this.salt = salt;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}

}
