package com.adroitfirm.rydo.utility;

import java.security.Key;
import java.util.Date;

import com.adroitfirm.rydo.dto.UserDto;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JwtUtils {

	private final String SECRET;
	private final long EXPIRATION;
	
//	private static final String SECRET = "YOUR-256-BIT-SECRET-YOU-MUST-KEEP-SAME-AS-USER-SERVICE";
//    private final long EXPIRATION = 1000 * 60 * 60 * 10; // 10 hours

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }
    
    public String generateToken(UserDto userDto) {
        return Jwts.builder()
                .setSubject(userDto.getPhone())
                .claim("role", userDto.getRole())
                .claim("userId", userDto.getId())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(getSigningKey())
                .compact();
    }

    public Claims extractClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getSigningKey()).build()
                .parseClaimsJws(token)
                .getBody();
    }
    
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }
}
