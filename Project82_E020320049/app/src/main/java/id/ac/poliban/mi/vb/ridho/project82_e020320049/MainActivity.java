package id.ac.poliban.mi.vb.ridho.project82_e020320049;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.ac.poliban.mi.vb.ridho.project82_e020320049.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        if (getSupportActionBar()!=null)getSupportActionBar().setTitle("Ridho - Project82_E020320049");
    }
}