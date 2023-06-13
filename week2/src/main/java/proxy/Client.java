package proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 interface Searcher {
     void doSearch(String userId, String keyword);
}

 class RealSearcher implements Searcher {
    @Override
    public void doSearch(String userId, String keyword) {
        System.out.println(userId+":正在查询关键词信息："+keyword);
    }
}

 class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("身份认证成功!");
        return true;
    }
}

 class Logger {
    public void log(String userId, String keyword) {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        // 自定义时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        // 记录查询日志
        System.out.println(formattedDateTime+" 用户 " + userId + " 查询了信息： " + keyword);
    }
}

 class ProxySearcher implements Searcher {
    private RealSearcher realSearcher;
    private AccessValidator validator;
    private Logger logger;

    public ProxySearcher() {
        this.realSearcher = new RealSearcher();
        this.validator = new AccessValidator();
        this.logger = new Logger();
    }

    public void doSearch(String userId, String keyword) {
        if (validator.validate(userId)) {
            // 调用查询方法
            realSearcher.doSearch(userId, keyword);
            // 记录查询日志
            logger.log(userId, keyword);

        } else {
            System.out.println("身份验证失败");
        }
    }
}

// 测试类
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        String userId = "张三";
        String keyword = "年纪";
        searcher.doSearch(userId, keyword);
    }
}
