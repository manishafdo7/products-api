package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*(Now imagine this happened in your coursework project, in a class
    with fifteen fields. Write one sentence in your notes about how you would notice.)
    I would notice it when a field is missing from the JSON response even though there is no error.*/

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
