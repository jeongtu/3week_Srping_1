//속성 = 정적인 정보 = 멤버 변수
//기능 = 작업에 대한 수행 = 메서드(함수)
//
//Class = 설계도 역할(스마트폰 설계에 마제 생산하는 과정의 설계도 역할)
//Instance = 생상된 스마트폰(객체 or 개체)
//
//은행 계좌 = 공통적인 속성과 기능


import org.w3c.dom.ls.LSOutput;

public class Bus {

    //멤버변수(속성,정보)
    private final int maxPassenger;                                //최대 승객수
    private int curPassenger;                                     // 현재 승객수
    private final int fare = 1000;                       // 요금
    private final int busNumber;                                // 버스 번호
    private int fuelVolume;                                    // 주유량
    private int curSpeed;                                      // 현재 속도
    String status = "운행";                                    // 상태

    //기본 생성자
    public Bus(int maxPassenger, int curPassenger, int busNumber, int fuelVolume, int curSpeed, String status ) {
            this.maxPassenger = maxPassenger;               //최대 승객수
            this.curPassenger = curPassenger;               // 현재 승객수
            this.busNumber = busNumber;                     // 버스 번호
            this.fuelVolume = fuelVolume;                   // 주유량
            this.curSpeed = curSpeed;                      // 현재 속도
    }

    // 메서드(함수)
    public void drive() {}                 // 운행
    public void stateChange() {            // 버스상태변경
        if(fuelVolume < 10) {
            System.out.println("주유가 필요하다");
        }
    }
    public void passengerChange() {

    }       // 승객탑승
    public void speedChange() {            // 속도변경
        if (fuelVolume >= 10){

        } else {
            System.out.println("주유량을 확인해주세요");
        }
    }
}

