package com.wayn.util.util.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.wayn.util.constant.SysConstants;

import java.util.Date;

public class JwtUtil {
    // token过期时间30天
    private static long EXPIRE = 30 * 24 * 60 * 60 * 1000L;
    /**
     * 生成签名
     *
     * @param token  用户唯一标识
     * @param secret 用户的密码
     * @return 加密的token
     */
    public static String sign(String token, String secret) {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis + EXPIRE);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                .withClaim(SysConstants.SIGN_KEY, token)
                .withIssuedAt(new Date())
                // 设置过期时间
                .withExpiresAt(date)
                .sign(algorithm);
    }


    /**
     * 校验token是否正确
     *
     * @param token  密钥
     * @param secret 用户的密码
     * @return 是否正确
     */
    public static boolean verify(String token, String userId, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).withClaim("userId", userId).build();
            verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }


    /**
     * 获取签发时间
     *
     * @param token token
     * @return 签发时间
     */
    public static Date getIssuedAt(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getIssuedAt();
        } catch (JWTDecodeException e) {
            return null;
        }
    }


    /**
     * 根据token获取解析后的Claims
     *
     * @return token中的Claims
     */
    public static DecodedJWT parseToken(String token) {
        return JWT.decode(token);
    }

}
