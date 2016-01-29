package appewtc.masterung.expandablelistview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    //Explicit
    private ExpandableListView objExpandableListView1;
    private Toast objToast;

    private String strParent[] = {"Desk", "Drink", "Food"};
    //private String strChild[][] = {{"One", "Two", "Three", "Four", "Six"}, {"น้ำเปล่า", "ชา", "การแฟ", "น้ำผลไม้"}, {"โจ้ค", "ข้าวต้ม", "ก้วยเตียว", "อาหารชุด"}};
    private String strChild[][] = {{"One", "Two", "Three", "Four", "Six", "Seven", "Eight", "Nine", "Ten"},
            {"น้ำเปล่า", "ชา", "การแฟ", "น้ำผลไม้", "เบียร์", "น้ำขิง", "น้ำส้ม", "น้ำสัปปะรส", "น้ำองุ่น"},
            {"โจ้ค", "ข้าวต้ม", "ก้วยเตียว", "อาหารชุด", "ข้าวผัด", "ข้าวผัดกระเพราะ"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objToast = Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);

        initialWidget();

        objExpandableListView1.setAdapter(new MyExpandableListView(this));

        objExpandableListView1.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                objToast.setText(strChild[groupPosition][childPosition]);
                objToast.show();

                return false;
            }
        });

    }   // onCreate

    private void initialWidget() {
        objExpandableListView1 = (ExpandableListView) findViewById(R.id.expandableListView1);
    }   // initialWidget


}   // Main Class
