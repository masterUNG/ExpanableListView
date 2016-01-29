package appewtc.masterung.expandablelistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;

/**
 * Created by masterUNG on 11/20/14 AD.
 */
public class MyExpandableListView extends BaseExpandableListAdapter{

    //Explicit
    private Context objContext;
    private String strParent[] = {"Desk", "Drink", "Food"};
    private String strChild[][] = {{"One", "Two", "Three", "Four", "Six", "Seven", "Eight", "Nine", "Ten"},
            {"น้ำเปล่า", "ชา", "การแฟ", "น้ำผลไม้", "เบียร์", "น้ำขิง", "น้ำส้ม", "น้ำสัปปะรส", "น้ำองุ่น"},
            {"โจ้ค", "ข้าวต้ม", "ก้วยเตียว", "อาหารชุด", "ข้าวผัด", "ข้าวผัดกระเพราะ"}};


    public MyExpandableListView(Context context) {

        objContext = context;

    }   // Constructor

    @Override
    public int getGroupCount() {
        return strParent.length;
    }   // getGroupCount

    @Override
    public int getChildrenCount(int groupPosition) {
        return strChild[groupPosition].length;
    }   // getChildrenCount

    @Override
    public Object getGroup(int groupPosition) {
        return groupPosition;
    }   // getGroup

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }   // getGroupId

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        CheckedTextView objParent = new CheckedTextView(objContext);
        objParent.setText(strParent[groupPosition]);

        return objParent;
    }   // getGroupView

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        CheckedTextView objCheckTextView = new CheckedTextView(objContext);
        objCheckTextView.setText("      ==>" + strChild[groupPosition][childPosition]);

        return objCheckTextView;
    }   // getChildView

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }   // isChildSelectable

}   // Main Class
