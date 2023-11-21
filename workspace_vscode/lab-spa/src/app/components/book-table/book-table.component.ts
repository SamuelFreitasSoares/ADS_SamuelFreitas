import { Component } from '@angular/core';
import { IBook } from 'src/app/models/i-book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.css']
})
export class BookTableComponent {
  books: IBook[] = [];

  constructor(private service: BookService) { }

  ngOnInit(): void {
    this.books = [
      { id: 3, title: "Quem pensa enriquece", category: "Finanças" },
      { id: 4, title: 'Em busca de nós mesmo', category: 'Filosofia' },
      { id: 5, title: 'A História da Fada Azulina', category: 'Conto Infantil' },
    ];

    for (let b of this.books) {
      console.log(b.id);
      console.log(b.title);
      console.log(b.category);
    }
  }

}
