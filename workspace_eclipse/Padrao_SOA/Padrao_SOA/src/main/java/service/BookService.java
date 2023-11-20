package service;

@Service
public class BookService {
	private List<Book> bookList = new ArrayList<>();
	public List<Book> findAll(){
		return this.bookList;
	}
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L,"Delphin Blanco","Contos");
		Book b2 = new Book(2L,"Python com Matemática","Programação");
		Book b3 = new Book(3L,"Cozinha Mineira","Gastronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
}
