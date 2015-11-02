package com.example.android.bluetoothlegatt;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class IndexActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onClickBtn1(View view) {
        Intent intent = new Intent(this, DeviceScanActivity.class);
        startActivity(intent);

    }
    public void onClickBtn2(View view) {
        Intent intent = new Intent(this, DeviceIBeaconScanActivity.class);
        startActivity(intent);

    }
    public void onClickBtn3(View view) {
        Intent intent = new Intent(this, DeviceEddystoneScanActivity.class);
        startActivity(intent);

    }
    public void onClickBtn4(View view) {
        Intent intent = new Intent(this, DeviceOthersScanActivity.class);
        startActivity(intent);

    }
}
