package com.dtag.thaa.home_activity.availableteacher;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.CustomSpinnerAdapter;
import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class AvailbleTeacher extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.search_view)
    SearchView searchView;
    @BindView(R.id.search_place)
    ImageView searchPlace;
    @BindView(R.id.recycle)
    RecyclerView recycle;

  //  private CustomSpinnerAdapter spinnerCityAdapter, spinnerVillageAdapter;

   // private RecyclerView availablereycycle;
    private AvailableTeacherAdapter availableTeacherAdapter;
    private List<AvailableTeacherModuleData> availableList;

    LinearLayoutManager linearLayoutManager;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.available_teacher, container, false);

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
//        if (difficultLearning.isChecked()) {
//
//        }
        //intializeSpinner();

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



    public void getAvailableTeacher(){
        availableList=new ArrayList<>();
        availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));

        availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));
        availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));



        availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));

    availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                                                             "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));
        availableList.add(new AvailableTeacherModuleData("https://www.wcasd.net/cms/lib/PA02203541/Centricity/Domain/1044/RHGraduationEdited.jpg",
                "م عبدالله احمد ","استاذ العلوم  الفيزيقية والهندسة الوراثية " ,1,3));



        availableTeacherAdapter=new AvailableTeacherAdapter(getActivity(), availableList, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

                AvailableTeacherModuleData availableTeacherModuleData=availableList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("avob", availableTeacherModuleData);

                Navigation.findNavController(searchView).navigate(R.id.ctoconfirm,bundle);

                //Navigation.findNavController(getActivity(), R.id.ctoconfirm);


            }
        });


        linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(availableTeacherAdapter);



    }











}
