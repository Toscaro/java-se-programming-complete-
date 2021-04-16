/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package practices.app;

import practices.data.Product;
import practices.data.ProductManager;
import practices.data.Rating;

import java.math.BigDecimal;
import java.util.Locale;

/**
 * {@code Shop} class represents an application that manages Products.
 *
 * @author Toscaro
 * @version 4.0
 */
public class Shop {

    public static void main(String[] args) {
        final ProductManager productManager = new ProductManager(Locale.UK);

        final Product p1 = productManager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        productManager.printProductReport();
        productManager.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        productManager.printProductReport();


//        Product p2 = productManager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = productManager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = productManager.createProduct(104, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//
//        System.out.println(p6.equals(p7));
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }
}
