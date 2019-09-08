package com.dtag.thaa.home_activity.user_profile;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.change_password.ChangeUserPass;
import com.dtag.thaa.home_activity.user_data.UserDataFragment;
import com.dtag.thaa.home_activity.userrequests.UserRequestsFra;
import com.google.android.material.tabs.TabLayout;
import com.rey.material.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserProfile extends Fragment {

    Unbinder unbinder;
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
    @BindView(R.id.mobile_id)
    TextView mobileId;
    @BindView(R.id.tabLayout5)
    TabLayout tabLayout5;
    @BindView(R.id.fr)
    android.widget.FrameLayout fr;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    TextView view;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_user_profile, container, false);


        unbinder = ButterKnife.bind(this, rootView);

        //fragmentManager = getActivity().getSupportFragmentManager();

        // getActivity().getWindow().setBackgroundDrawableResource(R.drawable.gridbg);

        // setHasOptionsMenu(true);
        // ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupViewPager(viewpager);

        view = getActivity().findViewById(R.id.text_barhome);
        tabLayout5.setupWithViewPager(viewpager);

        view.setText("الملف الشخصي");
        // to reserve  questionare

//        buttonReserveExmainr.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.reserve_examine));
//
//        //  to free question
//
//        buttonQuestionare.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.free_question));


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()){
//
//            case android.R.id.home:
//                onBackPressed();
//
//        }
//        return true;
//
//
//    }


    @Override
    public void onStart() {
        super.onStart();
        // EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        //EventBus.getDefault().unregister(this);
    }




    @OnClick({R.id.profile_image, R.id.edit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.profile_image:
                break;
            case R.id.edit:
                break;
        }
    }


    // pager adapter

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
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFrag(new UserDataFragment(), "البيانات");
        adapter.addFrag(new UserRequestsFra(), "قائمة الطلبات");
        adapter.addFrag(new ChangeUserPass(), "كلمة المرور");

        viewPager.setAdapter(adapter);

    }
}
