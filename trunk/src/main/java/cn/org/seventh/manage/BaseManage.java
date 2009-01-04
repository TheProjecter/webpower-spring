package cn.org.seventh.manage;

import java.util.List;

import org.springframework.dao.DataAccessException;

import cn.org.seventh.dao.BaseDao;

/**
 * @spring.manage
 * @author Andy
 * 
 */
public class BaseManage {
	private BaseDao baseDao;

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	/**
	 * @service.method
	 * @param statementName
	 * @param parameterObject
	 * @return
	 * @throws DataAccessException
	 */
	public int delete(String statementName, Object parameterObject)
			throws DataAccessException {
		return baseDao.delete(statementName, parameterObject);
	}

	/**
	 * @service.method
	 * @param statementName
	 * @param parameterObject
	 * @return
	 * @throws DataAccessException
	 */
	public Object insert(String statementName, Object parameterObject)
			throws DataAccessException {
		return baseDao.insert(statementName, parameterObject);
	}

	/**
	 * @service.method
	 * @param statementName
	 * @param parameterObject
	 * @return
	 * @throws DataAccessException
	 */
	public List queryForList(String statementName, Object parameterObject)
			throws DataAccessException {
		return baseDao.queryForList(statementName, parameterObject);
	}

	/**
	 * @service.method
	 * @param statementName
	 * @param parameterObject
	 * @return
	 * @throws DataAccessException
	 */
	public Object queryForObject(String statementName, Object parameterObject)
			throws DataAccessException {
		return baseDao.queryForObject(statementName, parameterObject);
	}

	/**
	 * @service.method
	 * @param statementName
	 * @param parameterObject
	 * @return
	 * @throws DataAccessException
	 */
	public int update(String statementName, Object parameterObject)
			throws DataAccessException {
		return baseDao.update(statementName, parameterObject);
	}

}
