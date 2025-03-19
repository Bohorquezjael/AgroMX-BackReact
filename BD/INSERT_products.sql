INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Manzana Gala',
        28.00,
        'kg',
        200,
        1,
        'Cosechada localmente por "Manzanas, La Conchita". Fuente de fibra, vitamina C y E. Una manzana equivale a 2/3 de la porción mínima diaria recomendada de fruta.',
        'La manzana es una fruta rica en nutrientes. Fuente de fibra, vitamina C, E, K, potasio, cobre, además contiene antioxidantes y polifenoles.',
        1,
        '//mercadoacasa.mx/cdn/shop/products/2502808-00-CH515Wx515H_7ddf79a2-30aa-4d06-829f-b896173133a0_grande.jpg?v=1588641604'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id
    ) VALUE (
        'Plátano Dominico',
        25.00,
       ' kg',
        100,
        1,
       'Plátano orgánico producido por "Bananas Karla" en el Estado de México. Fuente de fibra, potasio y pectina. Contiene probióticos. Un plátano proporciona 1/4 de la cantidad diaria recomendada de Vitamina B6',
        'El plátano es una baya rica en nutrientes. Buena fuente de fibra, potasio, pectina y vitamina B6, además contiene probióticos, que mejoran la digestión y proporcionan energía. Nuestro Plátano Dominico está producido por "Bananas Karla", una productora del Estado de Mexico que cosecha sin agroquímicos, con técnicas sostenibles',
        7,
        'https://mercadoacasa.mx/cdn/shop/products/platano-2_540x.jpg?v=1587779653'
    );

INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Naranja Valencia',
        31.00,
        'kg',
        200,
        1,
        'Cosechada por la coperativa "Naranjas Dulces" en Hidalgo. Fuente de fibra, potasio y diversos antioxidantes, entre ellos la vitamina C, de la cual provee el 100% de la dosis diaria recomendada',
        'La naranja es una fruta rica en nutrientes. Fuente de distintas vitaminas y antioxidantes, como el ácido fólico, la vitamina C y los flavonoides que el cuerpo utiliza para su función inmunológica. Nuestra naranja está producida por "Naranjas Dulces", una coperativa de Hidalgo que cosecha sin agroquímicos, con técnicas sostenibles. Comprando estimulas la economía local y consumes responsablemente',
        2,
      'https://www.centralenlinea.com/images/thumbs/002/0023229_naranja-gota-de-miel_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Zanahoria',
        14.90,
        'kg',
        300,
        2,
        'Cosechada localmente por "Grupo Frucat". Fuente de vitaminas. Contiene antioxidantes y betacarotenos. Una zanahoria equivale a 1/4 de la porción mínima diaria recomendada de vitamina A',
        'La zanahoria es una hortaliza rica en nutrientes. Buena fuente de vitamina A, C, K, potasio, y antioxidantes como el betacaroteno. Es excelente para la salud ocular, fortalece el sistema inmunológico y promueve la salud de la piel. Nuestra Zanahoria está producida localmente por "Grupo Frucat", una productora familiar que cosecha sin agroquímicos, utilizando técnicas sostenibles. Al comprar, apoyas a la economía local, reduces la contaminación y mejoras tu bienestar.',
        5,
        'https://www.centralenlinea.com/images/thumbs/001/0019771_zanahoria-premium_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Tomate verde',
        28.00,
        'kg',
        200,
        2,
        'Tomate orgánico producido por "ASCENZA" en el Estado de San Luis Potosí. Fuente de vitamina C, A, potasio y antioxidantes. Ayuda a fortalecer el sistema inmunológico y mejora la digestión.',
        'El tomate es un alimento nutritivo que aporta vitaminas (especialmente vitamina C y A), minerales, fibra y antioxidantes que ayudan a combatir el envejecimiento celular. Nuestro Tomate Orgánico está producido por "ASCENZA", una productora local en San Luis Potosí que cosecha sin agroquímicos y utiliza prácticas agrícolas sostenibles. Comprando, apoyas la economía local, fomentas la agricultura sostenible y cuidas tu salud.',
        9,
        'https://www.centralenlinea.com/images/thumbs/005/0059750_tomate-verde-grande-premium-sin-cascara_550.png'
    );



    
INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Lechuga orejona',
        14.00,
        'kg',
        200,
        2,
        'Lechuga fresca y crujiente, ideal para ensaladas y platillos saludables.',
        'Baja en calorías, rica en fibra, vitaminas A y K.',
        3,
        'https://mercadoacasa.mx/cdn/shop/products/semilla-de-lechuga-italiana-1000-D_NQ_NP_802789-MLM33044235762_112019-F_540x.jpg?v=1587758884'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Pimiento rojo',
        26.00,
        'kg',
        200,
        2,
        'Pimiento orgánico producido por "Hortalizas del Valle". Rico en vitamina C y antioxidantes. Ideal para ensaladas y platillos salteados.',
        'El pimiento es una hortaliza rica en nutrientes. Fuente de vitaminas C, A, B6 y ácido fólico. Contiene antioxidantes que ayudan a fortalecer el sistema inmunológico.',
        6,
        'https://mercadoacasa.mx/cdn/shop/products/pimiento_morron_rojo_1024x1024_b720cf3f-7ee6-497d-9267-6ebd6d125d32_540x.jpg?v=1587495466'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Cebolla',
        15.00,
        'kg',
        200,
        2,
        'Cebolla blanca cultivada por "Productores Unidos". Rica en compuestos sulfúricos y antioxidantes. Base fundamental de la cocina mexicana.',
        'La cebolla es un vegetal versátil rico en antioxidantes y compuestos sulfúricos. Ayuda a fortalecer el sistema inmunológico y tiene propiedades antiinflamatorias.',
        8,
        'https://www.centralenlinea.com/images/thumbs/006/0061467_cebolla-blanca-sin-pelar-chica_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Ajo',
        8.00,
        'kg',
        200,
        2,
        'Ajo fresco cultivado por "Ajos del Centro". Rico en alicina y compuestos sulfúricos. Condimento esencial en la cocina.',
        'El ajo es un alimento con propiedades antimicrobianas y antiinflamatorias. Rico en compuestos beneficiosos para la salud cardiovascular.',
        4,
        'https://www.centralenlinea.com/images/thumbs/003/0035487_ajo-italiano-cabeza-grande_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Papa',
        10.00,
        'kg',
        200,
        2,
        'Papa blanca cultivada por "Tubérculos San Juan". Rica en almidón y potasio. Versátil para diferentes preparaciones culinarias.',
        'La papa es un tubérculo nutritivo rico en carbohidratos complejos, potasio y vitamina C. Excelente fuente de energía y fibra.',
        7,
        'https://www.centralenlinea.com/images/thumbs/006/0060301_papa-blanca-alfa-chica-125g-aprox_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Calabacín',
        24.00,
        'kg',
        200,
        2,
        'Calabacín fresco cultivado por "Huertos Orgánicos". Bajo en calorías y rico en agua. Ideal para dietas saludables.',
        'El calabacín es una hortaliza baja en calorías y rica en agua. Aporta vitaminas, minerales y antioxidantes importantes para una dieta equilibrada.',
        5,
        'https://mercadoacasa.mx/cdn/shop/products/0000000004067L_540x.jpg?v=1587757880'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Brócoli',
        35.00,
        'kg',
        200,
        2,
        'Brócoli fresco cultivado por "Verduras del Campo". Rico en fibra y vitamina C. Excelente fuente de antioxidantes.',
        'El brócoli es una verdura crucífera rica en vitamina C, K, fibra y compuestos anticancerígenos. Fortalece el sistema inmune y promueve la salud celular.',
        8,
        'https://www.centralenlinea.com/images/thumbs/005/0056592_brocoli-chico-400g-aprox_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Espinaca',
        28.00,
        'kg',
        200,
        2,
        'Espinaca fresca cultivada por "Hortalizas Verdes". Rica en hierro y ácido fólico. Ideal para ensaladas y guisos.',
        'La espinaca es una verdura de hoja verde rica en hierro, ácido fólico y antioxidantes. Fortalece el sistema inmune y favorece la salud cardiovascular.',
        2,
        'https://www.centralenlinea.com/images/thumbs/000/0007067_espinaca-en-manojo-300g-aprox_550.jpeg'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Pepino',
        18.00,
        'kg',
        200,
        2,
        'Pepino fresco cultivado por "Huertos Frescos". Alto contenido de agua y bajo en calorías. Ideal para ensaladas y bebidas refrescantes.',
        'El pepino es una hortaliza refrescante rica en agua y minerales. Ayuda a la hidratación y tiene propiedades antiinflamatorias.',
        4,
        'https://www.centralenlinea.com/images/thumbs/002/0023664_pepino-criollo-de-campo-abierto_550.png'
    );

INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Calabaza',
        48.00,
        'kg',
        200,
        2,
        'Calabaza fresca cultivada por "Productores del Valle". Rica en betacarotenos y fibra. Versátil para sopas y guisos.',
        'La calabaza es una hortaliza rica en betacarotenos, vitamina A y fibra. Fortalece el sistema inmune y favorece la salud ocular.',
        6,
        'https://www.centralenlinea.com/images/thumbs/004/0043112_calabaza-de-castilla-grande-6kg-aprox_550.png'
    );


   INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Limón',
        12.00,
        'kg',
        250,
        1,
        'Fruta cítrica con alto contenido de vitamina C.',
        'Fortalece el sistema inmunológico, mejora la digestión y tiene propiedades antioxidantes.',
        3,
        'https://mercadoacasa.mx/cdn/shop/products/cuadrado_e505ff87-961d-4fa1-a6f6-a7370b90c067_540x.jpg?v=1587758998'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Uva',
        60.00,
        'kg',
        180,
        1,
        'Pequeñas frutas dulces y jugosas, disponibles en variedad roja y verde.',
        'Ricas en antioxidantes, benefician la circulación y la salud del corazón.',
        5,
        'https://mercadoacasa.mx/cdn/shop/products/iStock-121348678-thumbnail-540x540-70_540x.jpg?v=1587779941'
    );

INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Fresa',
        72.00,
        'kg',
        120,
        1,
        'Fruta roja y jugosa con un delicioso sabor dulce y ácido.',
        'Rica en vitamina C, fibra y antioxidantes que favorecen la salud de la piel y el sistema inmunológico.',
        7,
        'https://mercadoacasa.mx/cdn/shop/products/1341264_540x.jpg?v=1589255705'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Kiwi',
        43.00,
        'kg',
        90,
        1,
        'Fruta exótica con pulpa verde y alto contenido de vitamina C.',
        'Mejora la digestión, refuerza el sistema inmunológico y es excelente para la piel.',
        2,
        'https://www.centralenlinea.com/images/thumbs/000/0006950_kiwi-importado_550.jpeg'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Mango petacón',
        52.00,
        'kg',
        140,
        1,
        'Mango dulce y jugoso, ideal para postres y licuados.',
        'Rico en fibra, vitamina A y C, favorece la digestión y fortalece el sistema inmunológico.',
        4,
        'https://mercadoacasa.mx/cdn/shop/products/388980_540x.jpg?v=1587779376'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Piña miel',
        60.00,
        'kg',
        110,
        1,
        'Fruta tropical de sabor dulce y refrescante.',
        'Contiene bromelina, una enzima que facilita la digestión y tiene propiedades antiinflamatorias.',
        6,
        'https://alacenademonica.com/cdn/shop/products/pina_600x.png?v=1633537231'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Sandía',
        84.00,
        'kg',
        95,
        1,
        'Fruta grande y jugosa con alto contenido de agua.',
        'Hidrata el cuerpo, es rica en antioxidantes y ayuda a la recuperación muscular.',
        8,
        'https://mercadoacasa.mx/cdn/shop/products/2502868-00-CH515Wx515H_540x.jpg?v=1587779785'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Melón',
        67.00,
        'kg',
        105,
        1,
        'Fruta refrescante de sabor dulce y textura suave.',
        'Hidratante natural, rica en vitaminas A y C, excelente para la piel.',
        9,
        'https://mercadoacasa.mx/cdn/shop/products/2502866-00-CH515Wx515H_540x.jpg?v=1587779477'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Lima criolla',
        40.00,
        'kg',
        150,
        1,
        'Cítrico aromático con un toque dulce.',
        'Ayuda a la digestión y refuerza el sistema inmunológico.',
        1,
        'https://www.centralenlinea.com/images/thumbs/005/0054387_lima-criolla_550.png'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Mandarina',
        26.00,
        'kg',
        170,
        1,
        'Pequeño cítrico de sabor dulce y fácil de pelar.',
        'Fuente de vitamina C, fortalece el sistema inmunológico y mejora la piel.',
        10,
        'https://mercadoacasa.mx/cdn/shop/files/IMG-3919_540x.jpg?v=1695928892'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Toronja',
        31.00,
        'kg',
        130,
        1,
        'Fruta cítrica con un característico sabor agridulce.',
        'Ayuda a regular el metabolismo y contiene antioxidantes.',
        3,
        'https://www.gastronomiavasca.net/uploads/image/file/3421/w700_pomelo_rosa.jpg'
    );

INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Chirimoya',
        72.00,
        'kg',
        85,
        1,
        'Fruta tropical cremosa y de sabor dulce.',
        'Rica en vitaminas B y C, excelente fuente de energía.',
        5,
        'https://mercadoacasa.mx/cdn/shop/products/chirimoya_1296x.jpg?v=1607364774'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Chile guajillo seco',
        0.70,
        'kg',
        130,
        2,
        'Chile seco de color rojo brillante y sabor ligeramente picante.',
        'Muy utilizado en la gastronomía mexicana para salsas y guisos.',
        7,
        'https://mercadoacasa.mx/cdn/shop/products/chile-guajillo-seco-100g-13654635479112_600x_274e3ad5-32ac-4a1b-ad77-78c14b1029cf_1080x.png?v=1587494783'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Chile ancho seco',
        0.80,
        'kg',
        120,
        2,
        'Chile seco de sabor dulce y ahumado.',
        'Aporta un toque especial a salsas y platillos tradicionales.',
        2,
        'https://mercadoacasa.mx/cdn/shop/products/chile-ancho_piment_sec_1296x.jpg?v=1587489207'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id,
        url
    ) VALUE (
        'Chile pasilla seco',
        0.90,
        'kg',
        110,
        2,
        'Chile seco de sabor profundo y suave picor.',
        'Ingrediente esencial en moles y salsas mexicanas.',
        4,
        'https://mercadoacasa.mx/cdn/shop/products/chile-pasilla_1296x.png?v=1587495625'
    );


INSERT INTO
    products (
        product_name,
        price,
        unit,
        stock,
        fk_category_id,
        description,
        benefits,
        fk_producer_id
    ) VALUE (
        "Chile chipotle seco",
        1.00,
        "kg",
        100,
        2,
        "Chile seco ahumado con un sabor característico.",
        "Aporta un toque picante y ahumado a diversos platillos.",
        6
    );
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile cascabel seco",
    0.90,
    "kg",
    110,
    2,
    "Chile seco con un sabor suave y picante.",
    "Ideal para salsas y moles.",
    8
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile mulato seco",
    0.80,
    "kg",
    120,
    2,
    "Chile seco con un sabor dulce y ligeramente ahumado.",
    "Aporta un toque suave a los platillos mexicanos.",
    9
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile de agua seco",
    0.70,
    "kg",
    130,
    2,
    "Chile seco con sabor medio y ligeramente picante.",
    "Perfecto para salsas y guisos.",
    1
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile manzano",
    0.80,
    "kg",
    120,
    2,
    "Chile fresco con un sabor picante y afrutado.",
    "Ideal para ensaladas y salsas frescas.",
    10
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile piquín seco",
    0.90,
    "kg",
    110,
    2,
    "Chile seco pequeño y muy picante.",
    "Aporta un nivel alto de picante a los platillos.",
    5
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Aguacate",
    1.00,
    "unidad",
    100,
    2,
    "Fruta rica en grasas saludables y fibra.",
    "Beneficios para la salud cardiovascular y digestiva.",
    9
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Chile de onza seco",
    0.90,
    "kg",
    110,
    2,
    "Chile seco con un toque picante y ahumado.",
    "Ideal para salsas y adobos.",
    8
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de girasol",
    1.50,
    "kg",
    200,
    3,
    "Semilla rica en grasas saludables, proteínas y fibra.",
    "Ayuda a mejorar la salud cardiovascular y la piel.",
    5
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de calabaza",
    1.80,
    "kg",
    150,
    3,
    "Semilla rica en antioxidantes y magnesio.",
    "Beneficios para la salud digestiva y la piel.",
    4
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de chía",
    2.50,
    "kg",
    100,
    3,
    "Semilla rica en omega-3, fibra y antioxidantes.",
    "Ayuda a mejorar la digestión y reducir la inflamación.",
    6
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de lino",
    2.00,
    "kg",
    120,
    3,
    "Semilla rica en fibra, omega-3 y antioxidantes.",
    "Mejora la digestión y promueve la salud del corazón.",
    7
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de sésamo",
    1.70,
    "kg",
    180,
    3,
    "Semilla rica en calcio, hierro y antioxidantes.",
    "Contribuye a la salud ósea y mejora el sistema inmunológico.",
    2
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de amapola",
    2.20,
    "kg",
    90,
    3,
    "Semilla rica en antioxidantes y minerales.",
    "Ayuda a mejorar la salud digestiva y la piel.",
    8
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de quinoa",
    3.00,
    "kg",
    80,
    3,
    "Semilla rica en proteínas completas, fibra y minerales.",
    "Beneficios para la salud muscular y digestiva.",
    3
);

INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUE (
    "Semilla de amaranto",
    2.80,
    "kg",
    70,
    3,
    "Semilla rica en proteínas, hierro y calcio.",
    "Ayuda a mejorar la salud ósea y cardiovascular.",
    9
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Composta Orgánica",
    150.00,
    "kg",
    100,
    4,
    "Mezcla de materia orgánica 100% natural, ideal para enriquecer el suelo y mejorar la fertilidad.",
    "Aporta nutrientes esenciales a la tierra, mejora la retención de agua y fomenta la actividad microbiana beneficiosa.",
    3
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Mermelada de Fresa Orgánica",
    85.00,
    "tarro",
    100,
    3,
    "Mermelada artesanal elaborada con fresas orgánicas y endulzada con piloncillo.",
    "Conserva el sabor y los nutrientes de la fruta sin conservadores artificiales. Rica en antioxidantes y vitamina C.",
    10
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Humus de Lombriz",
    120.00,
    "kg",
    100,
    4,
    "Abono orgánico 100% natural obtenido a partir del proceso de lombricomposta, ideal para enriquecer la tierra.",
    "Mejora la estructura del suelo, aumenta la retención de agua y promueve el crecimiento de microorganismos beneficiosos.",
    7
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Conserva de Chiles en Vinagre",
    95.00,
    "frasco",
    100,
    3,
    "Chiles jalapeños en conserva con zanahorias, cebolla y especias, preparados de manera artesanal.",
    "Ricos en vitamina C y capsaicina, ideales para acompañar comidas y aportar un toque picante y ácido.",
    2
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Composta de Residuos de Café",
    135.00,
    "kg",
    100,
    4,
    "Abono natural elaborado con residuos de café, ideal para mejorar la fertilidad del suelo y el crecimiento de las plantas.",
    "Aporta nitrógeno, mejora la retención de humedad y fomenta la actividad microbiana beneficiosa en la tierra.",
    4
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Miel Orgánica Multifloral",
    180.00,
    "tarro",
    100,
    3,
    "Miel pura y sin aditivos, obtenida de colmenas ubicadas en ecosistemas agroecológicos.",
    "Rica en antioxidantes, enzimas naturales y propiedades antibacterianas.",
    6
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Bokashi Casero",
    200.00,
    "kg",
    100,
    4,
    "Abono fermentado elaborado con salvado de trigo, melaza y microorganismos benéficos.",
    "Aporta microorganismos que mejoran la salud del suelo, favorece la descomposición de materia orgánica y aumenta la disponibilidad de nutrientes.",
    8
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Conserva de Nopales en Salmuera",
    70.00,
    "frasco",
    100,
    3,
    "Nopales tiernos en conserva de agua y sal, listos para su consumo en ensaladas, guisados o como acompañamiento.",
    "Ricos en fibra, antioxidantes y compuestos que regulan los niveles de glucosa en sangre.",
    9
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Composta de Residuos de Cacao",
    145.00,
    "kg",
    100,
    4,
    "Abono orgánico elaborado con cáscaras de cacao, ideal para enriquecer suelos y promover el crecimiento saludable de las plantas.",
    "Aporta nutrientes esenciales como potasio, fósforo y calcio. Mejora la estructura del suelo y favorece la actividad microbiana.",
    1
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Chutney de Mango Orgánico",
    130.00,
    "tarro",
    100,
    3,
    "Chutney artesanal elaborado con mango de temporada, especias y vinagre natural.",
    "Alto en antioxidantes, vitamina C y probióticos naturales debido a su proceso de fermentación.",
    10
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Abono Orgánico con Residuos de Cítricos",
    160.00,
    "kg",
    100,
    4,
    "Fertilizante natural hecho a base de cáscaras de naranja y limón, ideal para suelos ácidos.",
    "Aporta ácido cítrico natural, mejora la textura del suelo y repele plagas de manera ecológica.",
    3
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Jitomates Deshidratados en Aceite de Oliva",
    155.00,
    "frasco",
    100,
    3,
    "Jitomates deshidratados al sol y conservados en aceite de oliva con hierbas aromáticas.",
    "Ricos en licopeno, vitamina A y antioxidantes naturales. Excelente fuente de sabor para ensaladas y platillos mediterráneos.",
    5
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Fertilizante Orgánico de Algas Marinas",
    175.00,
    "litro",
    100,
    4,
    "Abono líquido elaborado a partir de algas marinas, rico en minerales y hormonas naturales de crecimiento.",
    "Mejora la absorción de nutrientes, estimula el crecimiento radicular y fortalece la resistencia de las plantas.",
    7
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Pepinillos Orgánicos en Salmuera",
    90.00,
    "frasco",
    100,
    3,
    "Pepinillos encurtidos en una mezcla de sal, vinagre de manzana y especias naturales.",
    "Ricos en probióticos naturales, ideales para la digestión y la salud intestinal.",
    2
);
INSERT INTO products (
    product_name,
    price,
    unit,
    stock,
    fk_category_id,
    description,
    benefits,
    fk_producer_id
) VALUES (
    "Biochar para Enriquecimiento del Suelo",
    190.00,
    "kg",
    100,
    4,
    "Carbón vegetal activado para mejorar la retención de agua y nutrientes en el suelo.",
    "Ayuda a reducir la erosión, mejora la fertilidad del suelo y captura carbono de la atmósfera.",
    4
);









