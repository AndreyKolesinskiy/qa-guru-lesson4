Homework for lesson#4

Question:

Is there a difference between $("h1 div"); and $("h1").$("div"); - can the search find different elements

Answer:

$("h1 div"); will try to find a combination where div is inside h1


$("h1").$("div"); will try to find first h1 element and after that will try to find div element inside it. So, if first h1 doesn't contain div then we won't find anything 
