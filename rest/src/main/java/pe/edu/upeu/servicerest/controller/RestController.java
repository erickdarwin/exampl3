package pe.edu.upeu.servicerest.controller;

import pe.edu.upeu.servicerest.dao.UserDao;

public class RestController {
	
	@Autowired
	@Qualifier("userDao")
	protected UserDao userDao;
	
	@RequestMapping(value = "/servicerest/userall/{parametro}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<User> findUserAll(@PathVariable String parametro) {		
		
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1L);
		user.setUserName("erick darwin");
		list.add(user);

		user = new User();
		user.setId(2L);
		user.setUsernemeber("02842850");
		list.add(user);

		

		return list;
		User user = new User();
		User.setUserName(parametro);

		userDao.save(user);

		return UserDao.findUserAll();
	}

	
}

