package com.dtag.thaa.home_activity.confirmreserve;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.fragment.app.Fragment;

import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.availableteacher.AvailableTeacherModuleData;
import com.rey.material.app.DatePickerDialog;
import com.rey.material.app.Dialog;
import com.rey.material.app.DialogFragment;
import com.rey.material.app.TimePickerDialog;
import com.rey.material.widget.Button;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

public class ConfirmReserveFra extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.name_id)
    TextView nameId;
    @BindView(R.id.details_id)
    TextView detailsId;
    @BindView(R.id.rate_id)
    AppCompatRatingBar rateId;
    @BindView(R.id.available)
    RelativeLayout available;
    @BindView(R.id.const_text)
    TextView constText;
    @BindView(R.id.date_text)
    TextView dateText;
    @BindView(R.id.i_set_date)
    ImageView iSetDate;
    @BindView(R.id.frame_date)
    LinearLayout frameDate;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.time_text)
    TextView timeText;
    @BindView(R.id.i_set_time)
    ImageView iSetTime;
    @BindView(R.id.frame_time)
    LinearLayout frameTime;
    @BindView(R.id.confirm_button)
    Button confirmButton;
    private String fullDatet="";
    private  String timeTexts="";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.confirm_layout, container, false);


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

        AvailableTeacherModuleData  availableTeacherModuleData= (AvailableTeacherModuleData) getArguments().getSerializable("avob");

        Log.w("TAG",availableTeacherModuleData.getName()+" .. . . .. ");
        // to reserve  questionare

        //  buttonReserveExmainr.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.reserve_examine));

        //  to free question

        // buttonQuestionare.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.free_question));


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


    @OnClick({R.id.frame_date, R.id.frame_time, R.id.confirm_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.frame_date:
                setDate();
                break;
            case R.id.frame_time:
                setTime();
                break;
            case R.id.confirm_button:
                break;
        }
    }


    public void setDate(){

        Dialog.Builder builder = null;


        builder = new DatePickerDialog.Builder() {
            @Override
            public void onPositiveActionClicked(DialogFragment fragment) {
                DatePickerDialog dialog = (DatePickerDialog) fragment.getDialog();

                fullDatet = dialog.getFormattedDate(SimpleDateFormat.getDateInstance());
                dateText.setText(fullDatet);
                Toast.makeText(getActivity(), "Date is " + fullDatet, Toast.LENGTH_SHORT).show();
                super.onPositiveActionClicked(fragment);
            }

            @Override
            public void onNegativeActionClicked(DialogFragment fragment) {
                //    Toast.makeText(RequestServiceActivity.this, "Cancelled" , Toast.LENGTH_SHORT).show();
                super.onNegativeActionClicked(fragment);
            }
        };

        builder.positiveAction("موافق")
                .negativeAction("الغاء");

        DialogFragment fragment = DialogFragment.newInstance(builder);
        fragment.show(getActivity().getSupportFragmentManager(), null);




    }

    //  get a suitable time

    public void setTime(){


        Dialog.Builder builder = null;

        builder = new TimePickerDialog.Builder(6, 00) {
            @Override
            public void onPositiveActionClicked(DialogFragment fragment) {
                TimePickerDialog dialog = (TimePickerDialog) fragment.getDialog();
                timeTexts = dialog.getFormattedTime(SimpleDateFormat.getTimeInstance());
                timeText.setText(dialog.getFormattedTime(SimpleDateFormat.getTimeInstance()));
                //Toast.makeText(RequestServiceActivity.this, "Time is " + dialog.getFormattedTime(SimpleDateFormat.getTimeInstance()), Toast.LENGTH_SHORT).show();
                super.onPositiveActionClicked(fragment);
            }

            @Override
            public void onNegativeActionClicked(DialogFragment fragment) {
                //    Toast.makeText(RequestServiceActivity.this, "Cancelled" , Toast.LENGTH_SHORT).show();
                super.onNegativeActionClicked(fragment);
            }
        };

        builder.positiveAction("OK")
                .negativeAction("CANCEL");

        DialogFragment fragment = DialogFragment.newInstance(builder);
        fragment.show(getActivity().getSupportFragmentManager(), null);
    }
}
