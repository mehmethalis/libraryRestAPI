# libraryRestAPI
Library API which has developed with JAVA / Spring / MVC


# Author

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/author/authors | `GET` | Empty | List all authors. |
| /api/author/add | `POST` | {'name':'foo', 'surname':'bar'} | Create a new author. |
| /api/author/authors/:author_id | `GET` | Empty | Get a author. |
| /api/author/update | `PUT` | {'id':'1','name':'foo', 'surname':'bar'} | Update a author with new info. |
| /api/author/delete | `DELETE` | {'id':'1','name':'foo', 'surname':'bar'} | Delete a author. |

# Book

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/book/books | `GET` | Empty | List all books. |
| /api/book/add | `POST` | { "author_id": 0,"category_id": 0,"id": 0,"is_shelf": true, "isbn": "string","location_number":"string" "name": "string","publication_id": 0,"whose_id": 0,"year_printing": 0}| Create a new book. |
| /api/book/books/:book_id | `GET` | Empty | Get a book. |
| /api/book/update | `PUT` | {"id":"1", "author_id": 0,"category_id": 0,"id": 0,"is_shelf": true, "isbn": "string","location_number":"string" "name": "string","publication_id": 0,"whose_id": 0,"year_printing": 0} | Update a book with new info. |
| /api/book/delete | `DELETE` | {"id":"1", "author_id": 0,"category_id": 0,"id": 0,"is_shelf": true, "isbn": "string","location_number":"string" "name": "string","publication_id": 0,"whose_id": 0,"year_printing": 0}| Delete a book. |

# Category

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/category/categories | `GET` | Empty | List all categories. |
| /api/category/add | `POST` | {'name':'foo'} | Create a new category. |
| /api/category/categories/:category_id | `GET` | Empty | Get a category. |
| /api/category/update | `PUT` | {'id':'1','name':'foo'} | Update a category with new info. |
| /api/category/delete | `DELETE` | {'id':'1','name':'foo'} | Delete a category. |

# Employee

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/employee/employees | `GET` | Empty | List all employees. |
| /api/employee/add | `POST` | {
  "birth_day": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"
} | Create a new employee. |
| /api/employee/employees/:employee_id | `GET` | Empty | Get a employee. |
| /api/employee/update | `PUT` | {'id':'1',"birth_day": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"} | Update a employee with new info. |
| /api/employee/delete | `DELETE` | {'id':'1',"birth_day": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"} | Delete a employee. |

  # Member

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/member/members | `GET` | Empty | List all members. |
| /api/member/add | `POST` | {
  "birth_day": "string",
  "date_membership": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"
} | Create a new member. |
| /api/member/members/:member_id | `GET` | Empty | Get a member. |
| /api/member/update | `PUT` | {'id':'1',"birth_day": "string",
  "date_membership": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"} | Update a member with new info. |
| /api/member/delete | `DELETE` | {'id':'1',"birth_day": "string",
  "date_membership": "string",
  "email": "string",
  "id": 0,
  "id_number": "string",
  "name": "string",
  "phone": "string",
  "surname": "string"} | Delete a member. |

  # Publication

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/publication/publications | `GET` | Empty | List all publications. |
| /api/publication/add | `POST` | {'name':'foo'} | Create a new publication. |
| /api/publication/publications/:publication_id | `GET` | Empty | Get a publication. |
| /api/publication/update | `PUT` | {'id':'1','name':'foo'} | Update a publication with new info. |
| /api/publication/delete | `DELETE` | {'id':'1','name':'foo'} | Delete a publication. |

# Swagger-UI Read Document
http://localhost:9090/swagger-ui.html


