package com.erikasari.recipe1;

import java.io.Serializable;

public class DataModel implements Serializable {
Integer ViewType;
String judul,konten;

    public Integer getViewType() {
        return ViewType;
    }

    public void setViewType(Integer viewType) {
        ViewType = viewType;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }
}
