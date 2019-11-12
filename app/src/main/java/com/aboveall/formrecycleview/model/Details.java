package com.aboveall.formrecycleview.model;

public class Details {
    public Details(String name, String gender, String age, int image) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.image = image;
    }

    private String name;
    private String gender;
    private String age;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


