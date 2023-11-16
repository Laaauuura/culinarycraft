INSERT INTO Usuarios (Nombre, Apellido, NombreUsuario, Correo) VALUES
('Ana', 'Pérez', 'anaperez', 'ana.perez@email.com'),
('Carlos', 'García', 'carlosgarcia', 'carlos.garcia@email.com'),
('Elena', 'López', 'elenalopez', 'elena.lopez@email.com'),
;

INSERT INTO Categoria (NombreCategoria) VALUES
('Postres'),
('Entradas'),
('Carnes'),
;

INSERT INTO Ingredientes (Nombre, Tipo, Cantidad) VALUES
('Tomate', 'Verdura', 10),
('Pollo', 'Carne', 5),
('Lechuga', 'Verdura', 8),
;

INSERT INTO Recetas (UserID, NombreReceta, Procedimiento, TiempoPreparacion, Porciones, DescripcionCorta, Categoria_CategoriaID) VALUES
(1, 'Pollo al horno', 'Colocar el pollo en horno por 45 min', 45, 4, 'Pollo jugoso al horno', 1),
(1, 'Ensalada César', 'Mezclar lechuga, pollo, croutones y aderezo', 15, 2, 'Ensalada clásica', 2),
(2, 'Pizza Margarita', 'Preparar masa, agregar salsa, queso y albahaca, hornear', 30, 8, 'Pizza sencilla y deliciosa', 3),
(2, 'Sopa de tomate', 'Hervir tomates y especias, licuar', 20, 4, 'Sopa cremosa de tomate', 4),
(3, 'Tacos de carnitas', 'Cocinar carne, servir en tortillas con salsa', 60, 6, 'Tacos tradicionales mexicanos', 5),
(3, 'Paella', 'Cocinar arroz con mariscos y especias', 90, 5, 'Paella española auténtica', 1),
(4, 'Bistec a la parrilla', 'Asar bistec con condimentos', 25, 3, 'Bistec jugoso a la parrilla', 2),
(4, 'Pasta Alfredo', 'Cocinar pasta, mezclar con salsa Alfredo', 30, 4, 'Pasta cremosa Alfredo', 3),
(5, 'Curry de pollo', 'Cocinar pollo con salsa curry y especias', 40, 4, 'Delicioso curry de pollo indio', 4),
(5, 'Hamburguesa clásica', 'Asar carne de hamburguesa, servir con pan y aderezos', 15, 2, 'Hamburguesa americana tradicional', 5),
(6, 'Risotto de setas', 'Cocinar arroz con setas y caldo', 50, 4, 'Risotto italiano con setas', 1),
(6, 'Gazpacho', 'Licuar tomates y vegetales, servir frío', 10, 3, 'Sopa fría española', 2),
(7, 'Sushi', 'Preparar arroz sushi, enrollar con pescado y algas', 60, 2, 'Sushi tradicional japonés', 3),
(7, 'Tiramisú', 'Montar capas de mascarpone y bizcochos empapados en café', 30, 6, 'Postre italiano clásico', 4),
(8, 'Burritos de frijoles', 'Rellenar tortillas con frijoles, arroz y queso', 20, 5, 'Burritos vegetarianos', 5),
(8, 'Chili con carne', 'Cocinar carne con frijoles, tomate y chile', 120, 4, 'Chili picante tradicional', 1),
(9, 'Quiche Lorraine', 'Hornear masa con relleno de huevo y tocino', 45, 6, 'Quiche francés clásico', 2),
(9, 'Ramen', 'Cocinar fideos en caldo con aderezos', 30, 1, 'Sopa de fideos japonesa', 3),
(10, 'Falafel', 'Freír bolas de garbanzos especiados', 25, 3, 'Falafel del Medio Oriente', 4),
(10, 'Brownie de chocolate', 'Hornear masa de brownie', 30, 8, 'Brownie denso y chocolateado', 5);


INSERT INTO Calificaciones (RecetaID, UserID, Puntuacion) VALUES
(1, 1, 5),
(2, 2, 4),
(3, 3, 5),
(4, 4, 3),
(5, 5, 4),
(6, 1, 5),
(7, 2, 4),
(8, 3, 5),
(9, 4, 3),
(10, 5, 4),
(1, 6, 5),
(2, 7, 4),
(3, 8, 5),
(4, 9, 3),
(5, 10, 4),
(6, 1, 5),
(7, 2, 4),
(8, 3, 5),
(9, 4, 3),
(10, 5, 4);


INSERT INTO Comentarios (RecetaID, UserID, TextoComentario) VALUES
(1, 2, '¡Delicioso! Muy recomendable.'),
(2, 3, 'Fácil y rápido de hacer, a mi familia le encantó.'),
(3, 4, 'Excelente sabor, seguiré la receta de nuevo.'),
(4, 5, 'Necesita más especias, pero está bien.'),
(5, 6, 'Perfecto para una cena rápida.'),
(6, 7, 'Un sabor auténtico y delicioso.'),
(7, 8, 'Muy bueno, pero un poco seco.'),
(8, 9, 'Una de las mejores pastas que he probado.'),
(9, 10, 'Gran receta, todos en casa la amaron.'),
(10, 1, 'Sabor increíble, la repetiré sin duda.'),
(1, 2, 'Buenísimo y fácil de preparar.'),
(2, 3, 'No me gustó mucho, le faltaba sabor.'),
(3, 4, '¡Espectacular! Muy sabroso.'),
(4, 5, 'Bueno, pero un poco complicado de hacer.'),
(5, 6, 'Muy rico, lo recomiendo.'),
(6, 7, 'No era lo que esperaba, pero estaba bien.'),
(7, 8, 'Fantástico, un gran descubrimiento.'),
(8, 9, 'No está mal, pero he probado mejores.'),
(9, 10, 'Excelente, lo volveré a hacer.'),
(10, 1, 'Muy bueno, especialmente para los niños.');


INSERT INTO ListasDeCompras (UserID, NombreLista) VALUES
(1, 'Lista de Ana'),
(2, 'Lista de Carlos'),
;

INSERT INTO ListasDeCompras_Ingredientes (ListaID, IngredienteID) VALUES
(1, 1),
(2, 2),
;

INSERT INTO RecetasGuardadas (UserID, RecetaID) VALUES
(1, 2),
(2, 1),
;

INSERT INTO Recetas_Ingredientes (RecetaID, IngredienteID) VALUES
(1, 1),
(2, 2),
;
