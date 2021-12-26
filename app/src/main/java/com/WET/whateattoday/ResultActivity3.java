package com.WET.whateattoday;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class ResultActivity3 extends AppCompatActivity {

    Food[] food = new Food[183];
    CircleImageView iv_result;
    TextView tv_result;
    Food resultFood;
    View btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        try {
            setFood();
            init();
            setResult();
            home();
        } catch (Exception e) {
            Toast.makeText(ResultActivity3.this, "조건에 해당하는 음식이 없습니다.", Toast.LENGTH_LONG);
            finish();
        }
    }

    void home() {
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    void setResult() {
        tv_result.setText(resultFood.getName());
        iv_result.setImageResource(resultFood.getImage());
    }




    Food choiceFood() {
        Random random = new Random();
        int resultNum = random.nextInt(food.length-1);

        return food[resultNum];
    }

    void init() {
        iv_result = (CircleImageView) findViewById(R.id.iv_result);
        tv_result = (TextView) findViewById(R.id.tv_result);
        btn_home = (View) findViewById(R.id.btn_home);
        resultFood = choiceFood();
    }

    void setFood() {
        food[0] = new Food("비빔밥", 0, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[1] = new Food("김치볶음밥", 0, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[2] = new Food("국밥", 0, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[3] = new Food("죽류", 0, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[4] = new Food("설렁탕", 0, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[5] = new Food("김밥", 0, 4, 0, 1, R.drawable.ic_launcher_foreground);
        food[6] = new Food("회덮밥", 0, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[7] = new Food("치킨마요덮밥", 0, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[8] = new Food("제육덮밥", 0, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[9] = new Food("갈비탕", 0, 4, 1, 1, R.drawable.ic_launcher_foreground);

        food[10] = new Food("초빕", 0, 5, 2, 1, R.drawable.ic_launcher_foreground);
        food[11] = new Food("규동", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[12] = new Food("알밥", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[13] = new Food("오야코동", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[14] = new Food("오므라이스", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[15] = new Food("사케동", 0, 5, 2, 1, R.drawable.ic_launcher_foreground);
        food[16] = new Food("장어덮밥", 0, 5, 2, 1, R.drawable.ic_launcher_foreground);
        food[17] = new Food("텐동", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[18] = new Food("가츠동", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[19] = new Food("하이라이스", 0, 5, 1, 1, R.drawable.ic_launcher_foreground);

        food[20] = new Food("중식볶음밥", 0, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[21] = new Food("짜장밥", 0, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[22] = new Food("중화비빔밥", 0, 6, 1, 2, R.drawable.ic_launcher_foreground);
        food[23] = new Food("잡채밥", 0, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[24] = new Food("짬뽕밥", 0, 6, 1, 1, R.drawable.ic_launcher_foreground);

        food[25] = new Food("리조또", 0, 7, 1, 1, R.drawable.ic_launcher_foreground);

        food[26] = new Food("떡국", 2, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[27] = new Food("떡볶이", 2, 4, 3, 2, R.drawable.ic_launcher_foreground);
        food[28] = new Food("수제비", 2, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[29] = new Food("라볶이", 2, 4, 1, 2, R.drawable.ic_launcher_foreground);

        food[30] = new Food("리조또", 2, 6, 1, 1, R.drawable.ic_launcher_foreground);

        food[31] = new Food("햄버거", 2, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[32] = new Food("토스트", 2, 7, 0, 1, R.drawable.ic_launcher_foreground);
        food[33] = new Food("뇨끼", 2, 7, 1, 2, R.drawable.ic_launcher_foreground);
        food[34] = new Food("핫도그", 2, 7, 0, 1, R.drawable.ic_launcher_foreground);
        food[35] = new Food("피자", 2, 7, 4, 1, R.drawable.ic_launcher_foreground);
        food[36] = new Food("샌드위치", 2, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[37] = new Food("시리얼", 2, 7, 0, 1, R.drawable.ic_launcher_foreground);
        food[38] = new Food("수제버거", 2, 7, 2, 2, R.drawable.ic_launcher_foreground);

        food[39] = new Food("쫄면", 1, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[40] = new Food("라면", 1, 4, 0, 2, R.drawable.ic_launcher_foreground);
        food[41] = new Food("잡채", 1, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[42] = new Food("잔치국수", 1, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[43] = new Food("골뱅이소면", 1, 4, 2, 2, R.drawable.ic_launcher_foreground);
        food[44] = new Food("물냉면", 1, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[45] = new Food("비빔냉면", 1, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[46] = new Food("칼국수", 1, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[47] = new Food("비빔국수", 1, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[48] = new Food("콩국수", 1, 4, 1, 1, R.drawable.ic_launcher_foreground);

        food[49] = new Food("냉소바", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[50] = new Food("우동", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[51] = new Food("온소바", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[52] = new Food("쇼유라멘", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[53] = new Food("미소라멘", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[54] = new Food("돈코츠라멘", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[55] = new Food("야끼소바", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[56] = new Food("볶음우동", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[57] = new Food("시오라멘", 1, 5, 1, 1, R.drawable.ic_launcher_foreground);

        food[58] = new Food("짬뽕", 1, 6, 1, 2, R.drawable.ic_launcher_foreground);
        food[59] = new Food("탄탄면", 1, 6, 1, 2, R.drawable.ic_launcher_foreground);
        food[60] = new Food("쟁반짜장", 1, 6, 2, 2, R.drawable.ic_launcher_foreground);
        food[61] = new Food("중식우동", 1, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[62] = new Food("짜장면", 1, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[63] = new Food("울면", 1, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[64] = new Food("간짜장", 1, 6, 1, 1, R.drawable.ic_launcher_foreground);
        food[65] = new Food("중식냉면", 1, 6, 1, 2, R.drawable.ic_launcher_foreground);

        food[66] = new Food("토마토파스타", 1, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[67] = new Food("오일파스타", 1, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[68] = new Food("크림파스타", 1, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[69] = new Food("로제파스타", 1, 7, 1, 1, R.drawable.ic_launcher_foreground);

        food[70] = new Food("김치찌개", 3, 4, 1, 2, R.drawable.ic_launcher_foreground);
        food[71] = new Food("부대찌개", 3, 4, 3, 2, R.drawable.ic_launcher_foreground);
        food[72] = new Food("보쌈", 3, 4, 4, 1, R.drawable.ic_launcher_foreground);
        food[73] = new Food("삼겹살", 3, 4, 2, 1, R.drawable.ic_launcher_foreground);
        food[74] = new Food("곱창", 3, 4, 2, 1, R.drawable.ic_launcher_foreground);
        food[75] = new Food("된장찌개", 3, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[76] = new Food("족발", 3, 4, 4, 1, R.drawable.ic_launcher_foreground);
        food[77] = new Food("감자탕", 3, 4, 4, 2, R.drawable.ic_launcher_foreground);
        food[78] = new Food("전", 3, 4, 2, 1, R.drawable.ic_launcher_foreground);
        food[79] = new Food("수육", 3, 4, 4, 1, R.drawable.ic_launcher_foreground);
        food[80] = new Food("닭도리탕", 3, 4, 3, 2, R.drawable.ic_launcher_foreground);
        food[81] = new Food("삼계탕", 3, 4, 1, 1, R.drawable.ic_launcher_foreground);
        food[82] = new Food("게장", 3, 4, 3, 1, R.drawable.ic_launcher_foreground);
        food[83] = new Food("닭발", 3, 4, 3, 2, R.drawable.ic_launcher_foreground);
        food[84] = new Food("물회", 3, 4, 1, 2, R.drawable.ic_launcher_foreground);

        food[85] = new Food("일식 돈까스", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[86] = new Food("일식 카레", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[87] = new Food("오코노미야끼", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[88] = new Food("회", 3, 5, 4, 1, R.drawable.ic_launcher_foreground);
        food[89] = new Food("교자", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[90] = new Food("가라아게", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[91] = new Food("오댕탕", 3, 5, 1, 1, R.drawable.ic_launcher_foreground);
        food[92] = new Food("찜닭", 3, 5, 3, 1, R.drawable.ic_launcher_foreground);
        food[93] = new Food("샤브샤브", 3, 5, 4, 1, R.drawable.ic_launcher_foreground);
        food[94] = new Food("나베", 3, 5, 3, 1, R.drawable.ic_launcher_foreground);

        food[96] = new Food("마라탕", 3, 6, 3, 2, R.drawable.ic_launcher_foreground);
        food[97] = new Food("깐쇼새우", 3, 6, 3, 2, R.drawable.ic_launcher_foreground);
        food[98] = new Food("꿔바로우", 3, 6, 3, 1, R.drawable.ic_launcher_foreground);
        food[99] = new Food("마파두부", 3, 6, 1, 2, R.drawable.ic_launcher_foreground);
        food[100] = new Food("팔보채", 3, 6, 3, 1, R.drawable.ic_launcher_foreground);
        food[101] = new Food("훠궈", 3, 6, 4, 2, R.drawable.ic_launcher_foreground);
        food[102] = new Food("탕수육", 3, 6, 3, 1, R.drawable.ic_launcher_foreground);
        food[103] = new Food("양꼬치", 3, 6, 4, 1, R.drawable.ic_launcher_foreground);
        food[104] = new Food("고추잡채", 3, 6, 3, 2, R.drawable.ic_launcher_foreground);
        food[105] = new Food("만두", 3, 6, 3, 1, R.drawable.ic_launcher_foreground);

        food[106] = new Food("경양식 돈까스", 3, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[107] = new Food("라자냐", 3, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[108] = new Food("바베큐", 3, 7, 4, 1, R.drawable.ic_launcher_foreground);
        food[109] = new Food("오믈렛", 3, 7, 1, 1, R.drawable.ic_launcher_foreground);
        food[110] = new Food("스테이크", 3, 7, 4, 1, R.drawable.ic_launcher_foreground);
        food[111] = new Food("그라탕", 3, 7, 2, 1, R.drawable.ic_launcher_foreground);
        food[112] = new Food("샐러드", 3, 7, 1, 1, R.drawable.ic_launcher_foreground);

        food[113] = new Food("타코야끼", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[114] = new Food("과자", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[115] = new Food("빵", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[116] = new Food("건어물", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[117] = new Food("젤리", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[118] = new Food("케이크", 8, 12, 2, 1, R.drawable.ic_launcher_foreground);
        food[119] = new Food("푸딩", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[120] = new Food("육포", 8, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[121] = new Food("붕어빵", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[122] = new Food("마카롱", 8, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[123] = new Food("와플", 8, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[124] = new Food("견과류", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[125] = new Food("사탕", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[126] = new Food("머핀", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[127] = new Food("호떡", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[128] = new Food("건조과일", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[129] = new Food("아이스크림", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[130] = new Food("빙수", 8, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[131] = new Food("츄러스", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[132] = new Food("과일", 8, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[133] = new Food("삶은계란", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[134] = new Food("도너츠", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[135] = new Food("찐빵", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[136] = new Food("꽈베기", 8, 12, 0, 1, R.drawable.ic_launcher_foreground);

        food[137] = new Food("아메리카노", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[138] = new Food("바닐라라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[139] = new Food("카라멜마끼아또", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[140] = new Food("고구마라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[141] = new Food("딸기에이드", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[142] = new Food("아포같토", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[143] = new Food("얼그레이", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[144] = new Food("자몽에이드", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[145] = new Food("카페라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[146] = new Food("연유라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[147] = new Food("카페모카", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[148] = new Food("핫초코", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[149] = new Food("스무디", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[150] = new Food("녹차", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[151] = new Food("청포도에이드", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[152] = new Food("헤이즐넛커피", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[153] = new Food("카푸치노", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[154] = new Food("녹차라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[155] = new Food("돌체라떼", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[156] = new Food("아이스티", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[157] = new Food("에스프레소", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[158] = new Food("홍차", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[159] = new Food("망고에이드", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[160] = new Food("더치커피", 9, 12, 1, 1, R.drawable.ic_launcher_foreground);

        food[161] = new Food("김밥", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[162] = new Food("어묵", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[163] = new Food("쫄면", 10, 12, 1, 2, R.drawable.ic_launcher_foreground);
        food[164] = new Food("핫도그", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[165] = new Food("짜장떡볶이", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[166] = new Food("잔치국수", 10, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[167] = new Food("떡볶이", 10, 12, 0, 2, R.drawable.ic_launcher_foreground);
        food[168] = new Food("튀김", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[169] = new Food("주먹밥", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[170] = new Food("만두", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[171] = new Food("호떡", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[172] = new Food("즉석떡볶이", 10, 12, 2, 2, R.drawable.ic_launcher_foreground);
        food[173] = new Food("돈까스", 10, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[174] = new Food("라볶이", 10, 12, 0, 2, R.drawable.ic_launcher_foreground);
        food[175] = new Food("순대", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);
        food[176] = new Food("라면", 10, 12, 0, 2, R.drawable.ic_launcher_foreground);
        food[177] = new Food("닭강정", 10, 12, 1, 2, R.drawable.ic_launcher_foreground);
        food[178] = new Food("우동", 10, 12, 1, 1, R.drawable.ic_launcher_foreground);
        food[179] = new Food("꽃빵", 10, 12, 0, 1, R.drawable.ic_launcher_foreground);

        food[180] = new Food("치킨", 3, 7, 3, 1, R.drawable.ic_launcher_foreground);
        food[181] = new Food("카레", 3, 11, 1, 1, R.drawable.ic_launcher_foreground);

    }
}
