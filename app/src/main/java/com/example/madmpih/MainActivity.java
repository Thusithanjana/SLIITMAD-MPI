package com.example.madmpih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a ConstraintLayout in which to add the ImageView
        //3. Exercise point

        // Instantiate an ImageView and define its properties
        //4. Exercise point



        // set the ImageView bounds to match the Drawable's dimensions
        //5. Exercise point


        // Add the ImageView to the layout and set the layout as the content view.
    }

    public void displayImage(View view){
        //6. Exercise point


    }
}