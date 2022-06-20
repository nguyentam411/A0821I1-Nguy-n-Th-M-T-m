package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ma_giao_dich;
    @ManyToOne(targetEntity = KhachHang.class)
    private KhachHang khachHang;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String category;
    private double gia;
    private double dien_tich;

    public GiaoDich() {
    }

    public GiaoDich(Integer id, String ma_giao_dich, KhachHang khachHang, Date date, String loai_dich_vu, double gia, double dien_tich) {
        this.id = id;
        this.ma_giao_dich = ma_giao_dich;
        this.khachHang = khachHang;
        this.date = date;
        this.category = loai_dich_vu;
        this.gia = gia;
        this.dien_tich = dien_tich;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa_giao_dich() {
        return ma_giao_dich;
    }

    public void setMa_giao_dich(String ma_giao_dich) {
        this.ma_giao_dich = ma_giao_dich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String loai_dich_vu) {
        this.category = loai_dich_vu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(double dien_tich) {
        this.dien_tich = dien_tich;
    }
}
