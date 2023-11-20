package controller;


@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping
	public List<Book> getAllBooks(){
		List<Book>allBooks = service.findAll();
		return allBook;
	}

}
