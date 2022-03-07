# SORU 1
test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
```SQL
CREATE TABLE employee (id  SERIAL PRIMARY KEY, full_name VARCHAR(50), birthday DATE,email VARCHAR(100))
```
# SORU 2
Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```SQL
insert into employee (full_name, birthday, email) values ('Ursuline Woolacott', '8/30/1962', 'uwoolacott0@jugem.jp');
insert into employee (full_name, birthday, email) values ('Samuele Rackam', '5/25/1954', 'srackam1@cdc.gov');
insert into employee (full_name, birthday, email) values ('Syd Manjin', '2/11/1956', 'smanjin2@ibm.com');
insert into employee (full_name, birthday, email) values ('Marietta Blunsden', '10/15/1953', 'mblunsden3@dyndns.org');
insert into employee (full_name, birthday, email) values ('Christian Swinglehurst', '7/18/1991', 'cswinglehurst4@buzzfeed.com');
insert into employee (full_name, birthday, email) values ('Fleur Eldritt', '7/2/1969', 'feldritt5@businessweek.com');
insert into employee (full_name, birthday, email) values ('Phillie Gwynne', '3/5/1957', 'pgwynne6@51.la');
insert into employee (full_name, birthday, email) values ('Salem Berryman', '9/16/1961', 'sberryman7@washington.edu');
insert into employee (full_name, birthday, email) values ('Sandy Ayre', '4/3/1992', 'sayre8@weibo.com');
insert into employee (full_name, birthday, email) values ('Gibby Biddiss', '2/27/2000', 'gbiddiss9@ocn.ne.jp');
insert into employee (full_name, birthday, email) values ('Devan Nano', '8/11/1988', 'dnanoa@amazon.co.jp');
insert into employee (full_name, birthday, email) values ('Lela Affuso', '9/23/1996', 'laffusob@hexun.com');
insert into employee (full_name, birthday, email) values ('Joellyn Pashbee', '11/11/1993', 'jpashbeec@smh.com.au');
insert into employee (full_name, birthday, email) values ('Jackquelin Gonoude', '10/19/1994', 'jgonouded@dot.gov');
insert into employee (full_name, birthday, email) values ('Ronnica Shillan', '5/5/1998', 'rshillane@xrea.com');
insert into employee (full_name, birthday, email) values ('Alex Densey', '12/24/1950', 'adenseyf@samsung.com');
insert into employee (full_name, birthday, email) values ('Harlene Clewlow', '2/13/1967', 'hclewlowg@squidoo.com');
insert into employee (full_name, birthday, email) values ('Thomasin Berlin', '11/14/1958', 'tberlinh@tmall.com');
insert into employee (full_name, birthday, email) values ('Baxie Mesias', '6/22/2004', 'bmesiasi@spiegel.de');
insert into employee (full_name, birthday, email) values ('Kimberli Jaques', '2/18/2002', 'kjaquesj@hubpages.com');
insert into employee (full_name, birthday, email) values ('Obediah Bramhall', '8/5/1980', 'obramhallk@independent.co.uk');
insert into employee (full_name, birthday, email) values ('Leonid Millimoe', '12/4/1982', 'lmillimoel@forbes.com');
insert into employee (full_name, birthday, email) values ('Robenia Fulker', '2/26/1968', 'rfulkerm@barnesandnoble.com');
insert into employee (full_name, birthday, email) values ('Anica Cantera', '6/19/1979', 'acanteran@ca.gov');
insert into employee (full_name, birthday, email) values ('Rickie Sinderland', '11/30/1986', 'rsinderlando@discuz.net');
insert into employee (full_name, birthday, email) values ('Nell Stonnell', '8/5/1991', 'nstonnellp@weibo.com');
insert into employee (full_name, birthday, email) values ('Cleon Hurtic', '8/21/2002', 'churticq@hostgator.com');
insert into employee (full_name, birthday, email) values ('Ollie Bathersby', '5/18/1994', 'obathersbyr@angelfire.com');
insert into employee (full_name, birthday, email) values ('Baillie Swanne', '5/22/2004', 'bswannes@so-net.ne.jp');
insert into employee (full_name, birthday, email) values ('Craig Foltin', '6/16/1959', 'cfoltint@miitbeian.gov.cn');
insert into employee (full_name, birthday, email) values ('Raleigh Hanmer', '3/26/1967', 'rhanmeru@pagesperso-orange.fr');
insert into employee (full_name, birthday, email) values ('Sissy Boatright', '9/21/1982', 'sboatrightv@yelp.com');
insert into employee (full_name, birthday, email) values ('Evie Boullin', '6/11/1956', 'eboullinw@globo.com');
insert into employee (full_name, birthday, email) values ('Byram Rowswell', '5/19/1994', 'browswellx@storify.com');
insert into employee (full_name, birthday, email) values ('Hilda Greatorex', '8/16/2001', 'hgreatorexy@independent.co.uk');
insert into employee (full_name, birthday, email) values ('Gerry Flippen', '3/22/1968', 'gflippenz@blog.com');
insert into employee (full_name, birthday, email) values ('Quinta Neilson', '2/12/1991', 'qneilson10@mashable.com');
insert into employee (full_name, birthday, email) values ('Clarette Erni', '10/4/2000', 'cerni11@exblog.jp');
insert into employee (full_name, birthday, email) values ('Irvin Watt', '1/6/1959', 'iwatt12@gravatar.com');
insert into employee (full_name, birthday, email) values ('Rod Lavens', '11/25/1986', 'rlavens13@tamu.edu');
insert into employee (full_name, birthday, email) values ('Carley Chrispin', '9/11/1983', 'cchrispin14@4shared.com');
insert into employee (full_name, birthday, email) values ('Rudiger Lamlin', '1/6/1995', 'rlamlin15@jimdo.com');
insert into employee (full_name, birthday, email) values ('Kim Suggett', '9/20/1958', 'ksuggett16@nymag.com');
insert into employee (full_name, birthday, email) values ('Van Litel', '12/12/1998', 'vlitel17@nasa.gov');
insert into employee (full_name, birthday, email) values ('Cam Scholler', '12/11/1979', 'cscholler18@newsvine.com');
insert into employee (full_name, birthday, email) values ('Mateo Cardon', '10/18/1971', 'mcardon19@xing.com');
insert into employee (full_name, birthday, email) values ('Wendall Alvarado', '5/20/1973', 'walvarado1a@hugedomains.com');
insert into employee (full_name, birthday, email) values ('Andrea Pochet', '6/8/1980', 'apochet1b@angelfire.com');
insert into employee (full_name, birthday, email) values ('Hillard Skalls', '5/16/1974', 'hskalls1c@pbs.org');
insert into employee (full_name, birthday, email) values ('Lucy Cronchey', '2/5/1977', 'lcronchey1d@livejournal.com');
```
# SORU 3
Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```SQL
UPDATE employee SET name = 'Kim Alvardo' WHERE id = 38;
UPDATE employee SET birthday = '19/04/1982' WHERE id BETWEEN 10 AND 13
UPDATE employee SET email = 'example@example' WHERE name = 'Marietta Blunsden'
UPDATE employee SET birthday = '01/01/1900' WHERE name LIKE 'B%y'
```
# SORU 4
Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```SQL
DELETE employee WHERE name LIKE 'E%a'
DELETE employee WHERE name = 'A%a' AND id BETWEEN 10 AND 30  
DELETE employee ORDER BY birthday DESC OFFSET 3 LIMIT 3
DELETE employee WHERE email = '%_a' AND id > 35
```
