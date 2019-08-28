package com.dtag.thaa.home_activity.teacheractivity.durationfragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.teacheractivity.teacher_data.AdapterCourses;
import com.dtag.thaa.home_activity.teacheractivity.teacher_data.ModuleAdapterCourses;
import com.dtag.thaa.home_activity.userrequests.UserRequestAdapter;
import com.dtag.thaa.home_activity.userrequests.UserRequestModuleDataAdapter;
import com.rey.material.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DurationFra extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.reycycle_course)
    RecyclerView reycycleCourse;
    @BindView(R.id.add_course)
    Button addCourse;


    private UserRequestAdapter userRequestAdapter;
    List<UserRequestModuleDataAdapter> requestList;


    private LinearLayoutManager linearLayoutManager;
    private List<ModuleAdapterDuration> workList;
    private AdapterDuration adapterCourses;



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_duration, container, false);


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


    public void getAvailableTeacher() {
        workList = new ArrayList<>();
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;






        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;


        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;
        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;

        workList.add(new ModuleAdapterDuration(1,"22/12/2019", "10  am "," 11 pm ")) ;



        adapterCourses = new AdapterDuration(getActivity(), workList, new Onclicklistenerd() {
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
