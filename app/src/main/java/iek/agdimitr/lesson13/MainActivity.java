package iek.agdimitr.lesson13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPoints(View a){
        points++;
        Log.d("rightbutton", ""+points);
    }

    public void removePoints(View a){
        points--;
        Log.d("leftbutton", ""+points);
    }
}