package along.da.li.com.test_hellowrold;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import android.widget.Button;


import along.da.li.com.test_hellowrold.activity.ActivityA;
import along.da.li.com.test_hellowrold.aidl.client.ClientActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(this);
        Button aidlButton = (Button) findViewById(R.id.button_aidl);
	//test
	aidlButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.button:
                intent = new Intent(MainActivity.this, ActivityA.class);
                startActivity(intent);
                break;
            case R.id.button_aidl:
                intent = new Intent(MainActivity.this, ClientActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
