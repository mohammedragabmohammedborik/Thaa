package com.dtag.thaa.home_activity.registerfragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import com.dtag.thaa.CustomSpinnerAdapter;
import com.dtag.thaa.R;
import com.dtag.thaa.SpinnerModule;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;
import com.rey.material.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class RegisterFragment extends Fragment {


    List<SpinnerModule> cityList, villageList;
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
    @BindView(R.id.pass_text)
    TextInputEditText passText;
    @BindView(R.id.confirm_pass_text)
    TextInputEditText confirmPassText;
    @BindView(R.id.login_button)
    Button loginButton;

    Unbinder unbinder;


    private CustomSpinnerAdapter spinnerCityAdapter, spinnerVillageAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.register_data, container, false);

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

        intializeSpinner();

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


    public void intializeSpinner() {
        cityList = new ArrayList<>();
        villageList = new ArrayList<>();
        cityList.add(new SpinnerModule(1, "مكة"));
        cityList.add(new SpinnerModule(1, "المدينة"));
        cityList.add(new SpinnerModule(1, "الرياض"));

        villageList.add(new SpinnerModule(1, "الحي1"));
        villageList.add(new SpinnerModule(1, "الحي2"));
        villageList.add(new SpinnerModule(1, "الحي"));

        spinnerCityAdapter = new CustomSpinnerAdapter(getActivity(), cityList);
        spinnerVillageAdapter = new CustomSpinnerAdapter(getActivity(), villageList);

        cityId.setAdapter(spinnerCityAdapter);
        villageId.setAdapter(spinnerVillageAdapter);
         cityId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });
        villageId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @OnClick(R.id.login_button)
    public void onViewClicked() {

    }
}
