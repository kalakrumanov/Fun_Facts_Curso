package com.example.kalak.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActibity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String TAG = FunFactsActibity.class.getSimpleName();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare our View variables and assign the Views from the layout file

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();

                //Enseño el contenido de ese array
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);

       // Toast.makeText(this,"Bien! El programa se ha creado! :) ",Toast.LENGTH_LONG).show();

        Log.d(TAG, "estoy en onCreat()");
    }
}
