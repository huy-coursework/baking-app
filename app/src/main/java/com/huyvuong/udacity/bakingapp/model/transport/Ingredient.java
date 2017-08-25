package com.huyvuong.udacity.bakingapp.model.transport;

import com.google.gson.annotations.SerializedName;

public class Ingredient
{
    @SerializedName("quantity")
    private Double quantity;

    @SerializedName("measure")
    private String measure;

    @SerializedName("ingredient")
    private String ingredient;

    private Ingredient(Double quantity, String measure, String ingredient)
    {
        this.quantity = quantity;
        this.measure = measure;
        this.ingredient = ingredient;
    }

    public Double getQuantity()
    {
        return quantity;
    }

    public String getMeasure()
    {
        return measure;
    }

    public String getIngredient()
    {
        return ingredient;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private Double quantity;
        private String measure;
        private String ingredient;

        public Builder withQuantity(Double quantity)
        {
            this.quantity = quantity;
            return this;
        }

        public Builder withMeasure(String measure)
        {
            this.measure = measure;
            return this;
        }

        public Builder withIngredient(String ingredient)
        {
            this.ingredient = ingredient;
            return this;
        }

        public Ingredient build()
        {
            return new Ingredient(quantity, measure, ingredient);
        }
    }
}