package com.oopConcept;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public Book()
	{
		bookId=101;
		title="Java Programming";
		author="James Gosling";
		price=650;
		
	}
	public void display()
	{
		System.out.println("Book ID:"+bookId);
		System.out.println("Title :"+ title);
		System.out.println("Author :"+author);
		System.out.println("price :"+price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.display();
		

	}

}
