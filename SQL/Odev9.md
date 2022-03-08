# SORU 1
city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```SQL
SELECT city.city, country.country FROM city JOIN country ON city.city_ID = country.country_ID
```
# SORU 2
customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```SQL
SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment JOIN customer ON payment.payment_id = customer.customer_id
```
# SORU 3
customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```SQL
SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental JOIN customer ON rental.rental_id = customer.customer_id
```
