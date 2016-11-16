package along.da.li.com.test_hellowrold.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import along.da.li.com.test_hellowrold.R;

/**
 * Created by Administrator on 2016/11/16.
 */
public class ActivityA extends Activity implements View.OnClickListener {

    private static final String TAG = "sanji___Activity_A";
    FragmentA fragmentA;
    FragmentC fragmentC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        fragmentA = new FragmentA();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.content_a, fragmentA);
        fragmentTransaction.commit();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.button1:
                Intent intent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intent);
                break;
            case R.id.button2:
                if(fragmentA == null) {
                    fragmentA = new FragmentA();
                }
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.content_a, fragmentA);
                fragmentTransaction.commit();
                break;
            case R.id.button3:
                if(fragmentC == null) {
                    fragmentC = new FragmentC();
                }
                FragmentManager fm2 = getFragmentManager();
                FragmentTransaction fragmentTransaction2 = fm2.beginTransaction();
                fragmentTransaction2.replace(R.id.content_a, fragmentC);
                fragmentTransaction2.commit();
                break;
            default:
                break;
        }
    }
}
