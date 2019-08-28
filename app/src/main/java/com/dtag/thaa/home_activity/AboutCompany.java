package com.dtag.thaa.home_activity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dtag.thaa.R;
import com.wang.avi.AVLoadingIndicatorView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class AboutCompany extends Fragment {


//    @BindView(R.id.logo1)
//    ImageView logo1;

    Unbinder unbinder;
    @BindView(R.id.avi)
    AVLoadingIndicatorView avi;
    @BindView(R.id.about_company)
    TextView aboutCompany;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // here we can remove item in tool  bar
        //setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.about_company, container, false);


        // getActivity().getWindow().setBackgroundDrawableResource(R.drawable.background_splash);

        // getActivity().getWindow().setBackgroundDrawableResource(R.drawable.background_splash);


        unbinder = ButterKnife.bind(this, rootView);

        aboutCompany.setText("الك العديد من الأنواع المتوفرة لنصوص لوريم إيبسوم، ولكن الغالبية تم تعديلها بشكل ما عبر إدخال بعض النوادر أو الكلمات العشوائية إلى النص. إن كنت تريد أن تستخدم نص لوريم إيبسوم ما، عليك أن تتحقق أولاً أن ليس هناك أي كلمات أو عبارات محرجة أو غير لائقة مخبأة في هذا النص. بينما تعمل جميع مولّدات نصوص لوريم إيبسوم على الإنترنت على إعادة تكرار مقاطع من نص لوريم إيبسوم نفسه عدة مرات بما تتطلبه الحاجة، يقوم مولّدنا هذا باستخدام كلمات من قاموس يحوي على أكثر من 200 كلمة لا تينية، مضاف إليها مجموعة منالجمل النموذجية، لتكوين نص لوريم إيبسوم ذو شكل منطقي قريب إلى النص الحقيقي. وبالتالي يكون النص الناتح خالي من التكرار، أو أي كلمات أو عبارات غير لائقة أو ما شابه. وهذا ما يجعله أول مولّد نص لوريم إيبسوم حقيقي على الإنترنت الكالعديد من الأنواع المتوفرة لنصوص لوريم إيبسوم، ولكن الغالبية تم تعديلها بشكل ما عبر إدخال بعض النوادر أو الكلمات العشوائية إلى النص. إن كنت تريد أن تستخدم نص لوريم إيبسوم ما، عليك أن تتحقق أولاً أن ليس هناك أي كلمات أو عبارات محرجة أو غير لائقة مخبأة في هذا النص. بينما تعمل جميع مولّدات نصوص لوريم إيبسوم على الإنترنت على إعادة تكرار مقاطع من نص لوريم إيبسوم نفسه عدة مرات بما تتطلبه الحاجة، يقوم مولّدنا هذا باستخدام كلمات من قاموس يحوي على أكثر من 200 كلمة لا تينية، مضاف إليها مجموعة منالجمل النموذجية، لتكوين نص لوريم إيبسوم ذو شكل منطقي قريب إلى النص الحقيقي. وبالتالي يكون النص الناتح خالي من التكرار، أو أي كلمات أو عبارات غير لائقة أو ما شابه. وهذا ما يجعله أول مولّد نص لوريم إيبسوم حقيقي على الإنترنت..");


        //getRemind("about", SharedHelper.getKey(getActivity(),"token"));

        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }

//    @OnClick({R.id.sliderviewpager, R.id.indicator, R.id.all_product, R.id.new_product})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.sliderviewpager:
//                break;
//            case R.id.indicator:
//                break;
//            case  R.id.all_product:
//                Intent intent1=new Intent(getActivity(),AllProducts.class);
//                startActivity(intent1);
//                getActivity().finish();
//        }
//    }


    @Override
    public void onResume() {
        super.onResume();
        //  ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        //  ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }


//    public void getRemind(String type, String token) {
//
//        avi.setVisibility(View.VISIBLE);
//        App app = (App) getActivity().getApplication();
//        ApiInterface apiInterface = app.getApiI();
//        Call<GeneralModel> getNextPrimum = apiInterface.getG(type, token);
//        getNextPrimum.enqueue(new Callback<GeneralModel>() {
//            @Override
//            public void onResponse(Call<GeneralModel> call, Response<GeneralModel> response) {
//                try {
//
//                    if (response.isSuccessful()) {
//                        avi.setVisibility(View.GONE);
//
//                        GeneralModel generalModel = response.body();
//                        boolean status = generalModel.isStatus();
//                        if (status) {
//                            avi.setVisibility(View.GONE);
//
//                            GeneralModel1 generalModel1 = generalModel.getGeneralModel1();
//                            String service = generalModel1.getAbout1();
//
//
//                            aboutCompany.setText(service);
//                            // installmentStatusAdapters.notifyDataSetChanged();
//
//
//                        } else {
//                            avi.setVisibility(View.GONE);
//
//                            ErrorModel errorModel = generalModel.getErroModel();
//                            List<String> tokencheck = errorModel.getTokenCheck();
//                            List<String> account_status = errorModel.getAccount();
//                            List<String> account = errorModel.getAccount();
//
//                            if (tokencheck != null) {
//
//                                // postEvent(LoginEvent.onSignInError,tokencheck.get(0),"",0,"");
//                                UtilityHeleper.showsnackbartop(aboutCompany, tokencheck.get(0), getActivity());
//
//
//                            } else if (account_status != null) {
//                                // UtilityHeleper.showDialog_confirmation(LoginProvider.this,"ملاحظة ",account_status.get(0));
//
//                                // postEvent(LoginEvent.onSignInError,account_status.get(0),"",0,"");
//                                UtilityHeleper.showsnackbartop(aboutCompany, account_status.get(0), getActivity());
//
//
//                                // Log.w("TAL",account_status.get(0));
//                            }
//                        }
//
//                    } else {
//                        UtilityHeleper.showsnackbartop(aboutCompany, "حدث خطأ", getActivity());
//
//                    }
//                } catch (NullPointerException no) {
//                    no.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GeneralModel> call, Throwable t) {
//
//            }
//        });
//
//
//    }

}
