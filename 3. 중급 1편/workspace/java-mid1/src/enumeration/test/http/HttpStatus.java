package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    //생성자
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    //조회기능
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    //코드값에 따른 성공기능
    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }


    //values(): OK, BAD_REQUEST, NOT_FOUND, INTERNAL_SERVER_ERROR를 참조값을 반환함
    //HTTP 상태 코드(int code)를 받아 해당하는 HttpStatus Enum 상수를 찾아 반환하는 역할을 함
    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : values()) {
            if (status.getCode() == code){
                return status;
            }
        }
        return null;
    }
}
