--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.20
-- Dumped by pg_dump version 9.5.5

-- Started on 2019-01-11 14:26:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2019 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 173 (class 1259 OID 24927)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE cliente (
    cliente_id integer NOT NULL,
    tipo_cliente_id integer NOT NULL,
    apellido_paterno character varying(30),
    apellido_materno character varying(30),
    nombre character varying(30)
);


ALTER TABLE cliente OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 24930)
-- Name: cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE cliente_seq OWNER TO postgres;

--
-- TOC entry 2020 (class 0 OID 0)
-- Dependencies: 174
-- Name: cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE cliente_seq OWNED BY cliente.cliente_id;


--
-- TOC entry 175 (class 1259 OID 24932)
-- Name: tipo_cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tipo_cliente (
    tipo_cliente_id integer NOT NULL,
    nombre character varying(50),
    descripcion character varying(120)
);


ALTER TABLE tipo_cliente OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 24935)
-- Name: tipo_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipo_cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tipo_cliente_seq OWNER TO postgres;

--
-- TOC entry 2021 (class 0 OID 0)
-- Dependencies: 176
-- Name: tipo_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipo_cliente_seq OWNED BY tipo_cliente.tipo_cliente_id;


--
-- TOC entry 177 (class 1259 OID 24937)
-- Name: vw_cliente; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW vw_cliente AS
 SELECT c.tipo_cliente_id,
    c.apellido_paterno,
    c.apellido_materno,
    c.nombre,
    tc.nombre AS tipo_cliente_nombre,
    tc.descripcion
   FROM (cliente c
     JOIN tipo_cliente tc ON ((c.tipo_cliente_id = tc.tipo_cliente_id)));


ALTER TABLE vw_cliente OWNER TO postgres;

--
-- TOC entry 1891 (class 2604 OID 24941)
-- Name: cliente_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente ALTER COLUMN cliente_id SET DEFAULT nextval('cliente_seq'::regclass);


--
-- TOC entry 1892 (class 2604 OID 24942)
-- Name: tipo_cliente_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipo_cliente ALTER COLUMN tipo_cliente_id SET DEFAULT nextval('tipo_cliente_seq'::regclass);


--
-- TOC entry 2008 (class 0 OID 24927)
-- Dependencies: 173
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO cliente (cliente_id, tipo_cliente_id, apellido_paterno, apellido_materno, nombre) VALUES (1, 1, 'Hardy', 'Sommer', 'Martin');
INSERT INTO cliente (cliente_id, tipo_cliente_id, apellido_paterno, apellido_materno, nombre) VALUES (2, 1, 'Moreno', 'Trujillo', 'Maria');
INSERT INTO cliente (cliente_id, tipo_cliente_id, apellido_paterno, apellido_materno, nombre) VALUES (3, 2, 'Lincoln', 'Wang', 'Laurence');
INSERT INTO cliente (cliente_id, tipo_cliente_id, apellido_paterno, apellido_materno, nombre) VALUES (4, 2, 'Chang', 'Ashworth', 'Janine');


--
-- TOC entry 2022 (class 0 OID 0)
-- Dependencies: 174
-- Name: cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('cliente_seq', 5, true);


--
-- TOC entry 2010 (class 0 OID 24932)
-- Dependencies: 175
-- Data for Name: tipo_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO tipo_cliente (tipo_cliente_id, nombre, descripcion) VALUES (1, 'EmpresaA', 'EmpresaA Descripcion');
INSERT INTO tipo_cliente (tipo_cliente_id, nombre, descripcion) VALUES (2, 'EmpresaB', 'EmpresaB Descripcion');


--
-- TOC entry 2023 (class 0 OID 0)
-- Dependencies: 176
-- Name: tipo_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipo_cliente_seq', 3, true);


--
-- TOC entry 1894 (class 2606 OID 24944)
-- Name: pk_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT pk_cliente PRIMARY KEY (cliente_id);


--
-- TOC entry 1896 (class 2606 OID 24946)
-- Name: pk_tipo_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipo_cliente
    ADD CONSTRAINT pk_tipo_cliente PRIMARY KEY (tipo_cliente_id);


--
-- TOC entry 1897 (class 2606 OID 24947)
-- Name: fk_cliente_tipo_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT fk_cliente_tipo_cliente FOREIGN KEY (tipo_cliente_id) REFERENCES tipo_cliente(tipo_cliente_id);


--
-- TOC entry 2018 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2019-01-11 14:26:58

--
-- PostgreSQL database dump complete
--

