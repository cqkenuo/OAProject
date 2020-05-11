package com.js.common.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;

/**
 * @description  token 工具类
 * @date 2019/12/3 11:01
 */
@Slf4j
public class TokenUtil {
    TokenUtil() {
        throw new IllegalStateException("Utility class");
    }

    /**token过期时间目前暂时是15分钟**/
    private static final int EXPIRE_TIME = 15 * 60 * 1000;
    /**公共密钥**/
    private static final String TOKEN_SECRET = "wddcdfdfhjtjthjdffsdfsd33hcskdncksndcnsnsvsdcsdc";

    /**生成token**/
    public static String sign(String studentNumber, String name) {
        String token = null;
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            //私钥及加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            //设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("typ", "JWT");
            header.put("alg", "HS256");
            //附带String studentNumber等信息
            token = JWT.create()
                    .withHeader(header)
                    .withClaim("studentNumber", studentNumber)
                    .withClaim("name", name)
                    .withExpiresAt(date)
                    .sign(algorithm);

        } catch (Exception ex) {
            log.info("Token出现的异常为{}",ex.toString());
        }
        return token;
    }

    /**验证是否登录状态**/
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            log.info("结果为{}",jwt.toString());
            return true;
        } catch (Exception ex) {
            return false;
        }

    }
}
