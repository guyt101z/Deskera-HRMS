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


Wtf.KwlEditorGridPanel = function(config){
    Wtf.apply(this,config);
    if(!this.id)
        this.id="id"+Math.random()*100000;
    this.emptext=this.searchEmptyText ? this.searchEmptyText : "Search here ";
    if(this.serverSideSearch){//If server side search required



        this.quickSearchTF = new Wtf.KWLTagSearch({
            id : 'Quick'+this.id,
            width: this.qsWidth?this.qsWidth:200,
            emptyText:this.emptext
        });

        if(this.bbar) //If bbar is there then it Appends in paging toolbar
        {
            var separator="-";
            this.tmpBottom=this.bbar;
            this.b1= new Array();

            for(i=0;i<this.tmpBottom.length;i++)
                this.b1[i+1] = this.tmpBottom[i];

            this.b1[0]=separator;

            this.pag=new Wtf.PagingSearchToolbar({
                pageSize: 15,
                border : false,
                id : "paggintoolbar"+this.id,
                searchField: this.quickSearchTF,
                store: this.store,
                plugins : this.pPageSizeObj = new Wtf.common.pPageSize({
                    id : "pPageSize_"+this.id
                }),
                autoWidth : true,
                displayInfo:this.displayInfo?this.displayInfo:false,
                items:this.b1
            });
        }
        else
        {
            this.pag=new Wtf.PagingSearchToolbar({
                pageSize: 15,
                border : false,
                id : "paggintoolbar"+this.id,
                searchField: this.quickSearchTF,
                store: this.store,
                plugins : this.pPageSizeObj = new Wtf.common.pPageSize({
                    id : "pPageSize_"+this.id
                }),
                autoWidth : true,
                displayInfo:this.displayInfo?this.displayInfo:false
            });
        }

    }
    else
    {
        this.quickSearchTF = new Wtf.wtfQuickSearch({
            id : 'Quick'+this.id,
            width: this.qsWidth?this.qsWidth:200,
            emptyText:this.emptext,
            field:this.searchField
        });
        if(this.bbar)
        {
            this.tmpBottom=this.bbar;
            this.b1= new Array();

            for(i=0;i<this.tmpBottom.length;i++)
                this.b1[i] = this.tmpBottom[i];

            this.pag=new Wtf.PagingToolbar({
                pageSize: 15,
                border : false,
                id : "paggintoolbar"+this.id,
                store: this.store,
                plugins : this.pPageSizeObj = new Wtf.common.pPageSize({
                    id : "pPageSize_"+this.id
                }),
                autoWidth : true,
                displayInfo:this.displayInfo?this.displayInfo:false,
                items:this.b1
            });
        }
        else
        {
            this.pag=new Wtf.PagingToolbar({
                pageSize: 15,
                border : false,
                id : "paggintoolbar"+this.id,
                store: this.store,
                plugins : this.pPageSizeObj = new Wtf.common.pPageSize({
                    id : "pPageSize_"+this.id
                }),
                autoWidth : true,
                displayInfo:this.displayInfo?this.displayInfo:false
            });
        }
    }

    if(!this.nopaging)
        this.bbar=this.pag;
    this.searchLabel = this.searchLabel ? this.searchLabel : WtfGlobal.getLocaleText("hrms.common.QuickSearch");
    this.searchLabelSeparator= this.searchLabelSeparator ? this.searchLabelSeparator : " : ";

    this.searchLabel= this.searchLabel + this.searchLabelSeparator;

    if(this.tbar)//If tbar is there then Append with Quick Search
    {
        this.elements+=",tbar";
        if(typeof this.tbar=="object"){
            this.tmptoolbar=this.tbar;
            this.topToolbar1=new Array();
            var k =this.tmptoolbar.length;
            var i =0 ;
            var j=2;
            for(i=0;i<k;i++)
                this.topToolbar1[j++] = this.tmptoolbar[i];

            this.topToolbar1[0] =this.searchLabel;
            this.topToolbar1[1] =this.quickSearchTF;
            this.topToolbar=this.topToolbar1;
        }delete this.tbar
    }
    else
        this.tbar=[this.searchLabel,this.quickSearchTF];


    this.store.on("load",function(){

        this.quickSearchTF.StorageChanged(this.store);
    },this);

    this.store.on("datachanged", function(){
        if(this.serverSideSearch){
            if(this.pPageSizeObj.combo)
                this.quickSearchTF.setPage(this.pPageSizeObj.combo.value);
            else
                this.quickSearchTF.setPage(15);
        }
    }, this);

    this.doLayout();
    Wtf.KwlEditorGridPanel.superclass.constructor.call(this);
};
Wtf.extend(Wtf.KwlEditorGridPanel,Wtf.grid.EditorGridPanel,{
    layout:'fit',
    onRender: function(config){
        Wtf.KwlEditorGridPanel.superclass.onRender.call(this,config);
    }
});

