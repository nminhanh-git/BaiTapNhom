package com.example.hd_h.baitapnhom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nminh on 8/24/2017.
 */

public class SinhVienAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Student> studentList;

    public SinhVienAdapter(Context context, int layout, ArrayList<Student> studentList) {
        this.context = context;
        this.layout = layout;
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int i) {
        return studentList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView nameTextView = (TextView) view.findViewById(R.id.name_text_view);
        TextView classTextView = (TextView) view.findViewById(R.id.class_text_view);
        TextView birthdayTextView = (TextView) view.findViewById(R.id.birthday_text_view);
        TextView addressTextView = (TextView) view.findViewById(R.id.address_text_view);

        Student student = studentList.get(i);

        nameTextView.setText(student.getHoTen());
        classTextView.setText(student.getLop());
        birthdayTextView.setText(student.getNgaySinh());
        addressTextView.setText(student.getDiaChi());

        return view;
    }
}
