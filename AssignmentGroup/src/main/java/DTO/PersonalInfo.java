package DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalInfo {
    public String name;
    @JsonProperty("Technology")
    public String technology;

    public String toString() {
        return "Test" + getName() + getTechnology();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}