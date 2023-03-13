package com.java.mylibrary;

public class Book {
    private int id;
    private String name;
    private String writer;
    private int pages;
    private String imageurl;
    private String shortDesc;
    private String longDesc;

    public Book(int id, String name, String writer, int pages, String imageurl, String shortDesc, String longDesc) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.pages = pages;
        this.imageurl = imageurl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", pages=" + pages +
                ", imageurl='" + imageurl + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                '}';
    }
}
