package com.example.shmul.ble_v4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // GUI Variables
    Button startScanButton, stopScanButton, connectBLE, sendData;
    TextView devicesView, peripheralTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // GUI items initiation
        startScanButton = findViewById(R.id.StartScanButton);
        stopScanButton = findViewById(R.id.StopScanButton);
        connectBLE = findViewById(R.id.ConnectBLE);
        sendData = findViewById(R.id.SendData);
        devicesView = findViewById(R.id.DevicesView);
        peripheralTextView = findViewById(R.id.PeripheralTextView);
        peripheralTextView.setMovementMethod(new ScrollingMovementMethod());

        startScanButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                peripheralTextView.append("startScanButton\n");
            }
        });

        stopScanButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                peripheralTextView.append("stopScanButton\n");
            }
        });

        connectBLE.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                peripheralTextView.append("connectBLE\n");
            }
        });

        sendData.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                peripheralTextView.append("sendData\n");
            }
        });
    }
}
