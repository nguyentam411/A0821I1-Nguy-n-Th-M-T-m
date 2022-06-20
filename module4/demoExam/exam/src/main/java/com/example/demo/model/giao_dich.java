package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class giao_dich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ma_giao_dich;
    @ManyToOne(targetEntity = khach_hang.class)
    private khach_hang khach_hang;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @ManyToOne(targetEntity = loai_dich_vu.class)
    private loai_dich_vu loai_dich_vu;
    private double gia;
    private double dien_tich;

    public giao_dich() {
    }

    public giao_dich(Integer id, String ma_giao_dich, com.example.demo.model.khach_hang khach_hang, Date date, com.example.demo.model.loai_dich_vu loai_dich_vu, double gia, double dien_tich) {
        this.id = id;
        this.ma_giao_dich = ma_giao_dich;
        this.khach_hang = khach_hang;
        this.date = date;
        this.loai_dich_vu = loai_dich_vu;
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

    public com.example.demo.model.khach_hang getKhach_hang() {
        return khach_hang;
    }

    public void setKhach_hang(com.example.demo.model.khach_hang khach_hang) {
        this.khach_hang = khach_hang;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public com.example.demo.model.loai_dich_vu getLoai_dich_vu() {
        return loai_dich_vu;
    }

    public void setLoai_dich_vu(com.example.demo.model.loai_dich_vu loai_dich_vu) {
        this.loai_dich_vu = loai_dich_vu;
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
