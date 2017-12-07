package com.liandongfenqi.tongniu.appbartablayoutviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  initView();
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(FragmentPopularity.newInstance(), "45");//添加Fragment
        viewPagerAdapter.addFragment(FragmentNewProduct.newInstance(), "61");
        viewPagerAdapter.addFragment(FragmentSecondsOpen.newInstance(), "645");
        mViewPager.setAdapter(viewPagerAdapter);//设置适配器

        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("45"));//给TabLayout添加Tab
        mTabLayout.addTab(mTabLayout.newTab().setText("61"));
        mTabLayout.addTab(mTabLayout.newTab().setText("645"));
        mTabLayout.setupWithViewPager(mViewPager);//给TabLayout设置关联ViewPager，如果设置了ViewPager，那么ViewPagerAdapter中的getPageTitle()方法返回的就是Tab上的标题

    }
}
