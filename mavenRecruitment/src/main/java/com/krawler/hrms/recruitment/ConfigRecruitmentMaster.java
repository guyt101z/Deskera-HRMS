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
package com.krawler.hrms.recruitment;



/**
 *
 * @author krawler
 */
public class ConfigRecruitmentMaster {

    String masterid;
    String masterdata;
    private ConfigRecruitment configid;

    public ConfigRecruitment getConfigid() {
        return configid;
    }

    public void setConfigid(ConfigRecruitment configid) {
        this.configid = configid;
    }

    public String getMasterdata() {
        return masterdata;
    }

    public void setMasterdata(String masterdata) {
        this.masterdata = masterdata;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }
}
