package homework.hw8.Products;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product sku_123 = new Product("Колбаса", 200, 4.7);
        Product sku_124 = new Product("Сосиски", 175, 4.1);
        Product sku_125 = new Product("Вырезка", 550, 5);

        Product sku_225 = new Product("Кола", 180, 5);
        Product sku_325 = new Product("Рис", 310, 4.9);


        Category meat = new Category("Мясо", new Product[]{sku_123, sku_124, sku_125});
        Category drinks = new Category("Напитки", new Product[]{sku_225});
        Category groats = new Category("Крупы", new Product[]{sku_325});

        Basket basket_personal = new Basket(new Product[]{sku_123, sku_225});

        User user_110 = new User("Arnold", "2288", basket_personal);

        System.out.println(Arrays.toString(user_110.getBasket().getProducts()));

    }
}
