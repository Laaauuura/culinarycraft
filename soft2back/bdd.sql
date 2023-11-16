-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-11-09 22:21:15.465

-- tables
-- Table: Calificaciones
CREATE TABLE Calificaciones (
    CalificacionID serial  NOT NULL,
    RecetaID int  NOT NULL,
    UserID int  NOT NULL,
    Puntuacion int  NULL,
    FechaHora timestamp  NULL DEFAULT current_timestamp,
    CONSTRAINT CHECK_0 CHECK (( Puntuación BETWEEN 1 AND 5 )) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT Calificaciones_pk PRIMARY KEY (CalificacionID)
);

-- Table: Categoria
CREATE TABLE Categoria (
    CategoriaID serial  NOT NULL,
    NombreCategoria varchar(50)  NOT NULL,
    CONSTRAINT Categoria_pk PRIMARY KEY (CategoriaID)
);

-- Table: Comentarios
CREATE TABLE Comentarios (
    ComentarioID serial  NOT NULL,
    RecetaID int  NOT NULL,
    UserID int  NOT NULL,
    TextoComentario text  NOT NULL,
    FechaHora timestamp  NULL DEFAULT current_timestamp,
    CONSTRAINT Comentarios_pk PRIMARY KEY (ComentarioID)
);

-- Table: Ingredientes
CREATE TABLE Ingredientes (
    IngredienteID serial  NOT NULL,
    Nombre varchar(100)  NOT NULL,
    Tipo varchar(50)  NULL,
    Cantidad int  NOT NULL,
    CONSTRAINT Ingredientes_pk PRIMARY KEY (IngredienteID)
);

-- Table: ListasDeCompras
CREATE TABLE ListasDeCompras (
    ListaID serial  NOT NULL,
    UserID int  NOT NULL,
    NombreLista varchar(255)  NULL,
    CONSTRAINT ListasDeCompras_pk PRIMARY KEY (ListaID)
);

-- Table: ListasDeCompras_Ingredientes
CREATE TABLE ListasDeCompras_Ingredientes (
    LisComprasIngredientesID int  NOT NULL,
    ListaID int  NOT NULL,
    IngredienteID int  NOT NULL,
    CONSTRAINT ListasDeCompras_Ingredientes_pk PRIMARY KEY (LisComprasIngredientesID)
);

-- Table: Recetas
CREATE TABLE Recetas (
    RecetaID serial  NOT NULL,
    UserID int  NOT NULL,
    NombreReceta varchar(255)  NOT NULL,
    Procedimiento text  NOT NULL,
    TiempoPreparacion int  NOT NULL,
    Porciones int  NOT NULL,
    DescripcionCorta text  NOT NULL,
    ImagenReceta bytea  NOT NULL,
    Categoria_CategoriaID int  NOT NULL,
    CONSTRAINT Recetas_pk PRIMARY KEY (RecetaID)
);

-- Table: RecetasGuardadas
CREATE TABLE RecetasGuardadas (
    RecetasGuardadasID int  NOT NULL,
    UserID int  NOT NULL,
    RecetaID int  NOT NULL,
    FechaHora timestamp  NULL DEFAULT current_timestamp,
    CONSTRAINT RecetasGuardadas_pk PRIMARY KEY (RecetasGuardadasID)
);

-- Table: Recetas_Ingredientes
CREATE TABLE Recetas_Ingredientes (
    ReceIngreID int  NOT NULL,
    RecetaID int  NOT NULL,
    IngredienteID int  NOT NULL,
    CONSTRAINT Recetas_Ingredientes_pk PRIMARY KEY (ReceIngreID)
);

-- Table: Usuarios
CREATE TABLE Usuarios (
    UserID serial  NOT NULL,
    Nombre varchar(100)  NOT NULL,
    Apellido varchar(100)  NOT NULL,
    NombreUsuario varchar(50)  NOT NULL,
    Correo varchar(255)  NOT NULL,
    FotoPerfil bytea  NULL,
    CONSTRAINT AK_0 UNIQUE (NombreUsuario) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Usuarios_pk PRIMARY KEY (UserID)
);

-- foreign keys
-- Reference: FK_0 (table: Recetas)
ALTER TABLE Recetas ADD CONSTRAINT FK_0
    FOREIGN KEY (UserID)
    REFERENCES Usuarios (UserID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_1 (table: Recetas_Ingredientes)
ALTER TABLE Recetas_Ingredientes ADD CONSTRAINT FK_1
    FOREIGN KEY (RecetaID)
    REFERENCES Recetas (RecetaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_10 (table: RecetasGuardadas)
ALTER TABLE RecetasGuardadas ADD CONSTRAINT FK_10
    FOREIGN KEY (UserID)
    REFERENCES Usuarios (UserID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_11 (table: RecetasGuardadas)
ALTER TABLE RecetasGuardadas ADD CONSTRAINT FK_11
    FOREIGN KEY (RecetaID)
    REFERENCES Recetas (RecetaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_2 (table: Recetas_Ingredientes)
ALTER TABLE Recetas_Ingredientes ADD CONSTRAINT FK_2
    FOREIGN KEY (IngredienteID)
    REFERENCES Ingredientes (IngredienteID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_3 (table: Comentarios)
ALTER TABLE Comentarios ADD CONSTRAINT FK_3
    FOREIGN KEY (RecetaID)
    REFERENCES Recetas (RecetaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_4 (table: Comentarios)
ALTER TABLE Comentarios ADD CONSTRAINT FK_4
    FOREIGN KEY (UserID)
    REFERENCES Usuarios (UserID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_5 (table: Calificaciones)
ALTER TABLE Calificaciones ADD CONSTRAINT FK_5
    FOREIGN KEY (RecetaID)
    REFERENCES Recetas (RecetaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_6 (table: Calificaciones)
ALTER TABLE Calificaciones ADD CONSTRAINT FK_6
    FOREIGN KEY (UserID)
    REFERENCES Usuarios (UserID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_7 (table: ListasDeCompras)
ALTER TABLE ListasDeCompras ADD CONSTRAINT FK_7
    FOREIGN KEY (UserID)
    REFERENCES Usuarios (UserID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_8 (table: ListasDeCompras_Ingredientes)
ALTER TABLE ListasDeCompras_Ingredientes ADD CONSTRAINT FK_8
    FOREIGN KEY (ListaID)
    REFERENCES ListasDeCompras (ListaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_9 (table: ListasDeCompras_Ingredientes)
ALTER TABLE ListasDeCompras_Ingredientes ADD CONSTRAINT FK_9
    FOREIGN KEY (IngredienteID)
    REFERENCES Ingredientes (IngredienteID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Recetas_Categoria (table: Recetas)
ALTER TABLE Recetas ADD CONSTRAINT Recetas_Categoria
    FOREIGN KEY (Categoria_CategoriaID)
    REFERENCES Categoria (CategoriaID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.


