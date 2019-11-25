package com.alit.study.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ask_deny_keys")
public class AskDenyKeys {
  @Id
  @GenericGenerator(name = "system-uuid", strategy = "uuid2")
  @GeneratedValue(generator = "system-uuid")
  private String id;
  // 屏蔽关键字,关键字过滤
  @Column(nullable = false)
  private String denyKeys;
  // 屏蔽关键字显示内容
  @Column(nullable = false)
  private String responseContent;
}
