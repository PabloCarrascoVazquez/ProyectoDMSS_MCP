-- Script de creación de Base de Datos para el servicio: 
-- Generado automáticamente por Acceleo

-- ==========================================
-- Tablas de Contexto para el Agente: Investigador
-- ==========================================

-- 1. Tabla Principal del Contexto
CREATE TABLE IF NOT EXISTS DatosBusqueda (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    tema VARCHAR(255),
    archivos_descargados INT
);

-- 2. Tabla de Historial (EXTENSIÓN 1: VersionContexto)
-- Almacena las modificaciones de las propiedades del contexto anterior
CREATE TABLE IF NOT EXISTS DatosBusqueda_Historial (
    id_version INT AUTO_INCREMENT PRIMARY KEY,
    id_registro_contexto INT NOT NULL,
    nombre_propiedad VARCHAR(255) NOT NULL,
    valor_anterior TEXT,
    fecha_modificacion VARCHAR(100),
    FOREIGN KEY (id_registro_contexto) REFERENCES DatosBusqueda(id_registro) ON DELETE CASCADE
);

-- ==========================================
-- Tablas de Contexto para el Agente: Redactor
-- ==========================================

-- 1. Tabla Principal del Contexto
CREATE TABLE IF NOT EXISTS BorradorFinal (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    informe_generado TEXT
);

-- 2. Tabla de Historial (EXTENSIÓN 1: VersionContexto)
-- Almacena las modificaciones de las propiedades del contexto anterior
CREATE TABLE IF NOT EXISTS BorradorFinal_Historial (
    id_version INT AUTO_INCREMENT PRIMARY KEY,
    id_registro_contexto INT NOT NULL,
    nombre_propiedad VARCHAR(255) NOT NULL,
    valor_anterior TEXT,
    fecha_modificacion VARCHAR(100),
    FOREIGN KEY (id_registro_contexto) REFERENCES BorradorFinal(id_registro) ON DELETE CASCADE
);

