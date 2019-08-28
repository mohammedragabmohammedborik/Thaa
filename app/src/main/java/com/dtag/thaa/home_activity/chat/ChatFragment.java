package com.dtag.thaa.home_activity.chat;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ChatFragment extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.reycler_chat)
    RecyclerView reyclerChat;
    @BindView(R.id.edittext_chat)
    EditText edittextChat;
    @BindView(R.id.button_chat_send2)
    TextView buttonChatSend2;
    @BindView(R.id.layout_chat_chatbox)
    LinearLayout layoutChatChatbox;


    //  private CustomSpinnerAdapter spinnerCityAdapter, spinnerVillageAdapter;

    // private RecyclerView availablereycycle;
    private ChatAdapter availableTeacherAdapter;
    private List<ChatMessage> availableList;

    LinearLayoutManager linearLayoutManager;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.chat_message, container, false);

        unbinder = ButterKnife.bind(this, rootView);

        int freeQ=getArguments().getInt("freeq");
        Log.w("TAG",freeQ+"....  ");


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


    public void getAvailableTeacher() {
        availableList = new ArrayList<>();
        availableList.add(new ChatMessage("", "22:30", "22/10/2018", 1, "mohammed", "السلام عليكم "));


        availableList.add(new ChatMessage("member", "22:30", "22/10/2018", 1, "mohammed", "السلام عليكم "));

        availableList.add(new ChatMessage("", "22:30", "22/10/2018", 1, "mohammed", "السلام عليكم "));
        availableList.add(new ChatMessage("member", "22:30", "22/10/2018", 1, "mohammed", "السلام عليكم "));

        availableList.add(new ChatMessage("", "22:30", "22/10/2018", 1, "mohammed", "السلام عليكم "));


        availableTeacherAdapter = new ChatAdapter(getActivity(), availableList, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

                //   AvailableTeacherModuleData availableTeacherModuleData=availableList.get(position);
                //Bundle bundle = new Bundle();
                //bundle.putSerializable("avob", availableTeacherModuleData);

                // Navigation.findNavController(searchView).navigate(R.id.ctoconfirm,bundle);

                //Navigation.findNavController(getActivity(), R.id.ctoconfirm);


            }
        });


        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        reyclerChat.setLayoutManager(linearLayoutManager);
        reyclerChat.setAdapter(availableTeacherAdapter);


    }


}
