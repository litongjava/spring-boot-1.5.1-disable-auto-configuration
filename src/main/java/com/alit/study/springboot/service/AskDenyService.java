package com.alit.study.springboot.service;

import java.util.List;

import com.alit.study.springboot.entity.AskDenyKeys;

public interface AskDenyService {
  public List<AskDenyKeys> findAll(int page, int rows);
  public void save(AskDenyKeys askDeny);
  public void delete(int id);
  public List<AskDenyKeys> findAll();
}
