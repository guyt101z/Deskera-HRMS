/*
 * Copyright (C) 2014 Deskera
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package masterDB;
// Generated Jul 1, 2009 2:58:39 PM by Hibernate Tools 3.2.1.GA


import com.krawler.common.admin.Company;
import java.util.HashSet;
import java.util.Set;

/**
 * Taxmaster generated by hbm2java
 */
public class Taxmaster  implements java.io.Serializable {


     private String taxid;
     private Company companydetails;
     private String taxtype;
     private Integer rate;
     private String tcode;
     private double rangefrom;
     private double rangeto;
     private String categoryid;
     private Wagemaster depwageid;
     private Double cash;
     private boolean isdefault;
     private Integer computeon;
     private String expr;
    public Taxmaster() {
    }

    public Taxmaster(String taxid, Company companydetails, String taxtype, Integer rate, String tcode, double rangefrom, double rangeto, String categoryid, Double cash, boolean isdefault, Wagemaster depwageid) {
        this.taxid = taxid;
        this.companydetails = companydetails;
        this.taxtype = taxtype;
        this.rate = rate;
        this.tcode = tcode;
        this.rangefrom = rangefrom;
        this.rangeto = rangeto;
        this.categoryid = categoryid;
        this.cash = cash;
        this.isdefault = isdefault;
        this.depwageid = depwageid;
    }

    public Integer getComputeon() {
        return computeon;
    }

    public void setComputeon(Integer computeon) {
        this.computeon = computeon;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public Wagemaster getDepwageid() {
        return depwageid;
    }

    public void setDepwageid(Wagemaster depwageid) {
        this.depwageid = depwageid;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public Company getCompanydetails() {
        return companydetails;
    }

    public void setCompanydetails(Company companydetails) {
        this.companydetails = companydetails;
    }

    public boolean isIsdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    public double getRangefrom() {
        return rangefrom;
    }

    public void setRangefrom(double rangefrom) {
        this.rangefrom = rangefrom;
    }

    public double getRangeto() {
        return rangeto;
    }

    public void setRangeto(double rangeto) {
        this.rangeto = rangeto;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

}

