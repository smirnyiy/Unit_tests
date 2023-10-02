package seminars.first.Shop;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        List<Product> products = new ArrayList<>();
         products.add(new Product(10, "Product 1"));
         products.add(new Product(20, "Product 2"));
        shop.setProducts(products);
    }

    @Test
    public void testStoreProducts() {
        // Проверьте, что количество продуктов в магазине соответствует ожидаемому количеству
        Assertions.assertThat(shop.getProducts()).hasSize(expectedNumberOfProducts);

        // Проверьте, что содержимое списка продуктов в магазине соответствует ожидаемому содержимому
        Assertions.assertThat(shop.getProducts()).containsExactlyInAnyOrderElementsOf(expectedProducts);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        // Добавьте продукты с разными стоимостями в список

        // Вызовите метод getMostExpensiveProduct()
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверьте, что метод возвращает продукт с наибольшей стоимостью
        Assertions.assertThat(mostExpensiveProduct).isEqualTo(expectedMostExpensiveProduct);
    }

    @Test
    public void testSortProductsByPrice() {
        // Добавьте продукты с разными стоимостями в список

        // Вызовите метод sortProductsByPrice()
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверьте, что список продуктов отсортирован по возрастанию цены
        Assertions.assertThat(sortedProducts).isSortedAccordingTo(Comparator.comparingInt(Product::getCost));
    }
}

