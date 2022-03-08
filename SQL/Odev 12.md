# SORU 1
film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
```SQL
SELECT COUNT(film) FROM film WHERE length > (SELECT AVG(length) FROM Film)
```
# SORU 2
film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
```SQL
SELECT COUNT(*) FROM film WHERE rental_rate=( SELECT MAX(rental_rate) FROM film)
```
# SORU 3
film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
```SQL
SELECT COUNT(*) FROM film WHERE rental_rate = ALL ( SELECT MIN(rental_rate) FROM film) AND replacement_cost = ANY (SELECT MIN(replacement_cost) FROM film)
```
# SORU 4
payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
```SQL
SELECT customer.firs_name,customer.last_name FROM payment IINNER JOIN customer ON customer.customer_id = payment.customer_id WHERE payment.amount=(SELECT MAX(amount) FROM payment);
```
