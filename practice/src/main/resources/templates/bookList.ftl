<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
</head>
<body>
	<a href="/bookAdd.html">添加图书</a></br>
	<th>图书编号</th>&nbsp;&nbsp;
	<th>图书名</th>&nbsp;&nbsp;
	<th>图书作者</th>&nbsp;&nbsp;
	<th>操作</th></br>
	<#list bookList as book>
		<td>${book.id}</td>&nbsp;&nbsp;
		<td>${book.name}</td>&nbsp;&nbsp;
		<td>${book.author}</td>&nbsp;&nbsp;
		<a href="/book/preUpdate/${book.id}">修改</a>
		<a href="/book/delete/${book.id}">删除</a>
		</br>
	</#list>
</body>
</html>