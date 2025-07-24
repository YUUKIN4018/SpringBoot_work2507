package com.college.yi.bookmanager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.college.yi.bookmanager.model.Book;
import com.college.yi.bookmanager.model.BookEntity;
import com.college.yi.bookmanager.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

		public List<Book> getBooksList() {
	
			List<BookEntity> books = new ArrayList<>();
	
			books = bookRepository.findAll();
	
			if (books.isEmpty()) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	
			// エンティティからモデルに変換(Stream API)
			List<Book> booksModel = books.stream()
					.map(entity -> new Book(
							entity.getId(),
							entity.getTitle(),
							entity.getAuthor(),
							entity.getPublisher(),
							entity.getPublishedDate(),
							entity.getStock()))
					.collect(Collectors.toList());
	
			return booksModel;
		}

	// 新規登録
	public Book createBook(Book newBook) {
		// モデル → エンティティ に変換
		BookEntity entity = new BookEntity(
				newBook.getTitle(),
				newBook.getAuthor(),
				newBook.getPublisher(),
				newBook.getPublishedDate(),
				newBook.getStock());

		// DB登録（MyBatisでは INSERT用のMapperが必要）
		bookRepository.insert(entity);

		// DBでIDが自動採番された場合、entity.getId() で取得可能

		// エンティティ → モデル に再変換して返す
		return new Book(
				entity.getId(),
				entity.getTitle(),
				entity.getAuthor(),
				entity.getPublisher(),
				entity.getPublishedDate(),
				entity.getStock());
	}

	// 更新
	public Book updateBook(int id, Book updatedBook) {
		// IDに該当する書籍が存在するか確認
		BookEntity existing = bookRepository.findById(id);
		if (existing == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "書籍が存在しません");
		}

		// 更新内容をエンティティに詰め直し
		BookEntity entityToUpdate = new BookEntity(
				id,
				updatedBook.getTitle(),
				updatedBook.getAuthor(),
				updatedBook.getPublisher(),
				updatedBook.getPublishedDate(),
				updatedBook.getStock());

		// 更新処理
		bookRepository.update(entityToUpdate);

		// 更新後のレスポンスを返却
		return new Book(
				entityToUpdate.getId(),
				entityToUpdate.getTitle(),
				entityToUpdate.getAuthor(),
				entityToUpdate.getPublisher(),
				entityToUpdate.getPublishedDate(),
				entityToUpdate.getStock());
	}

	// 削除処理
	public void deleteBook(int id) {
		int result = bookRepository.deleteById(id);
		if (result == 0) {
			// 指定IDの書籍が存在しなかった場合 → 404エラー
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "書籍が見つかりません");
		}
	}
}
