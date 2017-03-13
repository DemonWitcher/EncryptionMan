package com.witcher.encryptionman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.witcher.encryptionmanlib.EncryptionManagerByJava;
import com.witcher.encryptionmanlib.L;

public class MainActivity extends AppCompatActivity {

    TextView mTvAes;
    EditText mEtAes;
    Button mBtEncryptAes, mBtDecryptAes;

    TextView mTvMd5;
    EditText mEtMd5;
    Button mBtMd5;

    TextView mTvBase64;
    EditText mEtBase64;
    Button mBtEncryptBase64, mBtDecryptBase64;

    TextView mTvRsa;
    EditText mEtRsa;
    Button mBtEncryptRsa, mBtDecryptRsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAesView();
        initMd5View();
        initBase64View();
        initRSAView();
    }
    private void initAesView() {
        mBtEncryptAes = (Button) findViewById(R.id.bt_encryptAes);
        mBtDecryptAes = (Button) findViewById(R.id.bt_decryptAes);
        mTvAes = (TextView) findViewById(R.id.tv_aes);
        mEtAes = (EditText) findViewById(R.id.et_aes);

        mBtEncryptAes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                L.i("原文:"+mEtAes.getText().toString());
                try {
                    mTvAes.setText(EncryptionManagerByJava.encryptAes(mEtAes.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java AES 加密后:"+ mTvAes.getText().toString());
            }
        });
        mBtDecryptAes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mTvAes.setText(EncryptionManagerByJava.decryptAes(mTvAes.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java AES 解密后:"+ mTvAes.getText().toString());
            }
        });
    }

    private void initMd5View(){
        mBtMd5 = (Button) findViewById(R.id.bt_md5);
        mTvMd5 = (TextView) findViewById(R.id.tv_md5);
        mEtMd5 = (EditText) findViewById(R.id.et_md5);

        mBtMd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                L.i("原文:"+mEtMd5.getText().toString());
                try {
                    mTvMd5.setText(EncryptionManagerByJava.md5(mEtMd5.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java MD5 加密后:"+ mTvMd5.getText().toString());
            }
        });
    }
    private void initBase64View() {
        mBtEncryptBase64 = (Button) findViewById(R.id.bt_encryptbase64);
        mBtDecryptBase64 = (Button) findViewById(R.id.bt_decryptbase64);
        mTvBase64 = (TextView) findViewById(R.id.tv_base64);
        mEtBase64 = (EditText) findViewById(R.id.et_base64);

        mBtEncryptBase64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                L.i("原文:"+mEtBase64.getText().toString());
                try {
                    mTvBase64.setText(EncryptionManagerByJava.encryptBase64(mEtBase64.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java base64 编码后:"+ mTvBase64.getText().toString());
            }
        });
        mBtDecryptBase64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mTvBase64.setText(EncryptionManagerByJava.decryptBase64(mTvBase64.getText().toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java base64 解码后:"+ mTvBase64.getText().toString());
            }
        });
    }
    byte[] encodeData = null;
    private void initRSAView() {
        mBtEncryptRsa = (Button) findViewById(R.id.bt_encryptrsa);
        mBtDecryptRsa = (Button) findViewById(R.id.bt_decryptrsa);
        mTvRsa = (TextView) findViewById(R.id.tv_rsa);
        mEtRsa = (EditText) findViewById(R.id.et_rsa);

        mBtEncryptRsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                L.i("原文:"+mEtRsa.getText().toString());
                try {
                    encodeData = EncryptionManagerByJava.encryptRsaPrivate(mEtRsa.getText().toString());
                    mTvRsa.setText(new String(encodeData));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java rsa 编码后:"+ mTvRsa.getText().toString());
            }
        });
        mBtDecryptRsa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(encodeData == null){
                    Toast.makeText(MainActivity.this,"请先加密",Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    mTvRsa.setText(EncryptionManagerByJava.decryptRsaPublic(encodeData));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                L.i("java rsa 解码后:"+ mTvRsa.getText().toString());
            }
        });
    }
}
