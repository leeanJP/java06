package chap06;

public class Earth {
    //상수 선언 및 초기화
    static final double EARTH_RADIUS = 6378.137;

    //상수 선언
    static final double EARTH_SURFACE_AREA;

    //정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }


    public static void main(String[] args) {
        // 상수 읽기
        System.out.println("지구의 반지름 : " + EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " + EARTH_SURFACE_AREA + "km^2");

    }
}
