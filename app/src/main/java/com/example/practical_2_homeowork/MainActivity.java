package com.example.practical_2_homeowork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean chocosyrup = false;
    boolean sprinkles = false;
    boolean crushedNut = false;
    boolean cherries = false;
    boolean orioCC = false;
    public static String toppings = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckButtonClicked(View view) {
        boolean checked = ((CheckBox) view). isChecked();
        switch (view.getId()) {
            case R.id.chocolate_syrup:
                if (checked)
                    chocosyrup = true;
                else
                    chocosyrup= false;
                break;
            case R.id.sprinkles:
                if (checked)
                    sprinkles = true;
                else
                    sprinkles = false;
                break;
            case R.id.crushed_nuts:
                if (checked)
                    crushedNut = true;
                else
                    crushedNut = false;
                break;
            case R.id.cherries:
                if (checked)
                    cherries = true;
                else
                    cherries = false;
                break;
            case R.id.orio_cookie_crumbles:
                if (checked)
                    orioCC = true;
                else
                    orioCC = false;
                break;
        }
    }

    public void showToast(String toppings) {
        String none = "";

        if (chocosyrup) {
            toppings = toppings + " Chocolate syrup";
        }
        if (sprinkles) {
            toppings = toppings + " Sprinkles";
        }
        if (crushedNut) {
            toppings = toppings + " Crushed nuts";
        }
        if (cherries) {
            toppings = toppings + " Cherries";
        }
        if (orioCC) {
            toppings = toppings + " Orio cookie crumbles";
        }

        Toast toast = Toast.makeText(getApplicationContext(), toppings +" "+ none, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showMsg (View view) {
        showToast(toppings);
    }
}