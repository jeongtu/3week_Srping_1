public class Taxi {

    //멤버변수(속성,정보)



     taxiNumber;               // 택시번호
    int fuelVolume;               // 주유량
    int curSpeed;                 // 현재속도
    String destination;              // 목적지
    int basicDistance;            // 기본거리
    int distanceToDestination;    // 목저기까지 거리
    int basicFare;                // 요금
    int farePerDistance;          // 거리당 요금
    String status;                   // 상태(운행중, 일반)

    // 메서드(함수)
    void driveStart() {}            // 운행시작
    void passengerChange() {}       // 승객탑승
    void speedChange() {}           // 속도변경
    void addFarePerDistance() {}    // 거리당 요금 추가
    void payment() {}               // 요금 결제
}


