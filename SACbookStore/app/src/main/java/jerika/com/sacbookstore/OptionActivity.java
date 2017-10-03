package jerika.com.sacbookstore;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


public class OptionActivity extends AppCompatActivity {
    private RelativeLayout[] variables = new RelativeLayout[7];
    private int[] ids = {R.id.onclick_schoolsupplies,R.id.onclick_peuniform,R.id.onclick_school_uniform,
            R.id.onclick_nursing_uniformaccessories
    ,R.id.onclick_criminology,R.id.onclick_bookmanuals,R.id.onclick_others};
    private FloatingActionButton searchFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        for (int i = 0;i<ids.length;i++){
            variables[i] = (RelativeLayout) findViewById(ids[i]);
            relativeOnclick(variables[i],i);
        }
        searchFloat = ( FloatingActionButton) findViewById(R.id.floatingActionButton2);
        searchFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this,OptionItemSelectedList.class);
                i.putExtra("currentItem",7);
                startActivity(i);
            }
        });
    }

    private void relativeOnclick(final RelativeLayout relativeLayout, final int currentItem){
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this,OptionItemSelectedList.class);
                i.putExtra("currentItem",currentItem);
                startActivity(i);
            }
        });

    }
}
