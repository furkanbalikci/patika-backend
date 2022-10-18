--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
)

--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, email, birthday) values ('Silvia', 'sturban0@furl.net', '1962-06-21');
insert into employee (name, email, birthday) values ('Moss', 'mcordeau1@amazon.co.uk', '1992-12-25');
insert into employee (name, email, birthday) values ('Gaby', 'gsherston2@nydailynews.com', '1972-12-13');
insert into employee (name, email, birthday) values ('Justin', 'jharborow3@webeden.co.uk', '1944-10-22');
insert into employee (name, email, birthday) values ('Rozele', 'rbailess4@gravatar.com', '1926-05-03');
insert into employee (name, email, birthday) values ('Tracie', 'tbartolacci5@adobe.com', '1982-08-11');
insert into employee (name, email, birthday) values ('Rolf', 'rcreaser6@cbsnews.com', '1960-04-08');
insert into employee (name, email, birthday) values ('Rustin', 'rholyard7@businessweek.com', '1902-02-28');
insert into employee (name, email, birthday) values ('Katee', 'kkline8@mozilla.com', '1936-12-16');
insert into employee (name, email, birthday) values ('Kendal', 'kpimerick9@biglobe.ne.jp', '1985-10-23');
insert into employee (name, email, birthday) values ('Tiena', 'tshawa@rediff.com', '1912-05-21');
insert into employee (name, email, birthday) values ('Elspeth', 'emirrleesb@reverbnation.com', '1952-07-08');
insert into employee (name, email, birthday) values ('Rouvin', 'rropsc@google.co.uk', '1924-01-27');
insert into employee (name, email, birthday) values ('Kiley', 'ksavild@over-blog.com', '1951-11-05');
insert into employee (name, email, birthday) values ('Annamarie', 'afoxone@chron.com', '1905-09-14');
insert into employee (name, email, birthday) values ('Shaughn', 'sfiggef@altervista.org', '1910-05-23');
insert into employee (name, email, birthday) values ('Marja', 'mwhodcoatg@purevolume.com', '1939-01-18');
insert into employee (name, email, birthday) values ('Adan', 'acumminsh@phpbb.com', '1907-08-08');
insert into employee (name, email, birthday) values ('Willow', 'wcraterei@vimeo.com', '1901-04-07');
insert into employee (name, email, birthday) values ('Gilberte', 'gpinckardj@devhub.com', '1957-07-18');
insert into employee (name, email, birthday) values ('Andres', 'alukerk@de.vu', '1923-10-06');
insert into employee (name, email, birthday) values ('Lena', 'lhuckl@facebook.com', '1937-12-02');
insert into employee (name, email, birthday) values ('Tove', 'tsantinom@naver.com', '1936-10-08');
insert into employee (name, email, birthday) values ('Marian', 'mhurnn@reverbnation.com', '1913-05-08');
insert into employee (name, email, birthday) values ('Alysia', 'awhittocko@tamu.edu', '1990-12-18');
insert into employee (name, email, birthday) values ('Bili', 'bcarusp@wiley.com', '1964-06-16');
insert into employee (name, email, birthday) values ('Delinda', 'dondrichq@apache.org', '1901-09-01');
insert into employee (name, email, birthday) values ('Callean', 'cchownr@stanford.edu', '1952-12-10');
insert into employee (name, email, birthday) values ('Lyell', 'lhendriks@jalbum.net', '1989-05-17');
insert into employee (name, email, birthday) values ('Amby', 'aizhakovt@google.it', '1913-07-21');
insert into employee (name, email, birthday) values ('Cassaundra', 'cthulbornu@ezinearticles.com', '1964-02-09');
insert into employee (name, email, birthday) values ('Myrwyn', 'mmeddingsv@woothemes.com', '1953-06-12');
insert into employee (name, email, birthday) values ('Cicily', 'cnindw@freewebs.com', '1992-11-29');
insert into employee (name, email, birthday) values ('Ricky', 'rirvinex@yelp.com', '1902-04-20');
insert into employee (name, email, birthday) values ('Saloma', 'sbrithmany@ifeng.com', '1978-01-04');
insert into employee (name, email, birthday) values ('Niels', 'ngoodfellowez@ft.com', '1999-03-06');
insert into employee (name, email, birthday) values ('Meg', 'mdebernardi10@biblegateway.com', '1986-02-03');
insert into employee (name, email, birthday) values ('Laurens', 'lphoenix11@people.com.cn', '1949-09-17');
insert into employee (name, email, birthday) values ('Anett', 'achitson12@goo.ne.jp', '1962-09-03');
insert into employee (name, email, birthday) values ('Ilario', 'isobieski13@ucsd.edu', '1991-01-17');
insert into employee (name, email, birthday) values ('Lazaro', 'lallston14@weebly.com', '1985-03-24');
insert into employee (name, email, birthday) values ('Tiebold', 'trevelle15@chronoengine.com', '1918-11-28');
insert into employee (name, email, birthday) values ('Phyllida', 'pmcleese16@networksolutions.com', '1993-10-11');
insert into employee (name, email, birthday) values ('Cris', 'cedgecumbe17@howstuffworks.com', '1909-07-02');
insert into employee (name, email, birthday) values ('Dinah', 'dthrush18@berkeley.edu', '1921-07-19');
insert into employee (name, email, birthday) values ('Basil', 'bflowerdew19@nifty.com', '1979-02-22');
insert into employee (name, email, birthday) values ('Hermann', 'hjuanico1a@ucsd.edu', '1905-07-29');
insert into employee (name, email, birthday) values ('Tommie', 'tmanklow1b@cpanel.net', '1943-08-02');
insert into employee (name, email, birthday) values ('Daloris', 'druffler1c@ycombinator.com', '1937-10-17');
insert into employee (name, email, birthday) values ('Rorie', 'reddy1d@discuz.net', '1934-01-09');



--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name='AHMET'
WHERE id = 1
RETURNING *;

UPDATE employee
SET email = 'excalibur_konyali7@homtail.com',birthday = '1999-05-19'
WHERE name='AHMET'
RETURNING *;

UPDATE employee
SET name = 'HEBELE'
WHERE name LIKE 'B%'
RETURNING *;

--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE from employee
WHERE name = 'Gaby';

DELETE from employee
WHERE name = 'A%';

