package com.galvanize.demo;

public class CowSort {

    private String sort = "Bessie";
    private String dir;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "CowSort{" +
                "sort='" + sort + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
