package nutriscore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NutriscoreTest {

	@Test
	public void testA_24024228() {
		//Testing product: https://es.openfoodfacts.org/producto/24024228/hot-dogs-cachorro-panet-s
		
		final Product product = new Product.ProductBuilder().energy(1121f).fat(3f).saturatedFat(0.5f).sugar(0.5f).fiber(3f).proteins(9f).sodium(0.315f).salt(0.8f).build();
		
		final String result = Nutriscore.getNutriscore(product, FoodType.GENERAL);
		
		assertEquals("A", result);
		
	}
	
	@Test
	public void testB_8001091000414() {
		
		//Testing https://es.openfoodfacts.org/producto/8001091000414/burger-de-trigo-sarraceno-y-aceitunas-germinal-bio-vegan

		final Product product = new Product.ProductBuilder().energy(179f).fat(5.5f).saturatedFat(0.74f).sugar(2.7f).sodium(0.394f).salt(1f).build();
				
		final String result = Nutriscore.getNutriscore(product, FoodType.GENERAL);
		assertEquals("B", result);
	}
	

	@Test
	public void testC_20033354() {
		//Testing product: https://es.openfoodfacts.org/producto/20033354/aceitunas-verdes-alinadas-gazpacha-baresa
		
		final Product product = new Product.ProductBuilder().energy(612f).fat(15.3f).saturatedFat(3f).sugar(0.1f)
				.sodium(1.57f).salt(4f).build();
				
		final String result = Nutriscore.getNutriscore(product, FoodType.GENERAL);
		assertEquals("C", result);
	}
	

	
	@Test
	public void testD_3760091726667() {
		//Testing product: https://es.openfoodfacts.org/producto/3760091726667/chocolate-negro-ecuador-80-cacao-ethiquable
		
		final Product product = new Product.ProductBuilder().energy(2552f).fat(48.8f).saturatedFat(29.3f).sugar(19.9f).fiber(10.2f).proteins(9.9f).build();
				
		final String result = Nutriscore.getNutriscore(product, FoodType.GENERAL);
		assertEquals("D", result);
	}
	
	@Test
	public void testE_3273220087930() {
		
		// Testing: https://es.openfoodfacts.org/producto/3273220087930/go-shake-soja-mandarine-citron-vert-sojasun
		final Product product = new Product.ProductBuilder().energy(314f).fat(1.5f).saturatedFat(0.3f).sugar(10f).fiber(1.5f).proteins(2.5f).sodium(0.354f).salt(0.09f).build();
		
		final String result = Nutriscore.getNutriscore(product, FoodType.BEVERAGE);
		
		assertEquals("E", result);
	}
	
	

}
