package com.example.demo.model;

import com.example.demo.validation.EXPDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class Giaodich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ma_giao_dich;
    @ManyToOne(targetEntity = Khachhang.class)
    private Khachhang khachhang;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expdate;
    @ManyToOne(targetEntity = Category.class)
    private Category category;
    private double price;
    private double dien_tich;

    public Giaodich() {
    }

    public Giaodich(Integer id, Integer ma_giao_dich, Khachhang khachhang, Date expdate, Category category, double price, double dien_tich) {
        this.id = id;
        this.ma_giao_dich = ma_giao_dich;
        this.khachhang = khachhang;
        this.expdate = expdate;
        this.category = category;
        this.price = price;
        this.dien_tich = dien_tich;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMa_giao_dich() {
        return ma_giao_dich;
    }

    public void setMa_giao_dich(Integer ma_giao_dich) {
        this.ma_giao_dich = ma_giao_dich;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public double getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(double dien_tich) {
        this.dien_tich = dien_tich;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
