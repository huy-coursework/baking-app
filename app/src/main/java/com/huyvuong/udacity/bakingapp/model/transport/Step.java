package com.huyvuong.udacity.bakingapp.model.transport;

import com.google.gson.annotations.SerializedName;

public class Step
{
    @SerializedName("id")
    private Long id;

    @SerializedName("shortDescription")
    private String shortDescription;

    @SerializedName("description")
    private String description;

    @SerializedName("videoURL")
    private String videoUrl;

    @SerializedName("thumbnailURL")
    private String thumbnailUrl;

    private Step(Long id,
                 String shortDescription,
                 String description,
                 String videoUrl,
                 String thumbnailUrl)
    {
        this.id = id;
        this.shortDescription = shortDescription;
        this.description = description;
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Long getId()
    {
        return id;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getDescription()
    {
        return description;
    }

    public String getVideoUrl()
    {
        return videoUrl;
    }

    public String getThumbnailUrl()
    {
        return thumbnailUrl;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private Long id;
        private String shortDescription;
        private String description;
        private String videoUrl;
        private String thumbnailUrl;

        public Builder withId(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder withShortDescription(String shortDescription)
        {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder withDescription(String description)
        {
            this.description = description;
            return this;
        }

        public Builder withVideoUrl(String videoUrl)
        {
            this.videoUrl = videoUrl;
            return this;
        }

        public Builder withThumbnailUrl(String thumbnailUrl)
        {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Step build()
        {
            return new Step(id, shortDescription, description, videoUrl, thumbnailUrl);
        }
    }
}