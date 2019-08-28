package com.dtag.thaa.home_activity.free_questionare;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.dtag.thaa.CustomSpinnerAdapter;
import com.dtag.thaa.R;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class FreeQuestionare extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.difficult_learning)
    RadioButton difficultLearning;
    @BindView(R.id.speech_disorders)
    RadioButton speechDisorders;
    @BindView(R.id.user_name_text)
    TextInputEditText userNameText;
    @BindView(R.id.age_text)
    TextInputEditText ageText;
    @BindView(R.id.send_free_question)
    Button sendFreeQuestion;

    TextView view;


    private CustomSpinnerAdapter spinnerCityAdapter, spinnerVillageAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.free_questionare, container, false);

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


        view = getActivity().findViewById(R.id.text_barhome);

        view.setText("استشارة مجانية");

       if( difficultLearning.isChecked()){

       }
        //intializeSpinner();

        sendFreeQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("freeq", 2);

                Navigation.findNavController(view).navigate(R.id.chatmessage,bundle);
            }
        });

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


    @OnClick({R.id.difficult_learning, R.id.speech_disorders})
    public void onViewClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.difficult_learning:
                if(checked)

                break;
            case R.id.speech_disorders:
                if(checked)

                    break;
        }
    }
}
