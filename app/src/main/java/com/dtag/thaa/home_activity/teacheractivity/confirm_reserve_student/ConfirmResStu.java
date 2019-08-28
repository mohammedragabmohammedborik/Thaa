package com.dtag.thaa.home_activity.teacheractivity.confirm_reserve_student;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.teacheractivity.TeacherAcitvity;
import com.dtag.thaa.home_activity.teacheractivity.durationfragment.ModuleAdapterDuration;
import com.dtag.thaa.home_activity.userrequests.UserRequestAdapter;
import com.dtag.thaa.home_activity.userrequests.UserRequestModuleDataAdapter;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConfirmResStu extends AppCompatActivity {

    @BindView(R.id.text_barhome)
    TextView textBarhome;
    @BindView(R.id.toolbar2)
    Toolbar toolbar2;
    @BindView(R.id.c_value)
    TextView cValue;
    @BindView(R.id.user_name_text)
    TextInputEditText userNameText;
    @BindView(R.id.age_text)
    TextInputEditText ageText;
    @BindView(R.id.id_text)
    TextInputEditText idText;
    @BindView(R.id.closers_text)
    TextInputEditText closersText;
    @BindView(R.id.agestudy_text)
    TextInputEditText agestudyText;
    @BindView(R.id.school_name_text)
    TextInputEditText schoolNameText;
    @BindView(R.id.email_text)
    TextInputEditText emailText;
    @BindView(R.id.mobile_text)
    TextInputEditText mobileText;
    @BindView(R.id.c_value2)
    TextView cValue2;
    @BindView(R.id.reycycle_course)
    RecyclerView reycycleCourse;
    @BindView(R.id.add_course)
    Button addCourse;
    @BindView(R.id.confirm_button)
    Button confirmButton;

    private UserRequestAdapter userRequestAdapter;
    List<UserRequestModuleDataAdapter> requestList;


    private LinearLayoutManager linearLayoutManager;
    private List<ModuleAdapterDuration> workList;
    private AdapterConfirmFr adapterCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_reserve_student);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        textBarhome.setText("تاكيد الحجز ");
        getAvailableTeacher();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent=new Intent(ConfirmResStu.this, TeacherAcitvity.class);
                startActivity(intent);


        }
        return true;
    }

    public void getAvailableTeacher() {
        workList = new ArrayList<>();
        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));
        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));

        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));

        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));
        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));

        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));
        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));
        workList.add(new ModuleAdapterDuration(1, "22/12/2019", "10  am ", " 11 pm "));




        adapterCourses = new AdapterConfirmFr(ConfirmResStu.this, workList, new Onclicklistenerd() {
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


        linearLayoutManager = new LinearLayoutManager(ConfirmResStu.this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        reycycleCourse.setLayoutManager(linearLayoutManager);
        reycycleCourse.setAdapter(adapterCourses);


    }

}
