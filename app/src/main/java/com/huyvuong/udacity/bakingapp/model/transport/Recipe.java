package com.huyvuong.udacity.bakingapp.model.transport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recipe
{
    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    @SerializedName("servings")
    private Long servings;

    @SerializedName("image")
    private String imageUrl;

    @SerializedName("ingredients")
    private List<Ingredient> ingredients;

    @SerializedName("steps")
    private List<Step> steps;

    private Recipe(Long id,
                   String name,
                   Long servings,
                   String imageUrl,
                   List<Ingredient> ingredients,
                   List<Step> steps)
    {
        this.id = id;
        this.name = name;
        this.servings = servings;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public long getServings()
    {
        return servings;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public List<Ingredient> getIngredients()
    {
        return ingredients;
    }

    public List<Step> getSteps()
    {
        return steps;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private Long id;
        private String name;
        private Long servings;
        private String imageUrl;
        private List<Ingredient> ingredients;
        private List<Step> steps;

        public Builder withId(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder withName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder withServings(Long servings)
        {
            this.servings = servings;
            return this;
        }

        public Builder withImageUrl(String imageUrl)
        {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder withIngredients(List<Ingredient> ingredients)
        {
            this.ingredients = ingredients;
            return this;
        }

        public Builder withSteps(List<Step> steps)
        {
            this.steps = steps;
            return this;
        }

        public Recipe build()
        {
            return new Recipe(id, name, servings, imageUrl, ingredients, steps);
        }
    }
}
