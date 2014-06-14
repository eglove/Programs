CREATE TABLE easy_drinks
(
	drink_name VARCHAR(16) NOT NULL,
	main VARCHAR(20) NOT NULL,
	amount1 DEC (3,1),
	second VARCHAR(20),
	amount2 DEC(4,2),
	directions VARCHAR(250)
);

INSERT INTO easy_drinks
VALUES
('Blackthorn', 'tonic water', 1.5, 'pineapple juice', 1, 'stir with ice, strain into cocktail glass with lemon twist'),
('Blue Moon', 'soda', 1.5, 'blueberry juice', .75, 'stir with ice, strain into cocktail glass with lemon twist'),
('Oh My Gosh', 'peach nectar', 1, 'pineapple juice', 1, 'stir with ice, strain into shot glass'),
('Lime Fizz', 'Sprite', 1.4, 'lime juice', .75, 'stir with ice, strain into cocktail glass'),
('Kiss on the Lips', 'cherry juice', 2, 'apricot nectar', 7, 'serve over ice with straw'),
('Hot Gold', 'peach nectar', 3, 'orange juice', 6, 'pour hot orange juice in mug and add peach nectar'),
('Lone Tree', 'soda', 1.5, 'cherry juice', .75, 'stir with ice, strain into cocktail glass'),
('Greyhound', 'soda', 1.5, 'grapefruit juice', 5, 'serve over ice, stir well'),
('Indian Summer', 'apple juice', 2, 'hot tea', 6, 'add juice to mug and top off with hot tea'),
('Bull Frong', 'iced tea', 1.5, 'lemonade', 5, 'serve over ice with lime slice'),
('Sodea and It', 'soda', 2, 'grape juice', 1, 'shake in cocktail glass, no ice');