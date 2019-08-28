package com.dtag.thaa.home_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.DrawerAdapter;
import com.dtag.thaa.DrawerModel;
import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomeAcitivity extends AppCompatActivity {

    @BindView(R.id.text_barhome)
   public TextView textBarhome;
    @BindView(R.id.toolbar2)
    Toolbar toolbar2;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
    @BindView(R.id.profile_id)
    TextView profileId;
    @BindView(R.id.relative_header)
    RelativeLayout relativeHeader;
    @BindView(R.id.recycle_drawer)
    RecyclerView recycleDrawer;
    @BindView(R.id.lindrawer)
    LinearLayout lindrawer;
    @BindView(R.id.log_outi)
    ImageView logOuti;
    @BindView(R.id.log_out)
    TextView logOut;
    @BindView(R.id.log_f)
    FrameLayout logF;
    @BindView(R.id.navigationview)
    NavigationView navigationview;
    @BindView(R.id.drawerlayout)
    DrawerLayout drawerlayout;

    //implement navigation controller
   private NavController navController;

    // implement Drawer model
    List<DrawerModel> drawerModels;
    private DrawerAdapter drawerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitivity);
        ButterKnife.bind(this);
        drawerModels = new ArrayList<>();
        textBarhome.setText("الصفحة الرئيسية");

        Bundle bundle=getIntent().getExtras();




        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        navController = Navigation.findNavController(this, R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, drawerlayout);
        NavigationUI.setupWithNavController(navigationview, navController);


        if(bundle!=null){
            int logout=bundle.getInt("ho");
            if(logout==240){

                navController.navigate(R.id.loginFragment);
                // finish();

                // Navigation.findNavController(view).navigate(R.id.to,null);

            }
        }

        drawerModels.add(new DrawerModel("الصفحةالرئيسيه "));
        //  drawerModels.add(new DrawerModel("الملف الشخصى "));
        drawerModels.add(new DrawerModel("الملف الشخصى "));
        //drawerModels.add(new DrawerModel("نساء "));
        // drawerModels.add(new DrawerModel("مواهب "));
        drawerModels.add(new DrawerModel("عن التطبيق "));
        drawerModels.add(new DrawerModel("الشروط والاحكام "));
        drawerAdapter=new DrawerAdapter(HomeAcitivity.this, drawerModels, new Onclicklistenerd() {
            @Override
            public void onItemClickedListener(int position) {

                switch (position) {
                    case 0:
                   textBarhome.setText("الصفحة الرئيسية");

                        navController.navigate(R.id.homeFragment);
                        drawerlayout.closeDrawers();
                        break;
                    case 1:
                        textBarhome.setText("الملف الشخصى");
                        navController.navigate(R.id.userProfile);
                        drawerlayout.closeDrawers();

                     //   drawerlayout.closeDrawers();

                        break;

                    case 2:
                        textBarhome.setText("عن التطبيق");
                        navController.navigate(R.id.aboutCompany);
                        drawerlayout.closeDrawers();
                        break;

                    case 3:
                        textBarhome.setText("الشروط والأحكام");

                        navController.navigate(R.id.aboutCompany2);
                        drawerlayout.closeDrawers();
                        break;

                }

            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycleDrawer.setLayoutManager(linearLayoutManager);

        recycleDrawer.setAdapter(drawerAdapter);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                navController.navigate(R.id.loginFragment);

                drawerlayout.closeDrawers();


            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        return  NavigationUI.navigateUp(Navigation.findNavController(this, R.id.fragment), drawerlayout);
    }



    @Override
    public void onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)) {
            drawerlayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
