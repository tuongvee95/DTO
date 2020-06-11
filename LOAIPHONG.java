/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class LOAIPHONG {
    private int MALOAIPHONG;
    private String TENLOAIPHONG;
    private long GIAPHONG;
    private List<PHONG> phongs = new ArrayList<>();

    /**
     * @return the MALOAIPHONG
     */
    public int getMALOAIPHONG() {
        return MALOAIPHONG;
    }

    /**
     * @param MALOAIPHONG the MALOAIPHONG to set
     */
    public void setMALOAIPHONG(int MALOAIPHONG) {
        this.MALOAIPHONG = MALOAIPHONG;
    }

    /**
     * @return the TENLOAIPHONG
     */
    public String getTENLOAIPHONG() {
        return TENLOAIPHONG;
    }

    /**
     * @param TENLOAIPHONG the TENLOAIPHONG to set
     */
    public void setTENLOAIPHONG(String TENLOAIPHONG) {
        this.TENLOAIPHONG = TENLOAIPHONG;
    }

    /**
     * @return the GIAPHONG
     */
    public long getGIAPHONG() {
        return GIAPHONG;
    }

    /**
     * @param GIAPHONG the GIAPHONG to set
     */
    public void setGIAPHONG(long GIAPHONG) {
        this.GIAPHONG = GIAPHONG;
    }

    /**
     * @return the phongs
     */
    public List<PHONG> getPhongs() {
        return phongs;
    }

    /**
     * @param phongs the phongs to set
     */
    public void setPhongs(List<PHONG> phongs) {
        this.phongs = phongs;
    }
    
}
