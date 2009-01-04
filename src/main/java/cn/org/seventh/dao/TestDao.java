package cn.org.seventh.dao;

import java.util.Map;

/**
 * @spring.bean
 * @author Seventh
 * @ibatis.config
 * @ibatis.type-alias type="java.util.Map" alias="test1"
 * @ibatis.type-alias type="java.util.Map" alias="test2"
 * @ibatis.type-alias type="java.util.Map" alias="test3"
 * @ibatis.type-alias type="java.util.Map" alias="test4"
 * @ibatis.type-alias type="java.util.Map" alias="test5"
 */
public class TestDao extends BaseDao {
	/**
	 * @ibatis.map type="insert"
	 * @ibatis.sql insert into ACCOUNT ( ACC_ID, ACC_FIRST_NAME, ACC_LAST_NAME,
	 *             ACC_EMAIL values ( #id#, #firstName#, #lastName#,
	 *             #emailAddress# )
	 */
	public Object insertTest(Map param) {
		return insert("insertTest", param);
	}
}
