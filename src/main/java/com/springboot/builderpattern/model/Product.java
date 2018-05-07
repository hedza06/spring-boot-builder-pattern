package com.springboot.builderpattern.model;

import org.springframework.context.annotation.Description;

import java.time.LocalDate;

@Description(value = "Demo definition of product class and its builder.")
public class Product {

    private final String name;
    private final Double cost;
    private final String barCode;
    private final LocalDate expirationDate;

    private Product(Builder builder)
    {
        this.name = builder.name;
        this.cost = builder.cost;
        this.barCode = builder.barCode;
        this.expirationDate = builder.expirationDate;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public String getBarCode() {
        return barCode;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Static builder class - responsible for building objects.
     */
    public static final class Builder {

        private String name;
        private Double cost;
        private String barCode;
        private LocalDate expirationDate;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder cost(Double cost)
        {
            this.cost = cost;
            return this;
        }

        public Builder barCode(String barCode)
        {
            this.barCode = barCode;
            return this;
        }

        public Builder expirationDate(LocalDate expirationDate)
        {
            this.expirationDate = expirationDate;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", barCode='" + barCode + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
