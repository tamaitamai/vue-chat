package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static RowMapper<User> USER_ROW_MAPPER=(rs,i)->{
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setMail(rs.getString("mail"));
		user.setPassword(rs.getString("password"));
		return user;
	};
	
	/**
	 * ユーザー新規登録
	 * @param user
	 */
	public void insert(User user) {
		String sql = "INSERT INTO vc_users(mail, password)VALUES(:mail, :password);";
		SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		template.update(sql, params);
	}
	
	/**
	 * ログイン
	 * @param mail
	 * @param password
	 * @return
	 */
	public User login(String mail, String password) {
		String sql = "SELECT * FROM vc_users WHERE mail = :mail AND password = :password;";
		try {
			SqlParameterSource params = new MapSqlParameterSource("mail", mail).addValue("password", password);
			return template.queryForObject(sql, params, USER_ROW_MAPPER);			
		}
		catch (Exception e) {
			return null;
		}
	}
}
