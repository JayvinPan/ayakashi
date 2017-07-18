package com.pan.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Pan on 2017/7/18.
 */
@ConfigurationProperties(prefix = "shikigamiProperties")
public class ShikigamiProperties {
    private Integer id;
    private String name;
    private String rare;
    private Integer level;

    public ShikigamiProperties() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRare() {
        return rare;
    }

    public void setRare(String rare) {
        this.rare = rare;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
