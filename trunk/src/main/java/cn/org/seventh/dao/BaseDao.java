package cn.org.seventh.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @spring.bean
 * @author Andy
 */
public class BaseDao extends SqlMapClientDaoSupport {
	private static final Logger logger = Logger.getLogger(BaseDao.class);

	// private SqlMapClientTemplate sqlMapClientTemplate =
	// getSqlMapClientTemplate();
	//
	// /**
	// * @ibatis.map type="delete"
	// * @ibatis.sql delete from Test
	// */
	public int delete(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().delete(statementName, parameterObject);

	}

	//
	// /**
	// * @ibatis.map type="insert"
	// * @ibatis.sql insert into ACCOUNT ( ACC_ID, ACC_FIRST_NAME,
	// ACC_LAST_NAME,
	// * ACC_EMAIL values ( #id#, #firstName#, #lastName#,
	// * #emailAddress# )
	// */
	public Object insert(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().insert(statementName, parameterObject);
	}

	//
	// /**
	// * @ibatis.map type="select" result-map="queryForList"
	// * @ibatis.result-map
	// * @ibatis.result property="hello" column="ACC_LAST_NAME"
	// * @ibatis.result property="hello" column="ACC_LAST_NAME"
	// * @ibatis.result property="hello" column="ACC_LAST_NAME"
	// * @ibatis.result property="hello" column="ACC_LAST_NAME"
	// * @ibatis.result property="hello" column="ACC_LAST_NAME"
	// * @ibatis.sql select * from ACCOUNT
	// */
	public List queryForList(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().queryForList(statementName,
				parameterObject);
	}

	//
	// /**
	// * @ibatis.map id="asdasd" type="select"
	// * @ibatis.result-map
	// * @ibatis.discriminator java-type="sda"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sub-map result-map="asdasd" value="asdasd"
	// * @ibatis.sql select ACC_ID as id, ACC_FIRST_NAME as firstName,
	// * ACC_LAST_NAME as lastName, ACC_EMAIL as emailAddress from
	// * ACCOUNT where ACC_ID = #id#
	// */
	public Object queryForObject(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().queryForObject(statementName,
				parameterObject);
	}

	//
	// /**
	// * @ibatis.map
	// * @ibatis.sql update ACCOUNT set ACC_FIRST_NAME = #firstName#,
	// * ACC_LAST_NAME = #lastName#, ACC_EMAIL = #emailAddress# where
	// * ACC_ID = #id#
	// */
	public int update(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().update(statementName, parameterObject);
	}

}
