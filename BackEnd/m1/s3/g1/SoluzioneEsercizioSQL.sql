/* 
	CREATE DATABASE esercizio-sql;
	DROP DATABSE esercizio-sql;
*/

DROP TABLE clienti;
DROP TABLE fornitori;
DROP TABLE fatture;
DROP TABLE prodotti;

-- Clienti (NumeroCliente, Nome, Cognome, DataNascita, RegioneResidenza);

CREATE TABLE IF NOT EXISTS clienti (
	numero_cliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	data_nascita DATE NOT NULL,
	regione_residenza VARCHAR NOT NULL
);

-- Fornitori (NumeroFornitore, Denominazione, RegioneResidenza);

CREATE TABLE IF NOT EXISTS fornitori (
	numero_fornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regione_residenza VARCHAR NOT NULL
);

-- Fatture (NumeroFattura, Tipologia, Importo, Iva, IdCliente, DataFattura, NumeroFornitore);

CREATE TABLE IF NOT EXISTS fatture (
	numero_fattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo DECIMAL NOT NULL,
	iva VARCHAR NOT NULL DEFAULT '20%',
	id_cliente INTEGER NOT NULL,
	data_fattura DATE NOT NULL,
	numero_fornitore INTEGER NOT NULL,
	CONSTRAINT fatture_clienti_fk FOREIGN KEY (id_cliente) REFERENCES clienti (numero_cliente),
	CONSTRAINT fatture_fornitori_fk FOREIGN KEY (numero_fornitore) REFERENCES fornitori (numero_fornitore)
);

-- Prodotti (IdProdotto, Descrizione, InProduzione, InCommercio,  DataAttivazione, DataDisattivazione);

CREATE TABLE IF NOT EXISTS prodotti (
	id_prodotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	in_produzione BOOLEAN NOT NULL DEFAULT 'false',
	in_commercio BOOLEAN NOT NULL DEFAULT 'false',
	data_attivazione DATE NOT NULL,
	data_disattivazione DATE 
);


-- INSERISCO DEI DATI DI ESEMPIO

INSERT INTO clienti(nome, cognome, data_nascita, regione_residenza ) 
		VALUES 	('Mario', 'Rossi', '1/8/1999', 'Lazio'),
				('Giuseppe', 'Verdi', '15/10/2000', 'Lombardia'),
				('Francesca', 'Neri', '24/4/2003', 'Campania'),
				('Antonio', 'Gialli', '29/5/1999', 'Sicilia');
				
				
INSERT INTO fornitori(denominazione, regione_residenza ) 
		VALUES 	('Epicode SRL', 'Lazio'),
				('JavaSchool SPA', 'Piemonte')
				
INSERT INTO fatture(tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) 
		VALUES 	('A', '145.12', '10%', 2, '2/2/2022', 1),
				('B', '533.99', '20%', 1, '29/4/2022', 2),
				('A', '145.12', '20%', 3, '12/1/2023', 1),
				('A', '188.00', '15%', 2, '2/2/2023', 1);

INSERT INTO prodotti (descrizione, in_produzione, in_commercio,  data_attivazione, data_disattivazione)
		VALUES 	('Prodotto x', true, false, '29/4/2017', '29/4/2023'),
				('Prodotto z', true, true, '15/9/2016', '15/9/2024'),
				('Prodotto q', false, false, '12/12/2017', '12/9/2022');
				
-- QUERY DI RICERCA

SELECT * FROM clienti;
SELECT * FROM fornitori;
SELECT * FROM fatture;
SELECT * FROM prodotti;

-- Estrarre il nome e il cognome dei clienti nati nel 1999
SELECT nome, cognome FROM clienti WHERE EXTRACT(YEAR FROM data_nascita) = 1999;

-- Estrarre il numero delle fatture con iva al 20%
SELECT COUNT(*) AS numero_fatture FROM fatture WHERE iva = '20%';

-- Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
SELECT 
	EXTRACT(YEAR FROM data_fattura) AS anno, 
	COUNT(*) AS numero_fatture,
	SUM(importo) AS somma_importi
FROM fatture 
GROUP BY EXTRACT(YEAR FROM data_fattura);

-- Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio
SELECT * FROM prodotti 
	WHERE EXTRACT(YEAR FROM data_attivazione) = 2017 
			AND (in_produzione = true OR in_commercio = true);

-- Considerando soltanto le fatture con iva al 20 per cento, 
-- estrarre il numero di fatture per ogni anno
SELECT EXTRACT(YEAR FROM data_fattura) AS anno, COUNT(*) AS numero_fatture 
	FROM fatture 
	WHERE iva = '20%' 
	GROUP BY EXTRACT(YEAR FROM data_fattura); 

-- Estrarre gli anni in cui sono state registrate più di 2 fatture con tipologia ‘A’
SELECT 
	EXTRACT(YEAR FROM data_fattura) AS anno,
	COUNT(*) AS numero_fatture 
FROM fatture
WHERE tipologia = 'A'
GROUP BY EXTRACT(YEAR FROM data_fattura) 
HAVING COUNT(*) > 1;

-- Riportare l’elenco delle fatture (numero, importo, iva e data) con in aggiunta 
-- il nome del fornitore
SELECT numero_fattura, importo, iva, data_fattura, denominazione  
FROM fatture INNER JOIN fornitori ON fatture.numero_fornitore = fornitori.numero_fornitore;

-- Estrarre il totale degli importi delle fatture divisi per residenza dei clienti
SELECT clienti.regione_residenza, SUM(fatture.importo) AS importo_fatture
FROM fatture INNER JOIN clienti ON fatture.id_cliente = clienti.numero_cliente
GROUP BY clienti.regione_residenza;

-- Estrarre il numero dei clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro
SELECT COUNT(*) AS numero_clienti 
	FROM clienti INNER JOIN fatture 
	ON fatture.id_cliente = clienti.numero_cliente
	WHERE EXTRACT(YEAR FROM data_nascita) = 2000 AND fatture.importo > 150;

-- Estrarre una colonna di nome “Denominazione” contenente il nome, 
-- seguito da un carattere “-“, seguito dal cognome, 
-- per i soli clienti residenti nella regione Lombardia
SELECT CONCAT(nome, '-', cognome) FROM clienti WHERE regione_residenza = 'Lombardia';

