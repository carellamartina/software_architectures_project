-- Populate the 'products' table
INSERT INTO product(product_id, name, weight) VALUES
                                                  (default, 'Parmigiano Reggiano', 800),
                                                  (default, 'Mozzarella', 200),
                                                  (default, 'Gorgonzola Dolce', 150),
                                                  (default, 'Ricotta', 300),
                                                  (default, 'Pecorino Romano', 750),
                                                  (default, 'Grana Padano', 630);

-- Populate the 'reviews' table
INSERT INTO review(review_id, product_id, author, content, subject) VALUES
                                                                        (default, 1, 'Alice', 'An incredibly flavorful cheese, perfect for grating.', 'Italian excellence'),
                                                                        (default, 2, 'Bob', 'The best mozzarella I’ve ever had, with an authentic taste.', 'Delicious and fresh'),
                                                                        (default, 3, 'Charlie', 'Perfect for those who love sweet and intense flavors.', 'Soft Gorgonzola'),
                                                                        (default, 4, 'Diana', 'Very creamy and light, great for desserts and light recipes.', 'Versatile ricotta'),
                                                                        (default, 5, 'Eve', 'A strong-flavored cheese, perfect for rustic dishes.', 'High-quality Pecorino'),
                                                                        (default, 6, 'Sophia', 'A versatile cheese, perfect for both grating and snacking.', 'Classic Grana Padano');

-- Populate the 'recommendations' table
INSERT INTO recommendation(recommendation_id, product_id, author, rating, content) VALUES
                                                                                       (default, 1, 'Frank', 5, 'Perfect for pasta and risottos.'),
                                                                                       (default, 1, 'Grace', 4, 'Highly recommended for appetizers with honey and walnuts.'),
                                                                                       (default, 2, 'Hannah', 5, 'A must-try on pizza.'),
                                                                                       (default, 2, 'Ian', 4, 'Great when served fresh with tomatoes.'),
                                                                                       (default, 3, 'Jack', 4, 'Recommended for risottos and cheese fondue.'),
                                                                                       (default, 3, 'Kathy', 5, 'Excellent with pears and honey.'),
                                                                                       (default, 4, 'Leo', 5, 'Perfect for cheesecakes and creamy desserts.'),
                                                                                       (default, 4, 'Mia', 4, 'Also great as a base for light lasagna.'),
                                                                                       (default, 5, 'Noah', 5, 'Perfect for grating on cacio e pepe pasta.'),
                                                                                       (default, 5, 'Olivia', 4, 'Ideal for those who love strong and intense flavors.'),
                                                                                       (default, 6, 'Ella', 5, 'Great for grating over risottos and soups.'),
                                                                                       (default, 6, 'Mason', 4, 'Pairs wonderfully with balsamic vinegar and prosciutto.');
