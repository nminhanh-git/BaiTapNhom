package com.example.hd_h.baitapnhom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView studentListView;
    private ArrayList<Student> listSinhVien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentListView = (ListView) findViewById(R.id.student_list_view);
        listSinhVien = new ArrayList<>();
        Student student1 = new Student("Lê Văn Sáng", "CNTT3_K56","20/09/1997","Nam Trực - Nam Định");
        Student student2 = new Student("Nguyễn Đan Trường", "CNTT3_K56","20/09/1997","Đống Đa - Hà Nội");
        Student student3= new Student("Đàm Vĩnh Hưng", "CNTT3_K56","20/09/1997","Quận 1 - Sài Gòn");
        Student student4 = new Student("Công Phượng", "CNTT3_K56","20/09/1997","Quỳnh Lưu - Nghệ An");
        Student student5 = new Student("Bao Công", "CNTT3_K56","20/09/1997","Khai Phong - Trung Quốc");
        Student student6 = new Student("Tôn Ngộ Không", "CNTT3_K56","20/09/1997","Hoa Qủa Sơn - Trung Quốc");
        listSinhVien.add(student1);
        listSinhVien.add(student2);
        listSinhVien.add(student3);
        listSinhVien.add(student4);
        listSinhVien.add(student5);
        listSinhVien.add(student6);
        SinhVienAdapter adapter = new SinhVienAdapter(MainActivity.this,R.layout.student_row_layout,listSinhVien);
        studentListView.setAdapter(adapter);

        studentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle studentBundle = new Bundle();
                studentBundle.putString("name",listSinhVien.get(i).getHoTen());
                studentBundle.putString("class",listSinhVien.get(i).getLop());
                studentBundle.putString("birthday",listSinhVien.get(i).getNgaySinh());
                studentBundle.putString("address",listSinhVien.get(i).getDiaChi());
                Intent detailIntent = new Intent(MainActivity.this,DetailActivity.class);
                detailIntent.putExtra("packet",studentBundle);
                startActivity(detailIntent);

            }
        });

    }
}

