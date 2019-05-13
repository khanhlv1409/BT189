/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt189.BT189;

/**
 *
 * @author khanh-pc
 */
public class Product {
    String product_name;
    String category;
    int price;
    String desciption;

    public Product(String product_name, String category, int price, String desciption) {
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.desciption = desciption;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
    
}
