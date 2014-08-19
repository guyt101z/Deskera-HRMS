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

import com.krawler.common.admin.User;

/**
 *
 * @author krawler
 */
public class MalaysiaFormHRDLevy {

    private String id;
    private User user;
    private double baseSalary;
    private double others;
    private double netSalary;
    private double hrdLevy;
    private Integer month;
	private Integer year;
    private int authorizeStatus;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getHrdLevy() {
        return hrdLevy;
    }

    public void setHrdLevy(double hrdLevy) {
        this.hrdLevy = hrdLevy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double getOthers() {
        return others;
    }

    public void setOthers(double others) {
        this.others = others;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public int getAuthorizeStatus() {
        return authorizeStatus;
    }

    public void setAuthorizeStatus(int authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
    }
    

}
