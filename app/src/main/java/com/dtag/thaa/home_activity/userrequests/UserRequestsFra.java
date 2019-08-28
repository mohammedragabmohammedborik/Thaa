package com.dtag.thaa.home_activity.userrequests;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.availableteacher.AvailableTeacherAdapter;
import com.dtag.thaa.home_activity.availableteacher.AvailableTeacherModuleData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class UserRequestsFra extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.recycle_requests)
    RecyclerView recycleRequests;

    private  UserRequestAdapter userRequestAdapter;
    List<UserRequestModuleDataAdapter> requestList;

    LinearLayoutManager linearLayoutManager;



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


    public void intializeRequests(){
        requestList=new ArrayList<>();


        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","تم الانتهاء من الدورة",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","قيد الأنتظار",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","متاحة",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","تم الانتهاء من الدورة",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","قيد الأنتظار",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","تم الانتهاء من الدورة",1));
        requestList.add(new UserRequestModuleDataAdapter("دورة اللغة العربية مع الأستاذ أحمد محمد","متاحة",1));


        userRequestAdapter=new UserRequestAdapter(getActivity(), requestList, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

                UserRequestModuleDataAdapter availableTeacherModuleData=requestList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("avob", availableTeacherModuleData);

               // Navigation.findNavController(recycleRequests).navigate(R.id.ctoconfirm,bundle);

                //Navigation.findNavController(getActivity(), R.id.ctoconfirm);


            }
        });


        linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycleRequests.setLayoutManager(linearLayoutManager);
        recycleRequests.setAdapter(userRequestAdapter);



    }






}
