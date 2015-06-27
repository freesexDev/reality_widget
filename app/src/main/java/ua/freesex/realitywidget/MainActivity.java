package ua.freesex.realitywidget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar t = (Toolbar) findViewById(R.id.MainToolbar);
        t.setTitle(R.string.app_name);
    }

    public void showPopUp(View v) {
        Intent i = new Intent(MainActivity.this, ChooseActivity.class);
        startActivity(i);
    }
}
