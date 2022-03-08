# SORU 1
city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
```SQL
SELECT city, country FROM city LEFT JOIN country ON city.city_id = country.country_id
```
# SORU 2
customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
```SQL
SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment RIGHT JOIN customer ON customer.customer_id = payment.payment_id
```
# SORU 3
customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
```SQL
SELECT customer.first_name, customer.last_name , rental.rental_id FROM rental FULL JOIN customer ON rental.customer_id = customer.customer_id
```
