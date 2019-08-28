package com.dtag.thaa.home_activity.teacheractivity.teacher_data;


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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class TeacherDataFragment extends Fragment {


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
    @BindView(R.id.reycycle_course)
    RecyclerView reycycleCourse;
    @BindView(R.id.add_course)
    Button addCourse;

    private LinearLayoutManager linearLayoutManager;
    private List<ModuleAdapterCourses> workList;
    private AdapterCourses adapterCourses;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.teacher_data, container, false);


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
        getAvailableTeacher();

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


    public void getAvailableTeacher() {
        workList = new ArrayList<>();

        workList.add(new ModuleAdapterCourses(1,"اللغة العربية", "10 ايام"," جدة")) ;
        workList.add(new ModuleAdapterCourses(1,"اللغة العربية", "10 ايام"," جدة")) ;

        workList.add(new ModuleAdapterCourses(1,"اللغة العربية", "10 ايام"," جدة")) ;



        adapterCourses = new AdapterCourses(getActivity(), workList, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

//                AvailableTeacherModuleData availableTeacherModuleData=availableList.get(position);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("avob", availableTeacherModuleData);
//
//                Navigation.findNavController(searchView).navigate(R.id.ctoconfirm,bundle);

                //Navigation.findNavController(getActivity(), R.id.ctoconfirm);


            }
        });


        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        reycycleCourse.setLayoutManager(linearLayoutManager);
        reycycleCourse.setAdapter(adapterCourses);


    }


}
