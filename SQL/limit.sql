
SELECT * FROM payment
WHERE amount != 0.00
ORDER BY payment_date ASC
LIMIT 5;

----------------------------------
/*
SELECT * FROM rental
ORDER BY rental_date DESC
LIMIT 5;
*/