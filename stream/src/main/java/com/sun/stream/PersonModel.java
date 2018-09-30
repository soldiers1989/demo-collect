package com.sun.stream;

/**
 * @author Jungle
 * @version 0.0.1
 * @date 2018-07-28 15:05
 */
public class PersonModel {

    private String name;
    private int age;
    private String desc;

    public PersonModel(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    public PersonModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
