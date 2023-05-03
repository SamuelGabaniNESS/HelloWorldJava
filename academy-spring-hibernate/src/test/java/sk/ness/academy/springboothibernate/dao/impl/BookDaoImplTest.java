package sk.ness.academy.springboothibernate.dao.impl;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import sk.ness.academy.config.TestDataSourceConfig;
import sk.ness.academy.springboothibernate.dao.BookDao;
import sk.ness.academy.springboothibernate.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = { TestDataSourceConfig.class, BookDaoImpl.class })
@Transactional
@Sql({"/initdb.sql"})
class BookDaoImplTest {

  @Autowired
  private BookDao bookDao;

  @BeforeEach
  public void beforeEach() {
    System.out.println("### BeforeEach ###");
  }

  @Test
  void findAllTest() {
    final List<Book> books = bookDao.findAll();
    Assertions.assertEquals(3, books.size());
    Assertions.assertEquals(1, books.get(0).getId());
    Assertions.assertEquals(2, books.get(1).getId());
    Assertions.assertEquals(4, books.get(2).getId());
  }

}