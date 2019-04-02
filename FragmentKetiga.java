package com.codepolitan.myapplication4fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKetiga extends Fragment {
    TextView tvTeks;
    public FragmentKetiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_ketiga,container, false);
        tvTeks = view.findViewById(R.id.tv_teks);

       try {
           String data = getArguments().getString("kunci");
           if (!TextUtils.isEmpty(data)) {
               tvTeks.setText(data);
           }else {
               tvTeks.setText("-");
           }
       } catch (Exception ex) {
           ex.printStackTrace();
       }
        // Inflate the layout for this fragment
        return view;
    }

}
