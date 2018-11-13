<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改图书</title>
</head>
<body>
	<form action="/book/update" method="post">
		图书编号<input type="hidden" name="id" value="${book.id}"></br>
		图书名<input type="text" name="name" value="${book.name}"></br>
		图书作者<input type="text" name="author" value="${book.author}"></br>
		<input type="submit" value="修改">
	</form>
</body>
</html>