/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author HP
 */
public class PHIEUDATTRUOC {
    private int MAPHIEU;
    private String NGAYDEN, NGAYROI;
    private KHACHHANG khachhang = new KHACHHANG();
    private NHANVIEN nhanvien = new NHANVIEN();
    private PHONG phong = new PHONG();

    /**
     * @return the MAPHIEU
     */
    public int getMAPHIEU() {
        return MAPHIEU;
    }

    /**
     * @param MAPHIEU the MAPHIEU to set
     */
    public void setMAPHIEU(int MAPHIEU) {
        this.MAPHIEU = MAPHIEU;
    }

    /**
     * @return the NGAYDEN
     */
    public String getNGAYDEN() {
        return NGAYDEN;
    }

    /**
     * @param NGAYDEN the NGAYDEN to set
     */
    public void setNGAYDEN(String NGAYDEN) {
        this.NGAYDEN = NGAYDEN;
    }

    /**
     * @return the NGAYROI
     */
    public String getNGAYROI() {
        return NGAYROI;
    }

    /**
     * @param NGAYROI the NGAYROI to set
     */
    public void setNGAYROI(String NGAYROI) {
        this.NGAYROI = NGAYROI;
    }

    /**
     * @return the khachhang
     */
    public KHACHHANG getKhachhang() {
        return khachhang;
    }

    /**
     * @param khachhang the khachhang to set
     */
    public void setKhachhang(KHACHHANG khachhang) {
        this.khachhang = khachhang;
    }

    /**
     * @return the nhanvien
     */
    public NHANVIEN getNhanvien() {
        return nhanvien;
    }

    /**
     * @param nhanvien the nhanvien to set
     */
    public void setNhanvien(NHANVIEN nhanvien) {
        this.nhanvien = nhanvien;
    }

    /**
     * @return the phong
     */
    public PHONG getPhong() {
        return phong;
    }

    /**
     * @param phong the phong to set
     */
    public void setPhong(PHONG phong) {
        this.phong = phong;
    }
    
}
