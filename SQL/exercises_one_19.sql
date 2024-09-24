/*Nancy forget the wallet on the office, his fist name is Nancy, 
and her last name is Thomas. How can I search for her email?
solution:

SELECT email FROM customer
WHERE first_name = 'Nancy'
AND last_name = 'Thomas';
---------------------------------------------------------------
A customer want to know what the movie "Ourlaw Hanky" is about. 
Could you give them the desctiption for the movie?
Solution:

SELECT description FROM film
WHERE title = 'Outlaw Hanky';
---------------------------------------------------------------
A customer is late on their movie return, 
and we've mailed them a letter to their 
address at '259 Ipoh Drive'. We should also
call them on the phone to let them know.
Can you get the phone number for the
customer who lives at '259 Ipoh Drive'?
solution:
*/
SELECT phone FROM address
WHERE address = '259 Ipoh Drive';
