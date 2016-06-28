package tv.yikesaiting.springbootdemo;

import org.springframework.stereotype.Service;

/**
 * Created by littlekeng on 16/6/28.
 */
@Service
public class HelloService {
    private String msg;

    public String sayHello() {
        return "Hello"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
