package com.alit.study.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.alit.study.springboot.entity.AskDenyKeys;
import com.alit.study.springboot.repository.AskDenyKeysRepository;
import com.alit.study.springboot.service.AskDenyService;
@Service
public class AskDenyServiceImpl implements AskDenyService {

	@Autowired
	private AskDenyKeysRepository askDenyKeysDao;

	public List<AskDenyKeys> findAll(int page, int rows) {
		PageRequest pageRequest = new PageRequest(page - 1, rows);
		Page<AskDenyKeys> findAll = askDenyKeysDao.findAll(pageRequest);
		return findAll.getContent();
	}

	public List<AskDenyKeys> findAll() {
		List<AskDenyKeys> findAll = askDenyKeysDao.findAll();
		return findAll;
	}

	public void save(AskDenyKeys askDeny) {
		@SuppressWarnings("unused")
		AskDenyKeys save = askDenyKeysDao.save(askDeny);
	}

	public void delete(int id) {
		askDenyKeysDao.delete(id);
	}
}
