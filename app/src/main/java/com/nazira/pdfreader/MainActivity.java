package com.nazira.pdfreader;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;
    LottieAnimationView myLottie;

    public static String assetName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        myLottie = findViewById(R.id.myLottie);

        pdfView.setVisibility(View.INVISIBLE);
        myLottie.setVisibility(View.VISIBLE);

        pdfView.fromAsset(assetName)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        pdfView.setVisibility(View.VISIBLE);
                        myLottie.setVisibility(View.GONE);

                        //Toast.makeText(MainActivity.this,"Loaded", Toast.LENGTH_LONG).show();
                    }
                })
                .load();

    }
}