package in.ponshere.progaurdforlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.ponshere.sample_library.NonObfuscated;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NonObfuscated.publicApi();

    }
}
