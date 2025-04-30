package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){ //메서드추출
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect(); //연결을 호출하면 disconnect()를 반드시 호출하도록 한다
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
