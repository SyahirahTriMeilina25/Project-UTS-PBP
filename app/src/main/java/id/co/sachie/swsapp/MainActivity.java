package id.co.sachie.swsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pgr;
    private PagerAdapter pagerAdapter;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgr = findViewById(R.id.Pagers);

        btnNext = findViewById(R.id.btnNxt);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(intent);
            }

        });

        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());

        pgr = findViewById(R.id.Pagers);
        pagerAdapter = new Slidepager(getSupportFragmentManager(),list);

        pgr.setAdapter(pagerAdapter);
    }
}