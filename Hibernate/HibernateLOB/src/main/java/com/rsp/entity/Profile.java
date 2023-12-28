package com.rsp.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private String name;

    @Lob
    @Column(name = "image")
    private byte[] img;

    @Lob
    @Column(name = "doc")
    private char[] charfile;

    public Profile(){
        System.out.println("Profile class, zero param constructor for hibernate.");
    }

    @Override
    public String toString() {
        return "Profile{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", img=" + Arrays.toString(img) +
                ", charfile=" + Arrays.toString(charfile) +
                '}';
    }

    public Profile(String name, byte[] img, char[] charfile) {
        this.name = name;
        this.img = img;
        this.charfile = charfile;
    }

    public Integer getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public byte[] getImg() {
        return img;
    }

    public char[] getCharfile() {
        return charfile;
    }
}
