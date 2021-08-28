package com.ecommerce.android.ourecom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.ecommerce.android.ourecom.databinding.ActivityShopDetailsBinding;

public class ShopDetails extends AppCompatActivity {
    ActivityShopDetailsBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityShopDetailsBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        setTitle("Shop Details");
        buttonHandler();
        setupHideErrorForEditText();
    }

    private void checkDetails() {
        String input = b.ContactNo.getEditText().getText().toString().trim();
        if (input.isEmpty()) {
            b.ContactNo.setError("Please Enter Something!");
            return;
        }
        String name = b.OwnerName.getEditText().getText().toString().trim();
        if (name.isEmpty()) {
            b.OwnerName.setError("Please Enter Something!");
            return;
        }
        String shopName = b.ShopName.getEditText().getText().toString().trim();
        if (shopName.isEmpty()) {
            b.ShopName.setError("Please Enter Something!");
            return;
        }
        String shopType = b.ShopType.getEditText().getText().toString().trim();
        if (shopType.isEmpty()) {
            b.ShopType.setError("Please Enter Something!");
            return;
        }
        String address = b.ShopAddress.getEditText().getText().toString().trim();
        if (address.isEmpty()) {
            b.ShopAddress.setError("Please Enter Something!");
            return;
        }
        String openTime = b.ShopOpeningTime.getEditText().getText().toString().trim();
        if (openTime.isEmpty()) {
            b.ShopOpeningTime.setError("Please Enter Something!");
            return;
        }
        String closeTime = b.ShopClosingTime.getEditText().getText().toString().trim();
        if (closeTime.isEmpty()) {
            b.ShopClosingTime.setError("Please Enter Something!");
            return;
        }
    }

    private void buttonHandler() {
        b.NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDetails();
                Intent intent = new Intent(ShopDetails.this, ShopDetailsOptional.class);
                startActivity(intent);
            }
        });
    }
    private void setupHideErrorForEditText() {
        TextWatcher myTextWatcher =  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hideError();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        b.ShopClosingTime.getEditText().addTextChangedListener(myTextWatcher);
        b.ShopType.getEditText().addTextChangedListener(myTextWatcher);
        b.ShopOpeningTime.getEditText().addTextChangedListener(myTextWatcher);
        b.ShopName.getEditText().addTextChangedListener(myTextWatcher);
        b.OwnerName.getEditText().addTextChangedListener(myTextWatcher);
        b.ContactNo.getEditText().addTextChangedListener(myTextWatcher);
        b.ShopAddress.getEditText().addTextChangedListener(myTextWatcher);
    }

    private void hideError() {
        b.ShopClosingTime.setError(null);
        b.ShopType.setError(null);
        b.ShopOpeningTime.setError(null);
        b.ShopName.setError(null);
        b.OwnerName.setError(null);
        b.ContactNo.setError(null);
        b.ShopAddress.setError(null);
    }
}

