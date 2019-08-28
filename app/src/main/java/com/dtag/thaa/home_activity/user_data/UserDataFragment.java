package com.dtag.thaa.home_activity.user_data;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import com.dtag.thaa.R;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class UserDataFragment extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.user_name_text)
    TextInputEditText userNameText;
    @BindView(R.id.id_text)
    TextInputEditText idText;
    @BindView(R.id.email_text)
    TextInputEditText emailText;
    @BindView(R.id.mobile_text)
    TextInputEditText mobileText;
    @BindView(R.id.text_city)
    TextView textCity;
    @BindView(R.id.city_id)
    AppCompatSpinner cityId;
    @BindView(R.id.text_village)
    TextView textVillage;
    @BindView(R.id.village_id)
    AppCompatSpinner villageId;
    @BindView(R.id.modify_data)
    Button modifyData;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.user_data, container, false);


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


//    @OnClick({R.id.button_reserve_exmainr, R.id.button_questionare})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.button_reserve_exmainr:
//                break;
//            case R.id.button_questionare:
//                break;
//        }
//    }
}
