package com.example.hp.videonews;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.text)TextView textView;
    @BindViews({R.id.textView,R.id.textView2})List<TextView> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ButterKnife.bind(this);
        textView.setText("0000");
                                     ButterKnife.apply(list, new ButterKnife.Action<TextView>() {
            @Override
            public void apply(@NonNull TextView view, int index) {
                switch (index){
                    case 0:
                        view.setText("1111");
                        break;
                    case 1:
                        view.setText("2222");
                        break;
                }
            }
        });
    }

    @OnClick(R.id.textView)
    public void add(){

    }
}
