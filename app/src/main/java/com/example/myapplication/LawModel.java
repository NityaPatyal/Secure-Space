package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class LawModel {
    String lawString, lawDescription;

    public LawModel(String lawString, String lawDescription) {
        this.lawString = lawString;
        this.lawDescription = lawDescription;
    }

    public LawModel() {
    }

    public String getLawString() {
        return lawString;
    }

    public void setLawString(String lawString) {
        this.lawString = lawString;
    }

    public String getLawDescription() {
        return lawDescription;
    }

    public void setLawDescription(String lawDescription) {
        this.lawDescription = lawDescription;
    }
}