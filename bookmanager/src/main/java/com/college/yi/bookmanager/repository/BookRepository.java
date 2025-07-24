package com.college.yi.bookmanager.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.college.yi.bookmanager.model.BookEntity;

@Mapper
public interface BookRepository {
	
	@Select("SELECT * FROM books")
	List<BookEntity> findAll();
	
	//登録
	@Insert("INSERT INTO books (title, author, publisher, published_date, stock) " +
	        "VALUES (#{title}, #{author}, #{publisher}, #{publishedDate}, #{stock})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(BookEntity book);
	
	//更新
	@Select("SELECT * FROM books WHERE id = #{id}")
	BookEntity findById(int id);

	@Update("UPDATE books SET title = #{title}, author = #{author}, publisher = #{publisher}, " +
	        "published_date = #{publishedDate}, stock = #{stock} WHERE id = #{id}")
	void update(BookEntity book);
	
    // 削除
    @Delete("DELETE FROM books WHERE id = #{id}")
    int deleteById(int id);

}
