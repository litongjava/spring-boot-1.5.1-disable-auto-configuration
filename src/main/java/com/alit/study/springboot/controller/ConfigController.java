package com.alit.study.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alit.study.springboot.entity.AskDenyKeys;
import com.alit.study.springboot.repository.AskDenyKeysRepository;
import com.alit.study.springboot.service.AskDenyService;

@Controller
@RequestMapping("config")
@SuppressWarnings("all")
public class ConfigController {

  @Autowired
  private AskDenyService askDenyService;

  @Autowired
  private AskDenyKeysRepository askDenyKeysDao;

  /**
   * 返回禁止的关键字
   */
  @RequestMapping(value = "deny-keys", produces = "application/json;charset=utf-8")
  @ResponseBody
  public Map denyKeys(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
      @RequestParam(value = "rows", defaultValue = "10", required = false) int rows) {
    List<AskDenyKeys> content = askDenyService.findAll(page, rows);
    Map map = new HashMap();
    map.put("total", content.size());
    map.put("rows", content);
    return map;
  }

  @RequestMapping(value = "save-deky-keys")
  @ResponseBody
  public Map saveDenyKeys(AskDenyKeys keys) {
    askDenyKeysDao.save(keys);
    Map map = new HashMap();
    map.put("success", true);
    return map;
  }
}
