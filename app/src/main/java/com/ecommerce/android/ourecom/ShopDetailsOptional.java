package com.ecommerce.android.ourecom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ecommerce.android.ourecom.databinding.ActivityShopDetailsOptionalBinding;

public class ShopDetailsOptional extends AppCompatActivity {
    ActivityShopDetailsOptionalBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityShopDetailsOptionalBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
    }
}