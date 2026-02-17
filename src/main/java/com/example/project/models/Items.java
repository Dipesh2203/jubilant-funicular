package com.example.project.models;


import jakarta.validation.constraints.*;

public class Items {
    private Long id;

    @NotBlank(message = "Name is rquired")
    @NotNull(message = "Name is required")
    @Size(min = 3, max = 100 , message = "Name must be between 3 and 100 characters")
    private String name;

    @Size(min = 5, max = 500 , message = "Name must be between 5 and 500 characters")
    private String description;


    @Positive(message = "Price must be greater than 0 ")
    @Max(value= 1000000 , message = "Price is too large")
    private Integer price;

    public Items(Long id, String name, String description, Integer price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
