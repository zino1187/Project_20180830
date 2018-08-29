package com.example.zino.project_20180830;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    /*안드로이드 GUI의 컴포넌트들은 크게 2가지로 분류가 된다.
    * 1) 일반형(View) : 다른 컴포넌트에 포함되는 컴포넌트 ( 버튼, 체크박스 등)
    * 2) 그룹형(ViewGroup) : 다른 컴포넌트를 포함할 수 있는 컴포넌트 (뷰그룹 )
    *     특히 뷰그룹 중 레이아웃 능력이 있는 뷰그룹을 Layout 이라 하며 아래와 같은 종류가 있다.
           - LinearLayout : 컴포넌트를 수평 또는 수직의 일렬로 배치하는 레이아웃
           - GridLayout : 격자로 컴포넌트를 배치하는 레이아웃
           - RelativeLayout : 지정한 컴포넌트를 기준으로 배치하는 레이아웃
           - ConstraintLayout : 새로 도입된 레이아웃으로 RelativeLayout 보다 개선된 기능과 성능을
                                           지원한다.
           - AbsoluteLayout : deprecated ( X )
           - FrameLayout :  좌측 상단을 기준으로 한 레이아웃으로 컴포넌트간 중첩을 허용한다
    */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*

        */
/*레이아웃을 생성한다*//*

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL); //수직방향으로 정렬
        */
/*버튼을 생성한다*//*

        Button bt = new Button(this);
        bt.setText("나버튼");

        layout.addView(bt);
        setContentView(layout);
*/
    setContentView(R.layout.activity_main);
    }
}
