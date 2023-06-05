package chat.chatbot.service;

public class SuwonMapService {

    public static String setLocation(String code){
        String location = "말씀하신 위치가 어디인지 모르겠어요";

        if ( code.equals("01") ) location = "1강의동(진리관)";
        if ( code.equals("02") ) location = "2강의동(성신관)";
        if ( code.equals("03") ) location = "3강의동(애경관)";
        if ( code.equals("04") ) location = "4강의동(예지관)";
        if ( code.equals("05") ) location = "5강의동(덕문관)";
        if ( code.equals("06") ) location = "6강의동(광교관)";
        if ( code.equals("07") ) location = "7강의동(집현관)";
        if ( code.equals("08") ) location = "8강의동(육영관)";
        if ( code.equals("09") ) location = "9강의동(호연관)";
        if ( code.equals("10") ) location = "제 2공학관";

        if ( code.equals("11") ) location = "종합강의동";
        if ( code.equals("12") ) location = "중앙 도서관";
        if ( code.equals("13") ) location = "신학생회관";
        if ( code.equals("14") ) location = "복지관";
        if ( code.equals("15") ) location = "미래관";
        if ( code.equals("16") ) location = "어울림관";
        if ( code.equals("17") ) location = "체육관";
        if ( code.equals("18") ) location = "소성 박물관";
        if ( code.equals("19") ) location = "진리관 실습실";
        if ( code.equals("20") ) location = "공학 실습동";

        if ( code.equals("21") ) location = "리서치센터";
        if ( code.equals("22") ) location = "산학협력단";
        if ( code.equals("23") ) location = "교수연구동";
        if ( code.equals("24") ) location = "국제교류처";
        if ( code.equals("25") ) location = "예학관";
        if ( code.equals("26") ) location = "한우리관";
        if ( code.equals("27") ) location = "이스퀘어";
        if ( code.equals("28") ) location = "감성코어";
        if ( code.equals("29") ) location = "오아시스";
        if ( code.equals("30") ) location = "경슐랭";

        if ( code.equals("31") ) location = "정문";
        if ( code.equals("32") ) location = "후문";
        if ( code.equals("33") ) location = "경기드림타워(기숙사)";

        return location;
    }

    public static String setDescription(String code){

        String description = "말씀하신 위치가 어디인지 모르겠어요";
        if ( code.equals("01") ) description = "";
        if ( code.equals("02") ) description = "";
        if ( code.equals("03") ) description = "";
        if ( code.equals("04") ) description = "";
        if ( code.equals("05") ) description = "";
        if ( code.equals("06") ) description = "";
        if ( code.equals("07") ) description = "";
        if ( code.equals("08") ) description = "";
        if ( code.equals("09") ) description = "";
        if ( code.equals("10") ) description = "";

        if ( code.equals("11") ) description = "";
        if ( code.equals("12") ) description = "중앙 도서관은 붉은 벽돌 건물이에요! 학생증이 있어야 출입 가능해요!";
        if ( code.equals("13") ) description = "신학생회관에는 동아리방과 학과별 과방이 있어요!";
        if ( code.equals("14") ) description = "복지관 지하 1층(식당)은 신학생회관 4층과 다리로 이어져 있어요!";
        if ( code.equals("15") ) description = "";
        if ( code.equals("16") ) description = "";
        if ( code.equals("17") ) description = "";
        if ( code.equals("18") ) description = "복지관 1층 옆에 있는 건물 이에요";
        if ( code.equals("19") ) description = "";
        if ( code.equals("20") ) description = "공학실습동은 7,8 강의동의 중간 엘리베이터 옆에 이어져있어요!";

        if ( code.equals("21") ) description = "";
        if ( code.equals("22") ) description = "산학협력팀은 창업보육센터 2층에 / 창업지원단은 한우리관 4층에 위치해 있어요!";
        if ( code.equals("23") ) description = "";
        if ( code.equals("24") ) description = "국제교류처는 홍보관 2층에 위치해 있어요!";
        if ( code.equals("25") ) description = "";
        if ( code.equals("26") ) description = "";
        if ( code.equals("27") ) description = "이스퀘어는 4강의동과 종합강의동의 중간에 위치해 있어요!";
        if ( code.equals("28") ) description = "감성코어는 도서관 옆에 위치해 있어요!";
        if ( code.equals("29") ) description = "오아시스는 홍보관 1층에 위치해 있어요!";
        if ( code.equals("30") ) description = "경슐랭은 복지관 지하 1층에 위치해 있어요!";

        if ( code.equals("31") ) description = "";
        if ( code.equals("32") ) description = "";
        if ( code.equals("33") ) description = "";

        return description;
    }
}
