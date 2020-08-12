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
        //constraintLayout = new ConstraintLayout(this);
        constraintLayout = findViewById(R.id.lytCons);

        // Instantiate an ImageView and define its properties
        i = new ImageView(this);
        i.setImageResource(R.drawable.image1);
        i.setContentDescription(getResources().getString(R.string.my_image_desc));
        i.setId(R.id.image1);

        // set the ImageView bounds to match the Drawable's dimensions
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        // Add the ImageView to the layout and set the layout as the content view.




    }

    public void displayImage(View view){

        try {
            constraintLayout.addView(i);
            setContentView(constraintLayout);
            Button button = findViewById(R.id.btnShow);
            button.setText(R.string.txtBtnR);


        }catch (Exception e){
            View image = findViewById(R.id.image1);
            constraintLayout.removeView(image);
            Button button = findViewById(R.id.btnShow);
            button.setText(R.string.txtBtn);
        }

    }
}