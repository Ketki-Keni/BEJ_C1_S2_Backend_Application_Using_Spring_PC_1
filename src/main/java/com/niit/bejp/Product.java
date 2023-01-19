/*
 * Author : Ketki Keni
 * Date : 19-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private int rating;

    public Product(int productId, String productName, String productDescription, int rating) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", rating=" + rating +
                '}';
    }
}
