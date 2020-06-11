/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HP
 */
public class CSVC {
    private int MACSVC;
    private String TENCSVC;
    private int GIACSVC;

    /**
     * @return the MACSVC
     */
    public int getMACSVC() {
        return MACSVC;
    }

    public void setMACSVC(int ma){
        this.MACSVC = ma;
    }
    /**
     * @return the TENCSVC
     */
    public String getTENCSVC() {
        return TENCSVC;
    }

    /**
     * @param TENCSVC the TENCSVC to set
     */
    public void setTENCSVC(String TENCSVC) {
        this.TENCSVC = TENCSVC;
    }

    /**
     * @return the GIACSVC
     */
    public int getGIACSVC() {
        return GIACSVC;
    }

    /**
     * @param GIACSVC the GIACSVC to set
     */
    public void setGIACSVC(int GIACSVC) {
        this.GIACSVC = GIACSVC;
    }
    
}
