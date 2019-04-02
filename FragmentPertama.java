package com.codepolitan.myapplication4fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPertama extends Fragment {

    EditText etPanjang, etLebar;
    Button btHitung;
    TextView tvHasil;

    public FragmentPertama() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_pertama, container, false);
        etPanjang = view.findViewById(R.id.panjang);
        etLebar = view.findViewById(R.id.lebar);
        btHitung = view.findViewById(R.id.bt_hitung);
        tvHasil = view.findViewById(R.id.tv_hasil);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = etPanjang.getText().toString();
                String lebar = etLebar.getText().toString();

                int hasil = Integer.valueOf(panjang) * Integer.valueOf(lebar);

                tvHasil.setText(String.valueOf(hasil));
            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_pertama, container, false);
    }
}
