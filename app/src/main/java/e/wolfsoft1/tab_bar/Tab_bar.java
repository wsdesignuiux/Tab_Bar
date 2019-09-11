package e.wolfsoft1.tab_bar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tab_bar extends AppCompatActivity implements View.OnClickListener {

    private ViewGroup viewRoot;
    private boolean positionChanged;

    ImageView home_icon, search_icon, like_icon, notice_icon;
    Animation animmoveData25to75, animmoveData0to75, animmoveData50to75, animmoveData75to50, animmoveData0to50, animmoveData75to25, animmoveData50to25, animmoveData0to25, animmoveData25to50, animmoveData75to0, animmoveData50to0, animmoveData25to0, animmoveData, fadeout, fadout1, fadout2, fadout3, animMove, animMove1, animMove2, animMove3, animMovetoptobottom, animMovetoptobottom1, animMovetoptobottom2, animMovetoptobottom3;

    ImageView home, like, search, notice;


    ImageView home_icon_large, search_icon_large, like_icon_large, notice_icon_large;
    TextView home_text, search_text, like_text, notice_text;
    LinearLayout parent_linear, linear_home_icon_large, linear_home, linear_search, linear_like, linear_notice;

    private int selected_position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bar);

        home_icon = findViewById(R.id.home_icon);
        search_icon = findViewById(R.id.search_icon);
        like_icon = findViewById(R.id.like_icon);
        notice_icon = findViewById(R.id.notice_icon);

        home_text = findViewById(R.id.home_text);
        search_text = findViewById(R.id.search_text);
        like_text = findViewById(R.id.like_text);
        notice_text = findViewById(R.id.notice_text);

        home_icon_large = findViewById(R.id.home_icon_large);

        linear_home = findViewById(R.id.linear_home);
        linear_search = findViewById(R.id.linear_search);
        linear_like = findViewById(R.id.linear_like);
        linear_notice = findViewById(R.id.linear_notice);

        parent_linear = findViewById(R.id.parent_linear);


        linear_home_icon_large = findViewById(R.id.linear_home_icon_large);

        linear_home.setOnClickListener(this);
        linear_search.setOnClickListener(this);
        linear_like.setOnClickListener(this);
        linear_notice.setOnClickListener(this);


        fadeout = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        fadout1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out1);

        fadout2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out2);

        fadout3 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out3);

        animMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_up);

        animMove1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_up1);


        animMove2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_up2);

        animMove3 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_up3);

        animMovetoptobottom = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_top_to_bottom);


        animmoveData = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move0to25);

        animmoveData25to0 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move25to0);

        animmoveData50to0 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move50to0);

        animmoveData75to0 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move75to0);


        animmoveData0to25 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move0to25);


        animmoveData50to25 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move50to25);

        animmoveData75to25 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move75to25);


        animmoveData0to50 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move0to50);

        animmoveData25to50 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move25to50);

        animmoveData75to50 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move75to50);

        animmoveData50to75 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move50to75);

        animmoveData25to75 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move25to75);

        animmoveData0to75 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move0to75);



        home_icon_large.setImageResource(R.drawable.ic_home_large);
        parent_linear.setBackgroundColor(Color.parseColor("#08E8DE"));
        home_icon.startAnimation(animMove);
        home_icon.setColorFilter(Color.parseColor("#ffffff"));
        home_text.setTextColor(Color.parseColor("#08E8DE"));
        home_text.setVisibility(View.VISIBLE);
        home_text.startAnimation(animMove);

        selected_position=1;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_home:


                if (selected_position == 1) {


                } else if (selected_position == 2) {

                    search_icon.startAnimation(animMovetoptobottom);
                    search_text.startAnimation(fadout1);
                    home_icon_large.startAnimation(animmoveData25to0);

                    home_icon_large.setImageResource(R.drawable.ic_home_large);



                } else if (selected_position == 3) {


                    like_icon.startAnimation(animMovetoptobottom);
                    like_text.startAnimation(fadout2);
                    home_icon_large.startAnimation(animmoveData50to0);
                    home_icon_large.setImageResource(R.drawable.ic_home_large);

                } else if (selected_position == 4) {


                    notice_icon.startAnimation(animMovetoptobottom);
                    notice_text.startAnimation(fadout3);
                    home_icon_large.startAnimation(animmoveData75to0);
                    home_icon_large.setImageResource(R.drawable.ic_home_large);

                }

                parent_linear.setBackgroundColor(Color.parseColor("#08E8DE"));

                home_icon.setColorFilter(Color.parseColor("#ffffff"));
                search_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                like_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                notice_icon.setColorFilter(Color.parseColor("#d3d3d3"));

                home_text.setTextColor(Color.parseColor("#08E8DE"));


                home_icon.startAnimation(animMove);


                home_text.setVisibility(View.VISIBLE);
                home_text.startAnimation(animMove);
                selected_position = 1;


                break;

            case R.id.linear_search:

                if (selected_position == 1) {

                    home_icon.startAnimation(animMovetoptobottom);
                    home_text.startAnimation(fadeout);
                    home_icon_large.startAnimation(animmoveData0to25);
                    home_icon_large.setImageResource(R.drawable.ic_search_large);

                } else if (selected_position == 2) {


                } else if (selected_position == 3) {


                    like_icon.startAnimation(animMovetoptobottom);
                    like_text.startAnimation(fadout2);
                    home_icon_large.startAnimation(animmoveData50to25);
                    home_icon_large.setImageResource(R.drawable.ic_search_large);


                } else if (selected_position == 4) {


                    notice_icon.startAnimation(animMovetoptobottom);
                    notice_text.startAnimation(fadout3);
                    home_icon_large.startAnimation(animmoveData75to25);
                    home_icon_large.setImageResource(R.drawable.ic_search_large);


                }

                parent_linear.setBackgroundColor(Color.parseColor("#FCC602"));
                home_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                search_icon.setColorFilter(Color.parseColor("#ffffff"));
                like_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                notice_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                search_text.setTextColor(Color.parseColor("#FCC602"));

                home_icon_large.setVisibility(View.INVISIBLE);
                home_icon_large.setImageResource(R.drawable.ic_search_large);

                search_icon.startAnimation(animMove);
                search_text.setVisibility(View.VISIBLE);
                search_text.startAnimation(animMove1);
                selected_position = 2;
                break;


            case R.id.linear_like:


                if (selected_position == 1) {

                    home_icon.startAnimation(animMovetoptobottom);
                    home_text.startAnimation(fadeout);
                    home_icon_large.setVisibility(View.INVISIBLE);
                    home_icon_large.startAnimation(animmoveData0to50);


                } else if (selected_position == 2) {

                    search_icon.startAnimation(animMovetoptobottom);
                    search_text.startAnimation(fadout1);
                    home_icon_large.setVisibility(View.INVISIBLE);
                    home_icon_large.startAnimation(animmoveData25to50);

                } else if (selected_position == 3) {


                } else if (selected_position == 4) {

                    notice_icon.startAnimation(animMovetoptobottom);
                    notice_text.startAnimation(fadout3);
                    home_icon_large.setVisibility(View.INVISIBLE);

                    home_icon_large.startAnimation(animmoveData75to50);

                }

                parent_linear.setBackgroundColor(Color.parseColor("#E0115F"));


                home_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                search_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                like_icon.setColorFilter(Color.parseColor("#ffffff"));
                notice_icon.setColorFilter(Color.parseColor("#d3d3d3"));

                like_text.setTextColor(Color.parseColor("#E0115F"));

                home_icon_large.setImageResource(R.drawable.ic_like_large);


                like_icon.startAnimation(animMove);
                like_text.setVisibility(View.VISIBLE);
                like_text.startAnimation(animMove2);


                selected_position = 3;


                break;
            case R.id.linear_notice:


                if (selected_position == 1) {


                    home_icon.startAnimation(animMovetoptobottom);
                    home_text.startAnimation(fadeout);
                    home_icon_large.setVisibility(View.INVISIBLE);
                    home_icon_large.startAnimation(animmoveData0to75);


                } else if (selected_position == 2) {

                    search_icon.startAnimation(animMovetoptobottom);
                    search_text.startAnimation(fadout1);
                    home_icon_large.startAnimation(animmoveData25to75);

                } else if (selected_position == 3) {


                    like_icon.startAnimation(animMovetoptobottom);
                    like_text.startAnimation(fadout2);
                    home_icon_large.startAnimation(animmoveData50to75);

                } else if (selected_position == 4) {

                }

                parent_linear.setBackgroundColor(Color.parseColor("#039BEF"));
                home_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                search_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                like_icon.setColorFilter(Color.parseColor("#d3d3d3"));
                notice_icon.setColorFilter(Color.parseColor("#ffffff"));

                notice_text.setTextColor(Color.parseColor("#039BEF"));


                home_icon_large.setImageResource(R.drawable.ic_notice_large);



                notice_icon.startAnimation(animMove3);
                notice_text.setVisibility(View.VISIBLE);
                notice_text.startAnimation(animMove3);


                selected_position = 4;


                break;

        }

    }

}
