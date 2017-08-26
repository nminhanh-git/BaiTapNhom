package com.example.hd_h.baitapnhom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
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
        Student student1 = new Student("Lê Văn Sáng", "CNTT3-K56", "20/09/1997", "Nam Trực - Nam Định", "Nam");
        Student student2 = new Student("Nguyễn Đan Trường", "CNTT3-K56", "20/09/1997", "Đống Đa - Hà Nội", "Nam");
        Student student3 = new Student("Đàm Vĩnh Hưng", "CNTT3-K56", "20/09/1997", "Quận 1 - Sài Gòn", "Nam");
        Student student4 = new Student("Công Phượng", "CNTT3-K56", "20/09/1997", "Quỳnh Lưu - Nghệ An", "Nam");
        Student student5 = new Student("Bao Công", "CNTT3-K56", "20/09/1997", "Khai Phong - Trung Quốc", "Nam");
        Student student6 = new Student("Tôn Ngộ Không", "CNTT3-K56", "20/09/1997", "Hoa Quả Sơn - Trung Quốc", "Nam");
        Student student7 = new Student("Điêu Thuyền", "CNTT3-K56", "20/09/1997", "Trung Quốc", "Nữ");
        Student student8 = new Student("Bà Tưng", "CNTT3-K56", "20/09/1997", "Hà Nội - Việt Nam", "Nữ");
        Student student9 = new Student("Ariana Grande", "CNTT3-K56", "20/09/1997", "Los Angles - United States", "Nữ");
        listSinhVien.add(student1);
        listSinhVien.add(student2);
        listSinhVien.add(student3);
        listSinhVien.add(student4);
        listSinhVien.add(student5);
        listSinhVien.add(student6);
        listSinhVien.add(student7);
        listSinhVien.add(student8);
        listSinhVien.add(student9);
        SinhVienAdapter adapter = new SinhVienAdapter(MainActivity.this, R.layout.student_row_layout, listSinhVien);
        studentListView.setAdapter(adapter);

        studentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle studentBundle = new Bundle();
                studentBundle.putString("name", listSinhVien.get(i).getHoTen());
                studentBundle.putString("class", listSinhVien.get(i).getLop());
                studentBundle.putString("birthday", listSinhVien.get(i).getNgaySinh());
                studentBundle.putString("address", listSinhVien.get(i).getDiaChi());
                studentBundle.putString("gender", listSinhVien.get(i).getGioiTinh());
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("packet", studentBundle);
                startActivity(detailIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemContact:
                Intent contactIntent = new Intent(MainActivity.this, TeamInfoActivity.class);
                startActivity(contactIntent);
                return true;
            case R.id.itemControduction:
                Intent appIntroIntent = new Intent(MainActivity.this, AppIntroductionActivity.class);
                startActivity(appIntroIntent);
                return true;
        }
        return false;
    }
}

