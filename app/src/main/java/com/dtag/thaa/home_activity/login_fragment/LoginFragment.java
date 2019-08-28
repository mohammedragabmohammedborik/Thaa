package com.dtag.thaa.home_activity.login_fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.HomeAcitivity;
import com.google.android.material.textfield.TextInputEditText;
import com.rey.material.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class LoginFragment extends Fragment {


    @BindView(R.id.email_text)
    TextInputEditText emailText;
    @BindView(R.id.pass_text)
    TextInputEditText passText;
    @BindView(R.id.login_button)
    Button loginButton;
    @BindView(R.id.forget_password)
    TextView forgetPassword;
    @BindView(R.id.register)
    TextView register;

    Unbinder unbinder;

    TextView view;
    public int check=0;

    //implement navigation controller
    private NavController navController;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.login_activity, container, false);


        //fragmentManager = getActivity().getSupportFragmentManager();

        // getActivity().getWindow().setBackgroundDrawableResource(R.drawable.gridbg);

        // setHasOptionsMenu(true);
        // ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        unbinder = ButterKnife.bind(this, rootView);
//        navController = Navigation.findNavController(getActivity(), R.id.fragment);
//       // NavigationUI.setupActionBarWithNavController(getActivity(), navController);
//        NavigationUI.setupWithNavController(navController);

        emailText.getText().toString();


        //HomeAcitivity.textBarhome.setText("الدخول كمستخدم");

        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         view = getActivity().findViewById(R.id.text_barhome);

        view.setText("الدخول كمستخدم");
        check=0;


      //  loginButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tohome, null));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check==0){

                    Navigation.findNavController(view).navigate(R.id.tohome,null);


                }else {
                    Navigation.findNavController(view).navigate(R.id.toteacherhome,null);

                }
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check==0){

                    Navigation.findNavController(view).navigate(R.id.torgister,null);


                }else {
                    Navigation.findNavController(view).navigate(R.id.toregistertech,null);

                }
            }
        });

      //  register.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.torgister, null));


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

//
//    @OnClick(R.id.login_button)
//    public void onViewClicked() {
       // Toast.makeText(getActivity(),"press",Toast.LENGTH_LONG).show();
        //Navigation.createNavigateOnClickListener(R.id.tohome, null);

        //view.findNavController().navigate(R.id.go_to_step_one)


   // }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.check_register, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.user:
        //  Toast.makeText(getActivity(),"clicked",Toast.LENGTH_LONG)  .show();

                check=0;

                view.setText("الدخول كمستخدم");

                break;

            case R.id.teacher:
                //webView.reload();
                check=1;
                view.setText("الدخول كمعلم");

                //Toast.makeText(getActivity(),"no",Toast.LENGTH_LONG)  .show();

                break;
        }
        return true;

    }
}
