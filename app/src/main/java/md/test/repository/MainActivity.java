package md.test.repository;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import md.test.toasterlibrary.ToasterMessage;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage a = new ToasterMessage();
        a.sEncript(this);
    }
}
