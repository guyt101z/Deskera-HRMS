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

package com.krawler.hrms.performance;

import com.krawler.common.admin.User;

/**
 *
 * @author krawler
 */
public class Assignmanager {
    private String id;
    private User assignemp;
    private User assignman;
    private User reviewer;
    private Integer managerstatus;

    public Assignmanager() {
    }

    public Assignmanager(String id, User assignemp, User assignman, Integer managerstatus) {
        this.id = id;
        this.assignemp = assignemp;
        this.assignman = assignman;
        this.managerstatus = managerstatus;
    }

    public User getAssignemp() {
        return assignemp;
    }

    public void setAssignemp(User assignemp) {
        this.assignemp = assignemp;
    }

    public User getAssignman() {
        return assignman;
    }

    public void setAssignman(User assignman) {
        this.assignman = assignman;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public Integer getManagerstatus() {
        return managerstatus;
    }

    public void setManagerstatus(Integer managerstatus) {
        this.managerstatus = managerstatus;
    }

}
