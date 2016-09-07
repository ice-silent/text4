package com.example.fumingzhen.text4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String CLASSNO="classno";
    private final static String SEX="sex";
    private final static String PHONE="phone";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"李润发","付明振","李宇同","寇权"};
        String[] classnos={"2014011400","2014011396","2014011401","2014011398"};
        String[] sexs={"女","男","男","男"};
        String[] phones={"11111111111","22222222222","33333333333","44444444444"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, names[i]);
            item.put(CLASSNO, classnos[i]);
            item.put(SEX, sexs[i]);
            item.put(PHONE, phones[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.linear,new String[]{NAME,CLASSNO,SEX,PHONE},new int[]{R.id.name,R.id.classno,R.id.sex,R.id.phone});
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
