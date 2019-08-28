package com.dtag.thaa.home_activity.teacheractivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.HomeAcitivity;
import com.dtag.thaa.home_activity.change_password.ChangeUserPass;
import com.dtag.thaa.home_activity.teacheractivity.durationfragment.DurationFra;
import com.dtag.thaa.home_activity.teacheractivity.teacher_data.TeacherDataFragment;
import com.dtag.thaa.home_activity.teacheractivity.teacherrequests.TeacherRequestsFra;
import com.dtag.thaa.home_activity.user_data.UserDataFragment;
import com.dtag.thaa.home_activity.userrequests.UserRequestsFra;
import com.google.android.material.tabs.TabLayout;
import com.rey.material.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class TeacherAcitvity extends AppCompatActivity {

    @BindView(R.id.imageView6)
    FrameLayout imageView6;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.edit)
    ImageView edit;
    @BindView(R.id.relative_image)
    RelativeLayout relativeImage;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.details_id)
    TextView detailsId;
    @BindView(R.id.mobile_id)
    TextView mobileId;
    @BindView(R.id.tabLayout5)
    TabLayout tabLayout5;
    @BindView(R.id.fr)
    android.widget.FrameLayout fr;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.text_barhome)
    TextView textBarhome;
    @BindView(R.id.toolbar2)
    Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_acitvity);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        textBarhome.setText("الملف الشخصي ");

        setupViewPager(viewpager);
        tabLayout5.setupWithViewPager(viewpager);
    }

    @OnClick({R.id.imageView6, R.id.profile_image})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView6:
                break;
            case R.id.profile_image:
                break;
        }
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
            //super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // return null to display only the icon
            return mFragmentTitleList.get(position);
        }


    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new TeacherDataFragment(), "البيانات");
        adapter.addFrag(new TeacherRequestsFra(), "قائمة الطلبات");
        adapter.addFrag(new DurationFra(), "المواعيد");
        adapter.addFrag(new ChangeUserPass(), "كلمة المرور");



        viewPager.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

         switch (item.getItemId()){
             case android.R.id.home:
                 Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                 homeIntent.addCategory(Intent.CATEGORY_HOME);
                 homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                 startActivity(homeIntent);

             case R.id.log_out:
                 Intent intent1 = new Intent(TeacherAcitvity.this, HomeAcitivity.class);
                 intent1.putExtra("ho",240);
                 startActivity(intent1);
                 finish();


         }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.logout, menu);

        return true;

    }

    }
