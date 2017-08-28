package com.project.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.project.daggerdemo.coffe.CoffeMachine;
import com.project.daggerdemo.coffe.Cooker;

public class MainActivity extends AppCompatActivity {
  /*  @Inject
    Clothes mCloth;
    @Inject
    Games   mGames;
    @Inject
    Shoe    mShoe;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView       tv    = (TextView) findViewById(R.id.tv);
      /*  MainComponent1 build = DaggerMainComponent1.builder().mainModule(new MainModule()).build();
        build.inject(this);*/
        CoffeMachine coffeMachine = new CoffeMachine(new Cooker("小四","黑色焦糖"));
        tv.setText("我现在制作了" + "..." + coffeMachine.makeCoffe());
    }
}
