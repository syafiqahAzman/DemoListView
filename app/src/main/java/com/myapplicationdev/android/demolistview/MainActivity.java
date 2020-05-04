package com.myapplicationdev.android.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.lvFood);

        //Create a few food objects in Food Array
        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee", false));
        food.add(new Food("Mcdonalds", true));
        food.add(new Food("4Fingers", true));

        //Link this activity object, the row.xml layout for
        //each row and the food string array together
        aa = new FoodAdapter(this, R.layout.row, food);
        lv.setAdapter(aa);
    }
}
