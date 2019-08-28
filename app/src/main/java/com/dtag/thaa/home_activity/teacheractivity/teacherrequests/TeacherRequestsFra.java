package com.dtag.thaa.home_activity.teacheractivity.teacherrequests;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.teacheractivity.confirm_reserve_student.ConfirmInterface;
import com.dtag.thaa.home_activity.teacheractivity.confirm_reserve_student.ConfirmResStu;
import com.dtag.thaa.home_activity.teacheractivity.confirm_reserve_student.ConfirmReserveStudent;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class TeacherRequestsFra extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.recycle_requests)
    RecyclerView recycleRequests;
    @BindView(R.id.sliderviewpager)
    FrameLayout sliderviewpager;

    private TeacherRequestAdapter userRequestAdapter;
    List<TeacherRequestModuleDataAdapter> requestList;

    GridLayoutManager gridLayoutManager;

    FragmentManager fragmentManager;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.user_requests, container, false);


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

        intializeRequests();
        sliderviewpager.setVisibility(View.GONE);

        fragmentManager = getActivity().getSupportFragmentManager();

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


    public void intializeRequests() {
        requestList = new ArrayList<>();


        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "جاري", 1));
        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "تمت", 1));

        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "جديدة", 1));
        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "جاري", 1));
        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "جاري", 1));
        requestList.add(new TeacherRequestModuleDataAdapter("محمد", "اللغة العربية ....", "جاري", 1));


        userRequestAdapter = new TeacherRequestAdapter(getActivity(), requestList, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

                TeacherRequestModuleDataAdapter availableTeacherModuleData = requestList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("avob", availableTeacherModuleData);

                // Navigation.findNavController(recycleRequests).navigate(R.id.ctoconfirm,bundle);

                //Navigation.findNavController(getActivity(), R.id.ctoconfirm);


            }
        }, new ConfirmInterface() {
            @Override
            public void confirmit(int position) {
            //    Navigation.findNavController(recycleRequests).navigate(R.id.torgister, null);

//                sliderviewpager.setVisibility(View.VISIBLE);
//
//                Fragment homeFragment2 = new ConfirmReserveStudent();

//                fragmentManager.beginTransaction().replace(R.id.sliderviewpager, homeFragment2).commit();

                Intent intent=new Intent(getActivity(), ConfirmResStu.class);
                startActivity(intent);


            }
        });


        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycleRequests.setLayoutManager(gridLayoutManager);
        recycleRequests.setAdapter(userRequestAdapter);


    }


}
