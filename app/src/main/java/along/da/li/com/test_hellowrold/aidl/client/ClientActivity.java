package along.da.li.com.test_hellowrold.aidl.client;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

import along.da.li.com.test_hellowrold.R;
import along.da.li.com.test_hellowrold.aidl.ICalcAIDL;

/**
 * Created by Administrator on 2016/11/16.
 */
public class ClientActivity extends Activity {

    private ICalcAIDL mCalcAidl;

    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mCalcAidl = ICalcAIDL.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mCalcAidl = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidl);
    }

    public void bindService(View view) {
        Intent intent = new Intent();
        intent.setAction("com.sanji.li.calc");
        intent.setPackage(getPackageName());
        bindService(intent,mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    public void unbindService(View view) {
        unbindService(mServiceConnection);
    }

    public void addInvoked(View view) throws Exception {
        if (mCalcAidl != null) {
            int addRes = mCalcAidl.add(12, 12);
            Toast.makeText(this, addRes + "", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "服务器被异常杀死，请重新绑定服务端", Toast.LENGTH_SHORT)
                    .show();

        }
    }

    public void minInvoked(View view) throws Exception {
        if (mCalcAidl != null) {
            int addRes = mCalcAidl.min(50, 12);
            Toast.makeText(this, addRes + "", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "服务端未绑定或被异常杀死，请重新绑定服务端", Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
